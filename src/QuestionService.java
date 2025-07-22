import java.util.Scanner;

public class QuestionService {
    Scanner s = new Scanner(System.in);
    Question[] ques = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        ques[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        ques[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        ques[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        ques[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        ques[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz () {
        int i = 0;
        for (Question q : ques) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A.) " + q.getOpt1() + "\t" + "B.) " + q.getOpt2());
            System.out.println("C.) " +q.getOpt3() + "\t" + "D.) " + q.getOpt4());
            System.out.print("Type Your Answer: ");
            selection[i++] = s.nextLine();
        }

        for (String s : selection) {
            System.out.println(s);
        }
        printScore();
    }

    public void printScore () {
        int score = 0;

        for (int i = 0 ; i < ques.length ; i++) {
            Question q = ques[i];

            if (selection[i].equals(q.getAnswer())) {
                score++;
            }
        }
        System.out.println("Your score is - " + score);
    }
}
