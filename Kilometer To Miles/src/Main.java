import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Kilometer To Miles Converter");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The KM Value:");
        float a=sc.nextFloat();
        double b=(0.621371*a);
        System.out.printf("%s Kilometre is Equal to %s Miles\n",a,b);
        System.out.println("THANK YOU!");

    }
}