package com.lixiaohao.compress.zip.string;


/**
 * Created by lixiaohao on 2017/1/3
 *
 * @Description
 * @Create 2017-01-03 17:34
 * @Company
 */
public class Test {

    /***
     * 将字符串压缩成zip字节
     */
    public void compressToByte(){
        String entityName = "test.txt";
        byte[] strByte = CompressStringUtils.compressToByte(entityName,pageString);
    }

    /***
     * 将zip字节解压缩
     */
    @org.junit.Test
    public void unCompress(){
        String entityName = "test.txt";
       byte[] strByte = CompressStringUtils.compressToByte(entityName,pageString);
        byte[] unCompress = CompressStringUtils.unCompressByteToByte(strByte);
        System.out.println(new String(unCompress));
    }



    private   final String pageString  = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<html xmlns:og=\"http://ogp.me/ns#\" xmlns:fb=\"http://www.facebook.com/2008/fbml\">\n" +
            "  <head>\n" +
            "    <meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\"/>\n" +
            "    <title>\n" +
            "      Double Side Beadlock Steel Wheels For Suv - Buy Black Car Rims,Wheels 5x108,Alloy Wheels For Volkswagen Product on Alibaba.com\n" +
            "    </title>\n" +
            "    <meta name=\"keywords\" content=\"Double Side Beadlock Steel Wheels For Suv, High Quality Black Car Rims,Wheels 5x108,Alloy Wheels For Volkswagen,Shenzhen L-Easy Auto Ltd.\"/>\n" +
            "    <meta name=\"description\" content=\"Double Side Beadlock Steel Wheels For Suv , Find Complete Details about Double Side Beadlock Steel Wheels For Suv,Black Car Rims,Wheels 5x108,Alloy Wheels For Volkswagen from -Shenzhen L-Easy Auto Ltd. Supplier or Manufacturer on Alibaba.com\"/>\n" +
            "    <link rel=\"shortcut icon\" href=\"//is.alicdn.com/simg/single/icon/favicon.ico\" type=\"image/x-icon\"/>\n" +
            "    <link rel=\"canonical\" href=\"https://www.alibaba.com/product-detail/Double-side-beadlock-steel-wheels-for_60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" href=\"android-app://com.alibaba.intl.android.apps.poseidon/enalibaba/sc-detail?id=60498710816&amp;from=google_www&amp;utm_source=pc&amp;utm_medium=deeplink\"/>\n" +
            "    <link rel=\"alternate\" media=\"only screen and (max-width: 640px)\" href=\"https://m.alibaba.com/product/60498710816/Double-side-beadlock-steel-wheels-for.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"de\" href=\"https://german.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"hi\" href=\"https://hindi.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"ru\" href=\"https://russian.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"pt\" href=\"https://portuguese.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"ko\" href=\"https://korean.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"en\" href=\"https://www.alibaba.com/product-detail/Double-side-beadlock-steel-wheels-for_60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"it\" href=\"https://italian.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"fr\" href=\"https://french.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"es\" href=\"https://spanish.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"ar\" href=\"https://arabic.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"vi\" href=\"https://vietnamese.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"th\" href=\"https://thai.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"ja\" href=\"https://japanese.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"id\" href=\"https://indonesian.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"he\" href=\"https://hebrew.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>\n" +
            "    <link rel=\"alternate\" hreflang=\"nl\" href=\"https://dutch.alibaba.com/product-detail/double-side-beadlock-steel-wheels-for-suv-60498710816.html\"/>";

}
