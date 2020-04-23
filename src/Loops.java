import java.util.Scanner;

public class Loops {

    /*

    Have the user input a number and print all numbers from that input value to 1.
    Have the user enter a number and print the sum of all numbers from that inputted value to 1.*/
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        int sum=0;
        int summation=0;
        //Write a program that prints the numbers 1-10.
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
        //    Write a program that prints the numbers 1-10 backwards.
        for (int i = 10; i >=0 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        //    Write a program that prints all the odd numbers from 1-20.
        for (int i = 1; i <=20 ; i++) {
            if((i%2!=0))
            System.out.print(i+" ");

        }
        System.out.println();
        //    Write a program that prints all the even numbers from 1-20.
        for (int i = 1; i <=20 ; i++) {
            if((i%2)==0)
                System.out.print(i+" ");

        }
        System.out.println();
//prompt the user to enter a number
// print all number from 1 up to the number
        System.out.println("Enter a number");
        int n=scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            //num=scanner.nextInt();
            System.out.print(i+" ");
        }
        System.out.println();
        //    Sum all values from 1-10.
        for (int i = 1; i <=10 ; i++) {
            sum+=i;
        }
        System.out.println("The sum of the number from 1-10 "+ sum);


        System.out.println("Enter a number");
        int number=scanner.nextInt();

        for (int i = 1; i <=number ; i++) {
            //num=scanner.nextInt();
            summation+=i;
        }
        System.out.println("The sum of the number from 1 to "+ number+" "+summation );

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <10 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 5; i >=0 ; i--) {
            for (int j = 0; j<5; j++) {
                if(j<i)
                System.out.print(" ");
                else
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}
