package practice;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRepository grades = new GradeRepository();
        // Write your program here -- consider breaking the program into
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            }

            if (input < 0 || input > 100){
                continue;
            }

            Grade grade = new Grade(input);
            grades.addGrade(grade);
        }
        System.out.println("Point average (all): " + grades.pointsAverage());
        System.out.println("Point average (passing): " + grades.passingPointsAverage());
        System.out.println("Pass percentage: " + grades.passPercentage());
        System.out.println("Grade distribution:");
        System.out.println(grades.getGradeDistribution());
    }
}
