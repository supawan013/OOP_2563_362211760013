package LAB4;

import java.util.Scanner;

    public class ex_check_number {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num,result;

            for (int i = 0; i <10 ; i++) {
                System.out.print("Enter integer : ");
                num = scanner.nextInt();
                checkvalue(num);
            }
        }//main
        public static void checkvalue(int num){
            if(num%2==0)
            {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }//checkvalue
    }
