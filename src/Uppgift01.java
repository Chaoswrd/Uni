public class Uppgift01 {
	public static void main(String[] args) {
		
		//Input: two words
		//Output: sentence
		getSentence();
		
		//Input: name, hourly salary, hours worked per week
		//Output: Amount of money made per week
		getSalary();
	
	}
	private static void getSentence(){
		//Asks the questions and has a regex that makes sure you get the correct answer
		String[][] questions = {
				{"Skriv ett ord: ", "[A-ZÅÄÖa-zåäö]+"},
				{"Skriv ytterligare ett ord: ", "[A-ZÅÄÖa-zåäö]+"}
		};
		//Moves the answers into a getInput function to save space and re-usability
		String[] answers = Answer.getInput(questions);
		
		//Joins the two answers with a space between them
		String str = String.join(" ", answers);
		
		System.out.println(str);
		System.out.println(str.length());
	}
	private static void getSalary(){
		//Asks the questions and has a regex that makes sure you get the correct answer
		String[][] questions = {
				{"Ange ditt namn: ", "[A-ZÅÄÖa-zåäö ]+"},
				{"Ange din timlön: ", "[0-9]+"},
				{"Ange antalet arbetade timmar: ", "[0-9]+"}
		};
		//Moves the answers into a getInput function to save space and re-usability
		String[] answers = Answer.getInput(questions);
		
		//Creates the required answer, using String-builder as it is more efficient and good practice
		String str = new StringBuilder().append(answers[0])
										.append(" du tjänade ")
										.append(String.format("%.2f", //Returns with two decimals
												getWeeklySalary(Double.parseDouble(answers[1]), Integer.parseInt(answers[2]))))
										.append(" kr förra veckan.")
										.toString();
		
		System.out.println(str);
		
	}
	
	private static double getWeeklySalary(double hourSalary, int hours){
		return hourSalary*hours;
	}
	

}
