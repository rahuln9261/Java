import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sum Of Three Numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1:");
        float a=sc.nextFloat();
        System.out.println("Enter Number 2:");
        float b=sc.nextFloat();
        System.out.println("Enter Number 3:");
        float c=sc.nextFloat();
        System.out.println("The Sum is:");
        float Sum=(a+b+c);
        System.out.println(Sum);


    }
}