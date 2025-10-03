// You are using Java
import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctAnswer; // index of correct option (0-based)

    Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public boolean askQuestion(Scanner sc) {
        System.out.println("\n" + questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Your answer (1-" + options.length + "): ");
        int userChoice = sc.nextInt();
        return (userChoice - 1 == correctAnswer);
    }
}

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List of questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?",
                new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2));
        questions.add(new Question("Which language is used for Android Development?",
                new String[]{"Python", "Java", "Swift", "C#"}, 1));
        questions.add(new Question("Who is known as the father of Computers?",
                new String[]{"Charles Babbage", "Alan Turing", "Bill Gates", "Elon Musk"}, 0));
        questions.add(new Question("What does HTML stand for?",
                new String[]{"Hyper Trainer Marking Language", "Hyper Text Markup Language",
                        "High Text Machine Language", "Hyper Text Markdown Language"}, 1));

        int score = 0;

        // Ask each question
        for (Question q : questions) {
            if (q.askQuestion(sc)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
            }
        }

        // Final result
        System.out.println("\n----- Quiz Finished -----");
        System.out.println("Your Score: " + score + "/" + questions.size());

        sc.close();
    }
}
