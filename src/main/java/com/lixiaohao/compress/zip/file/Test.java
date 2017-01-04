package com.lixiaohao.compress.zip.file;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by lixiaohao on 2017/1/4
 *
 * @Description
 * @Create 2017-01-04 17:28
 * @Company
 */
public class Test {

    @org.junit.Test
    public void compress(){
        File srcFile = new File("C:\\Users\\lixiaohao.ZZGRP\\Desktop\\temp\\zip\\test.txt");
        File zipFile = new File("C:\\Users\\lixiaohao.ZZGRP\\Desktop\\temp\\zip\\newdir\\test.zip");
        try {
            CompressFileUtils.compress(srcFile,zipFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void unCompress(){
        File zipFile = new File("C:\\Users\\lixiaohao.ZZGRP\\Desktop\\temp\\zip\\newdir\\test.zip");
        String path  = "C:\\Users\\lixiaohao.ZZGRP\\Desktop\\temp\\zip\\newdir";
        try {
            CompressFileUtils.unCompress(zipFile,path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
