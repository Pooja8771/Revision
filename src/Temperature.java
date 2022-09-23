import java.util.Scanner;

public class Temperature {

    // Java program to take temperature from user in celsius and convert it into Fahrenheit.
    // Formula= 9*c/5+32

    public static void main(String[] args) {
        int C;
        float F;
        Scanner sc=new Scanner(System.in); // input to be taken from user
        C= sc.nextInt();
        F = 9* (float)C/5+32;    //typecasting of int to float
        System.out.println(F);
    }
}
