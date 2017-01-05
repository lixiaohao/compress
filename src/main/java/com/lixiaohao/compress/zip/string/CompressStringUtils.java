package com.lixiaohao.compress.zip.string;


import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by lixiaohao on 2017/1/3
 *
 * @Description
 *
 * 压缩字符串
 * 将压缩后的zip的字节流流解析成字符串
 *
 * @Create 2017-01-03 10:33
 * @Company
 */
public class CompressStringUtils {

    /**
     * 将字符串压缩为byte[]
     * @param entityName
     *          压缩包中文件的名称
     * @param content
     *          需要压缩的字符串
     * @return
     */
    public static byte[] compressToByte(String entityName,String content){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipOutputStream zipOut = new ZipOutputStream(baos);
        try {
            zipOut.putNextEntry(new ZipEntry(entityName));
            byte[] zipBuff = content.getBytes();
            zipOut.write(zipBuff,0,zipBuff.length);
            zipOut.closeEntry();
            zipOut.close();
            //get byte
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /***
     * 将字符串压缩成zip包
     * @param zipName
     *          压缩后文件的完全名称（包含路径）
     * @param entityName
     *          压缩包中文件名称
     * @param content
     *          需要压缩的内容
     */
    public static void compressToZip(String zipName,String entityName,String content){
        try {
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(new File(zipName)));
            zipOut.putNextEntry(new ZipEntry(entityName));
            byte[] zipBuff = content.getBytes();
            zipOut.write(zipBuff,0,zipBuff.length);
            zipOut.closeEntry();
            zipOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将压缩后的byte[]转换抓换成解压后的byte[]
     * @param zipBuff
     *          压缩后的byte
     * @return
     */
    public static byte[] unCompressByteToByte(byte... zipBuff){
        if(zipBuff.length==0)return null;

        ZipInputStream zipIn = new ZipInputStream(new ByteArrayInputStream(zipBuff));
        try {
            ZipEntry zipEntry = zipIn.getNextEntry();
            if(zipEntry ==null) return null;

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            int len = -1;
            while ((len = zipIn.read(buff,0,buff.length)) >0 ){
                baos.write(buff,0,len);
            }
            return  baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 将压缩后的byte[]解压为文件
     * @param path
     *          需要解压到的目录
     * @param zipBuff
     *          压缩后的byte[]
     * @return
     */
    public static void unCompressByteToFile(String path,byte... zipBuff){
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(zipBuff);
            ZipInputStream zipIn = new ZipInputStream(bais);
            ZipEntry zipEntry = null;
           while ((zipEntry = zipIn.getNextEntry()) != null){
               String fileNmae = zipEntry.getName();
               FileOutputStream out = new FileOutputStream(new File(path+"\\"+fileNmae));
               byte[] buff = new byte[1024];
               int len = -1;
               while ((len = zipIn.read(buff,0,buff.length)) >0 ){
                   out.write(buff,0,len);
               }
               out.flush();
               out.close();
           }

            zipIn.close();
            bais.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
