import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome To Cbse Percentage Calculator");
        System.out.println("This Calculator Will Calculate Marks of 5 Subjects Only");
        System.out.println("Max Marks Considered is 100");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Subject 1 Marks:");
        int s1= sc.nextInt();
        System.out.println("Enter Subject 2 Marks:");
        int s2= sc.nextInt();
        System.out.println("Enter Subject 3 Marks:");
        int s3= sc.nextInt();
        System.out.println("Enter Subject 4 Marks:");
        int s4= sc.nextInt();
        System.out.println("Enter Subject 5 Marks:");
        int s5= sc.nextInt();
        int sum=(s1+s2+s3+s4+s5);
        System.out.println("The Total Marks Are:");
        System.out.println(sum);
        System.out.println("The Percentage Is:");
        float s=(sum/5f);
        System.out.println(s); System.out.println("Percentage");

    }
}