import java.util.Scanner;

public class Answer {
	private static Scanner scanner;
	private static String checkAnswer(String question, String regex){
		String answer = null;
		while(true){
			System.out.print(question);
			scanner = new Scanner(System.in);
			String answer1 = scanner.nextLine();
			answer = answer1;
			if(answer.matches(regex))
				break;
		}
		return answer;
	}
	public static String[] getInput(String[][] questions){
		String[] answers = new String[questions.length];
		for(int i=0; i<questions.length; i++){
			answers[i] = Answer.checkAnswer(questions[i][0], questions[i][1]);
		}
		return answers;
	}
	//Used for Uppgift 2
	public static String[] getInput2(String[][] questions){
		String[] answers = new String[questions.length];
		for(int i=0; i<questions.length; i++){
			answers[i] = Answer.checkAnswer(questions[i][0], questions[i][1]);
			if(i==0 && answers[i].matches("0")){
				System.out.println("Tackar.");
				System.exit(0);
			}
		}
		return answers;
	}
}
