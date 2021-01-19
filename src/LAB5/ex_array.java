package LAB5;

public class ex_array {
    public static void main(String[] args) {
        //array คือตัวแปรที่สามารถเก็บข้อมูลได้หลายชนิดเดียวกัน
        // เก็บจำนวนข้อมูลตามขนาดของ array
        // แต่ขนาด array ต้องระบุขนาดและขนาดนั้นเปลี่ยนแปลงไม่ได้

        int x = 10;
        x = 20;

        int [] num = new int[5]; //0-999 -> last index == n-1

        //add value to array
        num[4] = 10;
        num[2] = 20;
        num[4] = 100;

        num[1] =num[4] * 2;

        for (int val:num) {
            System.out.println(val);
        }
        //size
        System.out.println(num.length);








    }//m
}//c
