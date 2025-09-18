import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int subCount = scan.nextInt();
        int totalMarks = subCount * 100;

        System.out.println("Enter student marks: ");
        int studentMarks[] = new int[subCount];
        
        for (int i=0; i<subCount; i++) { studentMarks[i] = scan.nextInt(); }

        // Total calculation of marks
        int total = 0;
        for (int i=0; i<subCount; i++) { total += studentMarks[i]; }

        // Average calculation of marks.
        int average = total / subCount;

        System.out.println("Total: " + total + "/" + totalMarks);
        System.out.println("Average: " + average);

        // Grade calculation for each subjects.
        System.out.println("==========Grade Calculation==========");
        for (int i=0; i<subCount; i++) {
            if (studentMarks[i] >= 90) { System.out.println("Grade for Subject " + i + " is: " + "A"); }
            else if (studentMarks[i] >= 70) { System.out.println("Grade for Subject " + i + " is: " + "B"); }
            else if (studentMarks[i] >= 50) { System.out.println("Grade for Subject " + i + " is: " + "C"); }
            else { System.out.println("Grade for Subject " + i + " is: " + "FAIL"); }
        }
        System.out.println("==========Grade Calculation==========");
        scan.close();
    }
}
