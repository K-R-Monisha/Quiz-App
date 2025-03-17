import java.util.*;
import java.io.*;

public class QuizApp {
    private static final String FILE_NAME = "questions.txt";

    public static void main(String[] args) {
        List<Question> questions = loadQuestions();
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question q : questions) {
            System.out.println(q.getQuestion());
            for (int i = 0; i < q.getOptions().size(); i++) {
                System.out.println((i + 1) + ". " + q.getOptions().get(i));
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();
            if (q.getCorrectAnswerIndex() == answer - 1) {
                score++;
                System.out.println("✅ Correct!");
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.getOptions().get(q.getCorrectAnswerIndex()));
            }
        }

        System.out.println("\nYour final score: " + score + "/" + questions.size());
        scanner.close();
    }

    private static List<Question> loadQuestions() {
        List<Question> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String questionText = parts[0];
                List<String> options = Arrays.asList(parts[1], parts[2], parts[3], parts[4]);
                int correctIndex = Integer.parseInt(parts[5]);
                questions.add(new Question(questionText, options, correctIndex));
            }
        } catch (IOException e) {
            System.out.println("Error loading questions.");
        }
        return questions;
    }
}

class Question {
    private String question;
    private List<String> options;
    private int correctAnswerIndex;

    public Question(String question, List<String> options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() { return question; }
    public List<String> getOptions() { return options; }
    public int getCorrectAnswerIndex() { return correctAnswerIndex; }
}
