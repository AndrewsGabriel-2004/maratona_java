package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //quantifiers = ? zero or one
        //* zero or more
        //+ one or more
        //{n,m} n to m
        //()
        // | o(v/c)o ovo or oco
        // |
        // $ end line
        //. 1.3 = 123,133,1@3, 1A3 everything between 1 and 3

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: "+ text);
        System.out.println("index: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Positions found: ");

        while (matcher.find()){
            System.out.print(matcher.start()+ " "+matcher.group()+ "\n");
        }

    }
}
