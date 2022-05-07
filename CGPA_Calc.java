import java.util.Scanner;

public class CGPA_Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input obtained GPA in");
        System.out.print("CSE1203 : ");
        float E1 = sc.nextFloat();
        System.out.print("EEE1216 : ");
        float E2 = sc.nextFloat();
        System.out.print("CSE1206 : ");
        float E3 = sc.nextFloat();
        System.out.print("EEE1215 : ");
        float P1 = sc.nextFloat();
        System.out.print("ME1215 : ");
        float C1 = sc.nextFloat();
        System.out.print("MATH1211 : ");
        float M1 = sc.nextFloat();
        System.out.print("ME1216 : ");
        float P2 = sc.nextFloat();
        System.out.print("CSE1205 : ");
        float H1 = sc.nextFloat();
        System.out.print("CSE1200 : ");
        float H2 = sc.nextFloat();
        float CGPA = (float) ((((E1 + P1 + C1 + M1 + H1) * 3) + ((E2 + E3 + H2) * 1.5) + (P2 * 0.75)) / (float) 20.25);
        System.out.println("Your CGPA is : " + CGPA);
        if (CGPA == 4.0) {
            System.out.println("You are in A+");
        } else if (CGPA >= 3.75) {
            System.out.println("You are in A");
        } else if (CGPA >= 3.5) {
            System.out.println("You are in A-");
        } else if (CGPA >= 3.25) {
            System.out.println("You are in B+");
        } else if (CGPA >= 3.0) {
            System.out.println("You are in B");
        } else if (CGPA >= 2.75) {
            System.out.println("You are in B-");
        } else if (CGPA >= 2.5) {
            System.out.println("You are in C+");
        } else if (CGPA >= 2.25) {
            System.out.println("You are in C");
        } else if (CGPA >= 2.0) {
            System.out.println("You are in D");
        } else {
            System.out.println("You are in F");
        }
    }

}
