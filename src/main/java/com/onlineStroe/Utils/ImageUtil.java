package com.onlineStroe.Utils;

import com.onlineStroe.component.ImageConfig;
import com.onlineStroe.enty.utils.SpringApplicationContext;
import org.im4java.core.InfoException;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2017/12/2.
 */
public class ImageUtil {

    private static ImageConfig imageConfig = SpringApplicationContext.getBean(ImageConfig.class);
    private static final long SALT=1233251;

    public static void gengerateImage(String moduleName,Long imgId,String srcPath) throws InfoException {
        List<Integer> imageIndexList =imageConfig.getImageIndexList(moduleName);
        if(imageIndexList!=null&&imageIndexList.size()>0){
            for(Integer imageIndex:imageIndexList){
                String newPath=imageConfig.getDestinationBasePath()+"/"+getImageGenerateFileRelativePath(imgId,moduleName,imageIndex);
                doGenerate(moduleName,imageIndex,srcPath,newPath,"75");
            }
        }

    }
    public static void generateDetailImage(String moduleName, Long imgId, String srcPath) throws Exception {
        List<Integer> imageIndexList = imageConfig.getImageIndexList(moduleName);
        if (imageIndexList != null && imageIndexList.size() > 0) {
            for (Integer imageIndex : imageIndexList) {
                String newPath = imageConfig.getDetailDestinationBasePath() + getDetailImageGenerateFileRelativePath(imgId, moduleName, imageIndex);
                doGenerate(moduleName, imageIndex, srcPath, newPath, "75");
            }
        }
    }
    private static String doGenerate(String moduleName,Integer imageIndex,String srcPath,String newPath,String quality) throws InfoException {
        String imageSize=imageConfig.getImageSize(moduleName,imageIndex);
        String [] imageWidthHeight=imageSize.split("[*]]");
        double width=Double.valueOf(imageWidthHeight[0]);
        double height=Double.valueOf(imageWidthHeight[1]);
        GraphicsTools.cutImage(width,height,srcPath,newPath,quality);


        return null;
    }
    private static long XOR(long source) {
        return source ^ SALT;
    };

    private static String toHex32(Long number) {
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

    public static String generateFileName(String moduleName,Long imgId,Integer imageIndex){
        //生成图片的名称
        String imageIndexHex = toHex32(imgId.longValue());
        String fileNameHex = toHex32(imgId ^ 4376823).toLowerCase();
        return (moduleName + imageIndexHex + fileNameHex).toLowerCase() + ".jpg";
    }

    //获得生成图片的路径的存储路径
    public static String getImageGenerateFileRelativePath(Long imgId, String moduleName, Integer imageIndex) {
        StringBuilder path = new StringBuilder();
        path.append(path.append(toHex32(XOR(imgId / 1000000))).append("/").append(toHex32(XOR(imgId.intValue() % 1000000 / 100)))
                .append("/").append(generateFileName(imageConfig.getImageModuleKey(moduleName), imgId, imageIndex)));
        return path.toString().toLowerCase();
    }
    //
    public static String getImageSourceFileRelativePaht(Long imgId){
        StringBuilder path=new StringBuilder();
        path.append(imgId / 1000000).append("/").append(imgId % 1000000 / 100)
                .append("/").append(imgId % 100).append(".jpg");
        return path.toString().toLowerCase();
    }
    //获取生成detail的存储路径
    public static String getDetailImageGenerateFileRelativePath(Long imgId,String moduleName,Integer imageIndex){
        Calendar calendar =Calendar.getInstance();
        String imageFileName=generateFileName(imageConfig.getImageModuleKey(moduleName),imgId,imageIndex);
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
    public static String getImageUrl(String domain, Long imgId, String moduleName, Integer imageIndex) {
        return domain + getImageGenerateFileRelativePath(imgId, moduleName, imageIndex);
    }
    //绝对路径
    public static String getDetailImageSourceFileAbsolutePath(String imgFileName) {
        return imageConfig.getDetailSourceBasePath() + getDetailImageSourceFileRelativePath(imgFileName);
    }

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



}
