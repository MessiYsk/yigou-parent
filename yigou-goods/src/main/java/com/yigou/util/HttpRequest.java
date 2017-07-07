package com.yigou.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

/**
 * 发送请求的工具类
 * @author ysk
 * @date 2017年2月15日
 */
public class HttpRequest {

	 /**
    * 向指定 URL 发送POST方法的请求
    * 
    * @param url
    *            发送请求的 URL
    * @param param
    *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
    * @param isproxy
    *               是否使用代理模式
    * @return 所代表远程资源的响应结果
    */
	static boolean proxySet = false;
	static String proxyHost = "127.0.0.1";
	static int proxyPort = 8087;
   public static String sendPost(String url, String param,boolean isproxy,String jsessionID,String contentType) {
       OutputStreamWriter out = null;
       BufferedReader in = null;
       String result = "";
       try {
           URL realUrl = new URL(url);
           HttpURLConnection conn = null;
           if(isproxy){//使用代理模式
               @SuppressWarnings("static-access")
               Proxy proxy = new Proxy(Proxy.Type.DIRECT.HTTP, new InetSocketAddress(proxyHost, proxyPort));
               conn = (HttpURLConnection) realUrl.openConnection(proxy);
           }else{
               conn = (HttpURLConnection) realUrl.openConnection();
           }
           // 打开和URL之间的连接

           // 发送POST请求必须设置如下两行
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("POST");    // POST方法


           // 设置通用的请求属性

           conn.setRequestProperty("accept", "*/*");
           conn.setRequestProperty("connection", "Keep-Alive");
           conn.setRequestProperty("user-agent",
                   "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
           conn.setRequestProperty("Content-Type", contentType);
           conn.setRequestProperty("Cookie", "JSESSIONID="+jsessionID);
           
           conn.connect();

           // 获取URLConnection对象对应的输出流
           out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
           // 发送请求参数
           out.write(param);
           // flush输出流的缓冲
           out.flush();
           // 定义BufferedReader输入流来读取URL的响应
           in = new BufferedReader(
                   new InputStreamReader(conn.getInputStream(),"UTF-8"));
           String line;
           while ((line = in.readLine()) != null) {
               result += line;
           }
       } catch (Exception e) {
           System.out.println("发送 POST 请求出现异常！"+e);
           e.printStackTrace();
       }
       //使用finally块来关闭输出流、输入流
       finally{
           try{
               if(out!=null){
                   out.close();
               }
               if(in!=null){
                   in.close();
               }
           }
           catch(IOException ex){
               ex.printStackTrace();
           }
       }
       return result;
   }


    /**
     * 获取访问用户的客户端IP（适用于公网与局域网）.
     */
    public static final String getIpAddr(final HttpServletRequest request)
            throws Exception {
        if (request == null) {
            throw (new Exception("getIpAddr method HttpServletRequest Object is null"));
        }
        String ipString = request.getHeader("x-forwarded-for");
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            ipString = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            ipString = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isBlank(ipString) || "unknown".equalsIgnoreCase(ipString)) {
            ipString = request.getRemoteAddr();
        }
        ipString = request.getLocalName();

        // 多个路由时，取第一个非unknown的ip
        final String[] arr = ipString.split(",");
        for (final String str : arr) {
            if (!"unknown".equalsIgnoreCase(str)) {
                ipString = str;
                break;
            }
        }
        return ipString;
    }
}
