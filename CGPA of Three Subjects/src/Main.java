import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("CGPA CALCULATOR");
        System.out.println("Takes Input Of Three Subjects and Print CGPA");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1:");
        int a=sc.nextInt();
        System.out.println("Enter Marks of Subject 2:");
        int b=sc.nextInt();
        System.out.println("Enter Marks of Subject 3:");
        int c=sc.nextInt();
        double sum=((a+b+c)/3.0);
        double cgpa=(sum/9.5);
        System.out.println("Your CGPA IS:");
        System.out.println(cgpa);




    }
}