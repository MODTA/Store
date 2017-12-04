package com.onlineStroe.Utils;

import org.im4java.core.*;
import org.im4java.process.ArrayListOutputConsumer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/12/2.
 */
public class GraphicsTools {
    //图片裁剪
    //获取图片基本信息
    private static String graphicsMagicKPath = "F://ImageMagick//ImageMagick-6.9.1-Q8";
    public static final String PATHSEPERATOR = "/";

    protected static HashMap<String, String> getBaseInfo(String imgPath) throws InfoException {
        HashMap<String, String> iAttributes;
        try {

            IMOperation op = new IMOperation();
            op.ping();
            op.format("%m\n%w\n%h\n%g\n%W\n%H\n%G\n%z\n%r");
            op.addImage(imgPath);


            IdentifyCmd identify = new IdentifyCmd(true);
            ArrayListOutputConsumer output = new ArrayListOutputConsumer();
            identify.setOutputConsumer(output);
            identify.setSearchPath(graphicsMagicKPath);
            identify.run(op);

            ArrayList<String> cmdOutput = output.getOutput();
            Iterator<String> iter = cmdOutput.iterator();

            iAttributes = new HashMap<String, String>();
            iAttributes.put("Format", iter.next());
            iAttributes.put("Width", iter.next());
            iAttributes.put("Height", iter.next());
            iAttributes.put("Geometry", iter.next());
            iAttributes.put("PageWidth", iter.next());
            iAttributes.put("PageHeight", iter.next());
            iAttributes.put("PageGeometry", iter.next());
            iAttributes.put("Depth", iter.next());
            iAttributes.put("Class", iter.next());
        } catch (Exception ex) {
            throw new InfoException(ex);
        }
        return iAttributes;
    }

    protected static String cutImage(double width, double height, String srcPath, String newPath, String quality) throws InfoException {
        //获取原图信息
        //进行裁剪
        HashMap<String, String> imageInfo = getBaseInfo(srcPath);
        double srcWidth = Double.valueOf(imageInfo.get("Width"));
        double srcHeight = Double.valueOf(imageInfo.get("Height"));

        if (width >= srcWidth && height >= srcHeight) {
            width = srcWidth;
            height = srcHeight;
        } else {
            double temp1 = width / srcWidth;
            double temp2 = height / srcHeight;

            if (temp1 < temp2) {
                height = srcHeight * temp2;
            }
            if (temp2 > temp1) {
                width = srcWidth * temp1;
            }

        }

        IMOperation op = new IMOperation();
        ConvertCmd cmd = new ConvertCmd(true);
        op.addImage();


        String raw = width + "x" + height + "^";
        op.addRawArgs("-sample", raw);
        op.addRawArgs("-gravity", "center");
        op.addRawArgs("-extent", raw);
        if ((quality != null && !quality.equals(""))) {
            op.addRawArgs("-quality", quality);
        }
        op.addImage();
        cmd.setSearchPath(graphicsMagicKPath);
        try {
            File filePath = new File(newPath.substring(0, newPath.lastIndexOf(PATHSEPERATOR)));
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            cmd.run(op, srcPath, newPath);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IM4JavaException e) {
            e.printStackTrace();
        }
        return null;
    }


}
