package LAB5;
//เขียนโปรแกรมรับค่าข้อมูลผู้ใช้ 5ส่วน

import java.util.Scanner;

public class ex_array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num[] =new  int[5];

        num = inputData(num);
        // dis
        displayArray(num);
        //total
        int total = totalValue(num);
        System.out.println("Total value in array: ");
        //Average value in array
        System.out.println("Average value in array:"+(total/num.length));

        //find
        findMax(num);
        //minmum
        findMin(num);
    }

    private static void findMin(int[] num) {
        int min = num[0];
        for (int v:num) {
            if (min<v)
                min= v;

        }
        System.out.println("The max");
    }


    private static void findMax(int[] num) {
        int max = num[0];
        for (int v:num) {
            if (max<v)
                max = v;

        }
        System.out.println("The max");
    }


    private static int totalValue(int[] num) {
        int total = 0;
        for (int v:num) {
            total +=v;

        }
        return total;
    }

    private static void displayArray(int[] num) {
        System.out.println("Data in array");
        for (int v:num) {
            System.out.print(v+"");

        }
    }

    private static int[] inputData(int[] num) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter integer: ");
            num[i] = sc.nextInt();
        }
        return num;

    }
}
