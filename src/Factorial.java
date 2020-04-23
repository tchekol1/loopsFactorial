import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int product=1;
        System.out.println("Enter a number ");
        int number= scanner.nextInt();
        System.out.println("The Factorial of "+ number+" ");
        while (number>0){
            System.out.print(number+ " ");
            product*=number;
            number--;
        }
        System.out.print("= "+product);
    }
}



