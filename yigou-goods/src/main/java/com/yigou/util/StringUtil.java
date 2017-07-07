package com.yigou.util;
/**
 * 字符串处理的工具类
 * Modified By 川军六十六师.
 * Since 2017/6/24 17:01.
 */
public class StringUtil {

	/**
	 * 将以逗号分隔的字符串转换成字符串数组
	 * @param valStr
	 * @return String[]
	 */
	public static String[] StrList(String valStr){
	    int i = 0;
	    String TempStr = valStr;
	    String[] returnStr = new String[valStr.length() + 1 - TempStr.replace(",", "").length()];
	    valStr = valStr + ",";
	    while (valStr.indexOf(',') > 0)
	    {
	        returnStr[i] = valStr.substring(0, valStr.indexOf(','));
	        valStr = valStr.substring(valStr.indexOf(',')+1 , valStr.length());
	        
	        i++;
	    }
	    return returnStr;
	}
	
	/**获取字符串编码
	 * @param str
	 * @return
	 */
	public static String getEncoding(String str) {      
	       String encode = "GB2312";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      
	               String s = encode;      
	              return s;      
	           }      
	       } catch (Exception exception) {      
	       }      
	       encode = "ISO-8859-1";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      
	               String s1 = encode;      
	              return s1;      
	           }      
	       } catch (Exception exception1) {      
	       }      
	       encode = "UTF-8";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      
	               String s2 = encode;      
	              return s2;      
	           }      
	       } catch (Exception exception2) {      
	       }      
	       encode = "GBK";      
	      try {      
	          if (str.equals(new String(str.getBytes(encode), encode))) {      
	               String s3 = encode;      
	              return s3;      
	           }      
	       } catch (Exception exception3) {      
	       }      
	      return "";      
	   }
	/**
	 * 删除一个字符串中开头和结尾和中间多余的符号、类如 “++黑+32g+” = “黑+32g”
	 *
	 */
	public static String replaceChar (char x,String str){
		if(str==null||str.equals("")) return str;
		char op[] = str.toCharArray();
		for(int i=0;i<op.length-1;i++)
		{
			if(op[i]==op[i+1]&&op[i]==x)
				op[i]='"';
		}
		if(op[0]==x)
			op[0]='"';
		if(op[0]=='"'&&op[1]==x)
			op[1]='"';
		if(op[op.length-1]==x)
			op[op.length-1]='"';
		str = String.valueOf(op);
		str = str.replace("\"","");
		return str;
	}

	/**
	 * 拼接字符串左模糊查询，%str
	 * @param str
	 * @return
     */
	public static String sqlLikeLeft(String str){
		return "%"+str;
	}

	/**
	 * 拼接字符串右模糊查询，str%
	 * @param str
	 * @return
     */
	public static String sqlLikeRight(String str){
		return str+"%";
	}

	/**
	 * 拼接整个字符串模糊查询 %str%
	 * @param str
	 * @return
     */
	public static String sqlLikeAll(String str){
		return "%"+str+"%";
	}
}
