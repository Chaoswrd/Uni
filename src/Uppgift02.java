public class Uppgift02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getContinousMax();
	}
	private static void getContinousMax(){
		//Breaks in getInput. Terminates the program from there.
		while(true){
			getMax();
		}
	}
	private static void getMax(){
		//Asks the questions and has a regex that makes sure you get the correct answer
		String[][] questions = {
				{"Skriv in det första talet: ", "[0-9]+"},
				{"Skriv in det andra talet: ", "[0-9]+"}
		};
		//Moves the answers into a getInput function to save space and re-usability
		//Uses input2 because it needs a special termination function
		String[] answers = Answer.getInput2(questions);
		int nr1 = Integer.parseInt(answers[0]);
		int nr2 = Integer.parseInt(answers[1]);
		String str; //return string
		
		if(nr1==nr2)
			str = "Talen är lika";
		else{	
			int max = Math.max(nr1, nr2);
			int min = Math.min(nr1, nr2);
			str = new StringBuilder().append(max)
									 .append(" är större än ")
									 .append(min)
									 .toString();
		}
		System.out.println(str);
		System.out.println();
	}
}
