package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //[] = range of characters
        // String regex = "[a-zA-C]";
        //String text = "abaaba";
        String regex = "0[xX][0-9a-fA-F]";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("text: "+ text2);
        System.out.println("index: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Positions found: ");

        while (matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+ "\n");
        }
        int numberHEX = 0x109; //or 0X59F86A
        System.out.println(numberHEX);
    }
}
