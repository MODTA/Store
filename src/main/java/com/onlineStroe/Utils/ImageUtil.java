package com.onlineStroe.Utils;

import com.onlineStroe.component.ImageConfig_unuse;
import com.onlineStroe.enty.utils.SpringApplicationContext;
import org.im4java.core.InfoException;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2017/12/2.
 */
public class ImageUtil {

    private static ImageConfig_unuse imageConfigUnuse = SpringApplicationContext.getBean(ImageConfig_unuse.class);
    private static final Integer SALT=1233251;

    public static void gengerateImage(String moduleName,Integer imgId,String srcPath) throws InfoException {
        List<Integer> imageIndexList = imageConfigUnuse.getImageIndexList(moduleName);
        if(imageIndexList!=null&&imageIndexList.size()>0){
            for(Integer imageIndex:imageIndexList){
                String newPath= imageConfigUnuse.getDestinationBasePath()+"/"+getImageGenerateFileRelativePath(imgId,moduleName,imageIndex);
                doGenerate(moduleName,imageIndex,srcPath,newPath,"75");
            }
        }

    }
    public static void generateDetailImage(String moduleName, Integer imgId, String srcPath) throws Exception {
        List<Integer> imageIndexList = imageConfigUnuse.getImageIndexList(moduleName);
        if (imageIndexList != null && imageIndexList.size() > 0) {
            for (Integer imageIndex : imageIndexList) {
                String newPath = imageConfigUnuse.getDetailDestinationBasePath() + getDetailImageGenerateFileRelativePath(imgId, moduleName, imageIndex);
                doGenerate(moduleName, imageIndex, srcPath, newPath, "75");
            }
        }
    }
    private static String doGenerate(String moduleName,Integer imageIndex,String srcPath,String newPath,String quality) throws InfoException {
        String imageSize= imageConfigUnuse.getImageSize(moduleName,imageIndex);
        String [] imageWidthHeight=imageSize.split("[*]]");
        double width=Double.valueOf(imageWidthHeight[0]);
        double height=Double.valueOf(imageWidthHeight[1]);
        GraphicsTools.cutImage(width,height,srcPath,newPath,quality);


        return null;
    }


    public static String generateFileName(String moduleName,Integer imgId,Integer imageIndex){
        //生成图片的名称
        String imageIndexHex = toHex32(imageIndex.intValue());
        String fileNameHex = toHex32(imgId ^ 4376823).toLowerCase();
        return (moduleName + imageIndexHex + fileNameHex).toLowerCase() + ".jpg";
    }

    //获得生成图片的路径的存储路径
    public static String getImageGenerateFileRelativePath(Integer imgId, String moduleName, Integer imageIndex) {
        StringBuilder path = new StringBuilder();
        path.append(path.append(toHex32(XOR(imgId / 1000000))).append("/").append(toHex32(XOR(imgId.intValue() % 1000000 / 100)))
                .append("/").append(generateFileName(imageConfigUnuse.getImageModuleKey(moduleName), imgId, imageIndex)));
        return path.toString().toLowerCase();
    }
    //
    public static String getImageSourceFileRelativePath(Integer imgId){
        StringBuilder path=new StringBuilder();
        path.append(imgId / 1000000).append("/").append(imgId % 1000000 / 100)
                .append("/").append(imgId % 100).append(".jpg");
        return path.toString().toLowerCase();
    }
    //获取生成detail的存储路径
    public static String getDetailImageGenerateFileRelativePath(Integer imgId,String moduleName,Integer imageIndex){
        Calendar calendar =Calendar.getInstance();
        String imageFileName=generateFileName(imageConfigUnuse.getImageModuleKey(moduleName),imgId,imageIndex);
        StringBuilder path=new StringBuilder();
        path.append(calendar.get(Calendar.YEAR)).append("/").
                append(getMonthDay(calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH))).append("/").
                append(imageFileName);
        return path.toString();
    }
    //获取原存储路径
    public static String getDetailImageSourceFileRelativePath(String imgFileName) {
        StringBuilder sb = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        sb.append(calendar.get(Calendar.YEAR)).append("/")
                .append(getMonthDay(calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH))).append("/").append(imgFileName);
        return sb.toString();
    }
    //h
    public static String getImageUrl(String domain, Integer imgId, String moduleName, Integer imageIndex) {
        return domain + getImageGenerateFileRelativePath(imgId, moduleName, imageIndex);
        //地址//deal//01//尺寸
    }
    //绝对路径
    public static String getDetailImageSourceFileAbsolutePath(String imgFileName) {
        return imageConfigUnuse.getDetailSourceBasePath() + getDetailImageSourceFileRelativePath(imgFileName);
    }

    public static String getImageSourceFileAbsolutePath(Integer imgId) {
        return imageConfigUnuse.getSourceBasePath() + getImageSourceFileRelativePath(imgId);
    }



//======================混用





    //调整日期
    private static String getMonthDay(int month, int day) {
        String monthDay;
        if (month < 9) {
            monthDay = "0" + (month + 1);
        } else {
            monthDay = (month + 1) + "";
        }
        if (day < 10) {
            monthDay = monthDay + "0" + day;
        } else {
            monthDay = monthDay + day;
        }
        return monthDay;
    }

    private static Integer XOR(Integer source) {
        return source ^ SALT;
    };

    private static String toHex32(Integer number) {
        String result = "";
        if (number <= 0) {
            return "0";
        } else {
            while (number != 0) {
                result = "0123456789ABCDEFGHIJKLMNOPQRSTUV".substring((int)(number % 32), (int)(number % 32 + 1)) + result;
                number = number / 32;
            }
            return result;
        }
    }

}
