package LAB8;

import LAB7.Car;
import java.util.ArrayList;
import java.util.Scanner;


public class CompanyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employee do you have? : ");
        int num = sc.nextInt();

        ArrayList<Employee> myEmp = new ArrayList<Employee>();
        for (int i = 0; i < num; i++) {
            //input data to object
            System.out.println("Please enter employee info "+(i+1)+":");
            Employee em = inputDataObject();
            myEmp.add(em);

        }
        displayObject(myEmp);
    }

    private static void displayObject(ArrayList<Employee> myEmp) {
        System.out.println("All object in Arraylist : ");
        for (Employee em:myEmp) {
            System.out.println(em.toString());

        }
    }

    private static Employee inputDataObject() {
        Scanner sc = new Scanner(System.in);
        Employee em = new Employee();

        System.out.print("Enter pid : ");
        String pid = sc.nextLine();
        em.setPid(pid);

        System.out.print("Enter name : ");
        String name = sc.nextLine();
        em.setName(name);

        System.out.print("Enter age : ");
        int age = Integer.parseInt(sc.nextLine());
        em.setAge(age);

        System.out.print("Enter gender : ");
        String gender = sc.nextLine();
        em.setGender(gender);

        System.out.print("Enter Tel : ");
        String tel = sc.nextLine();
        em.setTel(tel);

        System.out.print("Enter emp id : ");
        String emp_id = sc.nextLine();
        em.setEmpID(emp_id);

        System.out.print("Enter position : ");
        String position = sc.nextLine();
        em.setPosition(position);

        System.out.print("Enter salary : ");
        double salary = Double.parseDouble(sc.nextLine());
        em.setSalary(salary);


        return em;
    }


}




        /*Employee emp1 = new Employee();
        emp1.setPid("0123456789012");
        emp1.setName("Adithep Chuklin");
        emp1.setAge(22);
        emp1.setGender("Male");
        emp1.setTel("0612161041");
        emp1.setEmpID("MIT015");
        emp1.setPosition("Student");
        emp1.setSalary(3500.00);
        //display object data
        System.out.println(emp1.toString());*/