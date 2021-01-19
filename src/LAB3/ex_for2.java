package LAB3;

import java.util.Scanner;

public class ex_for2 {

    public static void main(String[] args) {
        //1.รับค่าจำนวนเต็มจากผู้ใช้ 5 จำนวน
        //2.หาผลรวมจากข้อมูลทั้งหมด
        //3.หาค่าเฉลี่ยจากทั้งหมด ค่าเฉลี่ย คือ ผลรวมของข้อมทูล/จำนวนข้อมูล
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i <5 ; i++){
            System.out.println("Enter integers: ");
            int num = sc.nextInt();
            total += num;
            //System.out.println("entered : "+ num);
        }
        System.out.println("Total: "+total);
        System.out.println("Average: "+total/5);

        System.out.println("Good bye.");

    }
}
