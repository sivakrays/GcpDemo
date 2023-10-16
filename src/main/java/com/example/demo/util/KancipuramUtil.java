package com.example.demo.util;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class KancipuramUtil {

    public static String getResponse(String response, String keyWord) {
        int start = response.indexOf(keyWord);  //"<div class=\"wrapper-devanagari\">"
        int end ;
        if(start<0){
            end = -67290;
        }else {
             end = start+10000;
        }

        String newResponse = response.substring(start, end);

        //   String singleLine=  newResponse.replaceAll("\\n|\\r\\n", "");

        String startMatcher = "<div";
        String endMatcher = " </div>\n";

        Pattern patternStart = Pattern.compile(startMatcher);
        Pattern patternEnd = Pattern.compile(endMatcher);

        Matcher matcherStart = patternStart.matcher(newResponse);
        Matcher matcherEnd = patternEnd.matcher(newResponse);
        int startCount = 0;
        int endCount = 0;
        String ResponsesubString = "";
        if (matcherEnd.find()) {
            startCount++;
            matcherEnd.start();

            ResponsesubString = newResponse.substring(0, matcherEnd.start());
        }

        return ResponsesubString;
    }

}
