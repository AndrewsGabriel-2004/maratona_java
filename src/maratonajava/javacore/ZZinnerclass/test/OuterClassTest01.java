package maratonajava.javacore.ZZinnerclass.test;

public class OuterClassTest01 {
    private String name = "Monkey D Luffy";

    //Nested Classes
    public class InnerClass {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); //this is the inner object
            System.out.println(OuterClassTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printOuterClassAttribute();

        //or InnerClass inner2 = new OuterClassTest01().new InnerClass();
    }
}
