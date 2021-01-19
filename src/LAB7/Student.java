package LAB7;

public class Student {
    static String faculty = "MT RUTS";
    String name;
    int age;
    String major;

    //behavior
    public void introduce(){
        System.out.println("My name is "+name);
        System.out.println("I am "+age+ " Years Old");
        System.out.println("I studing in "+major);
        System.out.println("Faculty : "+faculty);
    }
    public void changeFaculty(String newfac){
        faculty = newfac;
    }
}