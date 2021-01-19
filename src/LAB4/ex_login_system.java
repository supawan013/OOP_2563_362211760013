package LAB4;

import java.util.Scanner;

public class ex_login_system {
    public static void main(String[] args) {
        //login 3
        Scanner sc = new Scanner(System.in);
        int count = 0;
        do{
            System.out.println("Enter user name : ");
            String u = sc.nextLine();
            System.out.println("Enter password  : ");
            String p = sc.nextLine();

            boolean x = checklogin(u,p);
            if (x==true)
            {
                System.out.println("Welcome to RUTS SAIYAI");
                break;
            }
            else {
                count++;
                System.out.println("Username or Password is not correct!");
                if (count==3)
                {
                    System.out.println("Please contact admin.");
                }
            }

        }while(count!=3);

    }//main

    public static boolean checklogin(String u,String p){
        String user = "Admin";
        String password = "1234";

        if (user.equals(user)&&password.equals(password))
        {
            return true;
        }
        else {
            return false;
        }

    }//checklogin
}

