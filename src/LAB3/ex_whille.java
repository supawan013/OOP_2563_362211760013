package LAB3;

import java.util.Scanner;

public class ex_whille {
    public static void main(String[] args) {
        //ให้รับค่าจำนวนเต็มกับผู้ใช้เรื่อยๆ หากผู้ใช้ป้อนค่าเลข 0 ให้หยุดการทำงงานของลูป while

        Scanner sc = new Scanner(System.in);
        int num = 1;


        while (num !=0){

            System.out.println("Enter integers ");
            num = sc.nextInt();
        }
        System.out.println("Good Bye.");


    }//
}//

