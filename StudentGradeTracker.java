import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Declare an array to store grades
        int[] grades = new int[numStudents];

        // Input grades for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Menu to choose from
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. To Calculate the Average.");
            System.out.println("2. To find the Highest Grade.");
            System.out.println("3. To find the Lowest Grade.");
            System.out.println("4. To Exit the program.");

            // Input user choice
            System.out.print("Enter your choice :- ");
            choice = scanner.nextInt();

            // Perform the selected operation using switch case
            switch (choice) {
                case 1:
                    double average = calculateAverage(grades);
                    System.out.println("Average grade: " + average);
                    break;
                case 2:
                    int highest = calculateHighest(grades);
                    System.out.println("Highest grade: " + highest);
                    break;
                case 3:
                    int lowest = calculateLowest(grades);
                    System.out.println("Lowest grade: " + lowest);
                    break;
                case 4:
                    System.out.println("Exiting succesfully");
                    break;
                default:
                    System.out.println("Invalid option ! Please enter the valid option.");
            }

        } while (choice != 4);

        // Close the scanner
        scanner.close();
    }

    // Calculating average
    private static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Calculating highest marks
    private static int calculateHighest(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Calculating lowest marks
    private static int calculateLowest(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
