package maratonajava.javacore.Gassociacao.domain;

public class School {
    private String name;
    private Teacher [] teachers;

    //constructor
    public School(String name) {
        this.name = name;

    }


    public void print(){
        System.out.println(this.name);
        if(teachers == null){
            return;
        }else {
            for (Teacher teacher : teachers) {
                System.out.println(teacher.getName());
            }
        }
    }

    //getter && setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}