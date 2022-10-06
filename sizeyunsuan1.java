import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class sizeyunsuan1 {
    static ArrayList<String> equations = new ArrayList();
    static ArrayList<Integer> answers = new ArrayList();
    static String timu = null;
    static int randomNumber = 0;
    static int number0 = 0;
    static int numberNumber = 0;
    static int answer = 0;

    public sizeyunsuan1() {
    }

    public static void progress() {
        for(int j = 0; j < numberNumber - 1; ++j) {
            boolean a = Math.random() > 0.5;
            randomNumber = (int)(Math.random() * 100.0) + 1;
            if (a) {
                timu = timu + "+" + randomNumber;
                answer += randomNumber;
            } else {
                timu = timu + "-" + randomNumber;
                answer -= randomNumber;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("请输入题目个数");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("Exercises.txt"));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("Answers.txt"));

        for(int i = 1; i < number + 1; ++i) {
            numberNumber = (int)(2.0D + Math.random() * 2.0D);
            number0 = (int)(Math.random() * 100.0D) + 1;
            timu = String.valueOf(number0);
            answer = number0;
            progress();

            while(answer < 0 || answer > 100) {
                timu = String.valueOf(number0);
                answer = number0;
                progress();
            }

            bw1.write(i + ". " + timu + "=");
            bw1.newLine();
            bw2.write(i + ". " + answer);
            bw2.newLine();
        }

        bw1.close();
        bw2.close();
    }
}

