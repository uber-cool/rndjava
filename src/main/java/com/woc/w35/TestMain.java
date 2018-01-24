package com.woc.w35;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {

    public static Logger log = LoggerFactory.getLogger(TestMain.class);

    public static final String REQUEST_METHOD = "Request Method: ";
    public static final String REQUEST_URL = "Request URL: ";
    public static final String REQUEST_HEADERS = "Request headers: ";
    public static final String REQUEST_BODY = "Request body: ";
    public static final String RESPONSE_CODE = "Response code: ";
    public static final String RESPONSE_HEADERS = "Response headers: ";
    public static final String RESPONSE_BODY = "Response body: ";

    public static void main(String[] args) {
        String a = REQUEST_METHOD + "method" + "\n" +
            REQUEST_URL + " endpoint \n asdf" + "\n" +
            REQUEST_HEADERS + "headers" + "\n" +
            REQUEST_BODY + "body";

        int urlStart = a.indexOf(REQUEST_URL);
        int headerStart = a.indexOf(REQUEST_HEADERS);
        int bodyStart = a.indexOf(REQUEST_BODY);

        String method = a.substring(REQUEST_METHOD.length(), urlStart).trim();
        System.out.println("*" + method+ "*");
        String url = a.substring(urlStart + REQUEST_URL.length(), headerStart).trim();
        System.out.println("*" + url + "*");
        String headers = a.substring(headerStart + REQUEST_HEADERS.length(), bodyStart).trim();
        System.out.println(headers);
        String body = a.substring(bodyStart + REQUEST_BODY.length() ).trim();
        System.out.println(body);

        String b = RESPONSE_CODE + "this.responseCode" + "\n" +
            RESPONSE_HEADERS + "this.responseHeader" + "\n" +
            RESPONSE_BODY + "this.responseBody";

        int respHeaderStart = b.indexOf(RESPONSE_HEADERS);
        int respBodyStart = b.indexOf(RESPONSE_BODY);

        String respCode = b.substring(RESPONSE_CODE.length(), respHeaderStart).trim();
        String respHeaders = b.substring(respHeaderStart + RESPONSE_HEADERS.length(), respBodyStart).trim();
        String respBody = b.substring(respBodyStart + RESPONSE_BODY.length()).trim();

        System.out.println(respCode);
        System.out.println(respHeaders);
        System.out.println(respBody);

        String s = "sadsa:";
        System.out.println(s);
        System.out.println(s.trim().substring(s.indexOf(":") + 1));

        log.info(s);
    }
}
