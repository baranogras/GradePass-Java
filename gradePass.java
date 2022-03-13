package Lesson3;
import java.util.Scanner;

public class gradePass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math,physic,turkish,chemistry,music,total=0,average;
        int counter = 0;

        System.out.print("Your Math Grade : ");
        math = input.nextDouble();
        if (math >= 0 && math <= 100) {
            total += math;
            counter++;
        }

        System.out.print("Your Physic Grade : ");
        physic = input.nextDouble();
        if (physic >= 0 && physic <= 100) {
            total += physic;
            counter++;
        }

        System.out.print("Your Turkish Grade : ");
        turkish = input.nextDouble();
        if (turkish >= 0 && turkish <= 100) {
            total += turkish;
            counter++;
        }

        System.out.print("Your Chemistry Grade : ");
        chemistry = input.nextDouble();
        if (chemistry >= 0 && chemistry <= 100) {
            total += chemistry;
            counter++;
        }

        System.out.print("Your Music Grade : ");
        music = input.nextDouble();
        if (music >= 0 && music <= 100) {
            total += music;
            counter++;
        }

        average = total / counter;

        if (average >= 55) {
            System.out.println("Congratulations!! You Have Successfully Passed The Class!");
        } else {
            System.out.println("You Didn't Pass The Class.");
        }
        System.out.println("Your Average : " + average);
    }
}
