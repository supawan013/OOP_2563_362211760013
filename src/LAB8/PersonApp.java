package LAB8;

public class PersonApp {
    public static void main(String[] args) {


        //objects

        Person p1 = new Person();
        p1.setName("supawan");
        p1.setAge(21);

        Person p2 = new Teacher("RUTS");
        p2.setName("Film");
        p2.setAge(21);


        Person p3 = new Doctor("Thungsong");
        p3.setName("Mukda");
        p3.setAge(22);

        //call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();

    }
}
