package maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "William Suane";
        name.concat(" DevDojo");
        name = name.substring(0,4);
        System.out.println(name);

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");
        String substring = sb.substring(0,4);
        sb.reverse();
        sb.reverse();
        sb.delete(0,4);
        System.out.println(sb);


    }
}
