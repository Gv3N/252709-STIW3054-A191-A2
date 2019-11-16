package com.baktajivan;
//imports
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public boolean regex (String pattern, String link) {

        Pattern patn = Pattern.compile(pattern);
        Matcher mtr = patn.matcher(link);

        return mtr.find();
    }//regex
}//RegexMatches