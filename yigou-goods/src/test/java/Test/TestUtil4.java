package Test;

import com.yigou.util.HttpRequest;
import org.junit.Test;

/**
 * Author 川军六十六师
 * Since 2017/6/28 11:03.
 */
public class TestUtil4 {

    @Test
    public void test1() {

        String param4 = "{\n" +
                "    \"name\": \"三星NOTE8++\",\n" +
                "    \"cate\": \"00100\",\n" +
                "    \"isSucceed\": 1,\n" +
                "    \"params\": [\n" +
                "        {\n" +
                "            \"id\": \"1\",\n" +
                "            \"title\": \"清晰度\",\n" +
                "            \"value\": \"2K\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": \"2\",\n" +
                "            \"title\": \"网络制式\",\n" +
                "            \"value\": \"全网通\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"productNo\": \"2012331240067\",\n" +
                "    \"specs\": [\n" +
                "        {\n" +
                "            \"names\": [\n" +
                "                \"白色\",\n" +
                "                \"红色\"\n" +
                "            ],\n" +
                "            \"ids\": [\n" +
                "                \"1\",\n" +
                "                \"2\"\n" +
                "            ],\n" +
                "            \"title\": \"颜色\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"names\": [\n" +
                "                \"4G\",\n" +
                "                \"8G\"\n" +
                "            ],\n" +
                "            \"ids\": [\n" +
                "                \"1\",\n" +
                "                \"2\"\n" +
                "            ],\n" +
                "            \"title\": \"内存\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        String sendPost = HttpRequest.sendPost("http://localhost:8086/product/add", param4, false, null,"application/json");

        System.out.println(sendPost);

    }
}
