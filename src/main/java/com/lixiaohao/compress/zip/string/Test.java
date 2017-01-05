package com.lixiaohao.compress.zip.string;


/**
 * Created by lixiaohao on 2017/1/3
 *
 * @Description
 * @Create 2017-01-03 17:34
 * @Company
 */
public class Test {

    public void compressToByte(){
        String entityName = "test3.txt";
        byte[] strByte = CompressStringUtils.compressToByte(entityName,StringFinal.pageString);
    }

    @org.junit.Test
    public void unCompress(){
        String entityName = "test3.txt";
       byte[] strByte = CompressStringUtils.compressToByte(entityName,StringFinal.pageString);
        byte[] unCompress = CompressStringUtils.unCompressByteToByte(strByte);
        System.out.println(new String(unCompress));
    }


}
