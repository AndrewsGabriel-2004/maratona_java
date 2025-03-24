package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //find some specific aspect in the middle of several information
        //\d = every digits
        //\D = not digit
        //\s = every void space \t \n \f \r
        //\S = every characters excluding the void spaces
        //\w = a-z/A-Z, digits, _
        // \W = all excludes from \w
        String regex = "\\W";

        String text = "abaaba";
        String text2 = "!HJf@3a#u4hl ohh21kwowf_h54wof";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text: "+ text2);
        System.out.println("index: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Positions found: ");

        while (matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+ "\n");
        }


    }
}
