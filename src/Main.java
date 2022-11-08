import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double score;

        System.out.println("Enter test score");
        score = input.nextDouble();

        if (score< 60) {
            System.out.println("Your grade is F. ");

        }else if (score < 70) {
            System.out.println("Your grade is D. ");

        }else if(score< 80) {
            System.out.println("Your grade is C. ");

        }else if(score < 90) {
            System.out.println("Your grade is B. ");

        }else {
            System.out.println("Your grade is A. ");
        }
    }
}