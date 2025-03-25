package maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "luffy@hotmail.com, 123jotaro@gmail.com, #@zoro@mail.br, teste@gmail.com.br, sakura@mail";

        System.out.println("Email valid: "); //finding patterns
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(text.split(",")));
        System.out.println(text.split(",")[1].trim());

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
