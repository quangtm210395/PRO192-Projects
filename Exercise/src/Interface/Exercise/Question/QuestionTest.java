/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Exercise.Question;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Minnn
 */
public class QuestionTest {

    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new ShortAnswerQuestion("Who is the best LOL player?", "Faker"));
        questions.add(new FillInBlankQuestion("Obama is a _____", "president"));
        questions.add(new TrueFalseQuestion("Is Ashimo from Japan?", true));
        questions.add(new ShortAnswerQuestion("Who is PC1015's captain?", "Trieu Nam Hai"));
        questions.add(new TrueFalseQuestion("Anh Hải có tard không?", true));
        questions.add(new FillInBlankQuestion("Thằng tard nhất là thằng _____", "Kien"));

        Scanner sc = new Scanner(System.in);
        int check;
        do {

            System.out.println("Let's go! Press 0 to exit!");
            System.out.print("Please choose Question's Number < 1 - 6 > : ");
            check = sc.nextInt();
            sc.nextLine();
            if (check < 0 || check > 6) {
                System.out.println("Please enter a number between 1 and 6 !!!");
            }
            System.out.println("");
            switch (check) {
                case 0:
                    break;
                case 1:
                    System.out.println(questions.get(0).getQuestion());
                    System.out.print("Enter your answer: ");
                    System.out.println(questions.get(0).checkAnswer(sc.nextLine()));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println(questions.get(1).getQuestion());
                    System.out.print("Enter your answer: ");
                    System.out.println(questions.get(1).checkAnswer(sc.nextLine()));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(questions.get(2).getQuestion());
                    System.out.print("Enter your answer: ");
                    System.out.println(questions.get(2).checkAnswer(sc.nextLine()));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(questions.get(3).getQuestion());
                    System.out.print("Enter your answer: ");
                    System.out.println(questions.get(3).checkAnswer(sc.nextLine()));
                    System.out.println("");
                    break;
                case 5:
                    System.out.println(questions.get(4).getQuestion());
                    System.out.print("Enter your answer: ");
                    System.out.println(questions.get(4).checkAnswer(sc.nextLine()));
                    System.out.println("");
                    break;
                case 6:
                    System.out.println(questions.get(5).getQuestion());
                    System.out.print("Enter your answer: ");
                    System.out.println(questions.get(5).checkAnswer(sc.nextLine()));
                    System.out.println("");
                    break;
            }
        } while (check != 0);

    }
}
