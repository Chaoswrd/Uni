public class Uppgift03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getValues(5);
	}
	
	private static void getValues(int amount){
		String[] question = {"Enter an integer: ", "[0-9]+"}; //Needs the question amount times, default 5 for the assignment
		String[][] questions = new String[amount][question.length]; 
		
		for(int i=0; i<amount; i++)
			questions[i] = question; //Adds the question to questions amount times
		
		String[] answers = Answer.getInput(questions);
		
		int sum = 0;
		int mean = 0;
		int max = 0;
		
		for(String answer:answers){
			int i = Integer.parseInt(answer); //All answers are string therefore they are parsed 
			max = Math.max(max, i); //Checks if i is larger than max
			//Adding i to the total
			mean+=i;
			sum+=i;
		}
		
		mean /= amount; //Creates the mean 
		
		System.out.println(sum);
		System.out.println(mean);
		System.out.println(max);
	}
}
