package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        //find some specific aspect in the middle of several information
        String regex = "aba";
        String text = "abaaba";
        String text2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text: "+ text2);
        System.out.println("index: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Positions found: ");

        while (matcher.find()){
            System.out.print(matcher.start()+ " ");
        }
    }
}
