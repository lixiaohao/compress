package com.lixiaohao.compress.zip.file;

import java.io.*;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.*;

/**
 * Created by lixiaohao on 2016/12/30
 *将文本文件压缩成zip文件
 * 将压缩后的zip文件解压
 * @Description
 * @Create 2016-12-30 15:16
 * @Company
 */
public class CompressFileUtils {

    /***
     * 将文件压缩为指定文件
     * @param srcFile
     *          需要压缩的文件
     * @param zipFile
     *          压缩后的文件
     * @throws FileNotFoundException
     */
    public static void compress(File srcFile,File zipFile) throws FileNotFoundException {
        if(!srcFile.isFile()) throw new FileNotFoundException("没有找到需要压缩的文件srcFile!,请确认该文件是否存在！");
        FileInputStream in = new FileInputStream(srcFile);
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));
        try {
            out.putNextEntry(new ZipEntry(srcFile.getName()));

            byte[] buff = new byte[1024];
            int len = -1;
            while ((len = in.read(buff,0,buff.length)) >0){
                out.write(buff,0,len);
            }
            out.closeEntry();
            out.close();

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void unCompress(File zip,String path) throws FileNotFoundException {
        if(!zip.isFile())throw new FileNotFoundException("没有找到需要压缩的文件zip!,请确认该文件是否存在！");
        try {
            ZipFile zipFile = new ZipFile(zip);
            Enumeration<ZipEntry> entries = (Enumeration<ZipEntry>)zipFile.entries();
            while (entries.hasMoreElements()){
                ZipEntry zipEntry = entries.nextElement();
                InputStream in = zipFile.getInputStream(zipEntry);
                byte[] buff = new byte[1024];
                int len = -1;
                FileOutputStream out = new FileOutputStream(new File(path+"/"+zipEntry.getName()));
                while ((len = in.read(buff,0,buff.length)) != -1){
                    out.write(buff,0,len);
                }
                out.flush();
                out.close();
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
