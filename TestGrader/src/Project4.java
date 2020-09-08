import java.util.Scanner;
public class Project4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// TODO Auto-generated method stub
		// char[] answerKey = new char[20];
		char[] answerKey = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B',
				'D', 'A' };

		int numWrong = 0, numRight = 0;
		char[] studentAns = new char[20];
		int[] missed = new int[20];
		getAnswers(studentAns);

		numRight = totalCorrect(answerKey, studentAns);

		questionsMissed(answerKey, studentAns, missed);
		
		for (int i = 0; i< missed.length; i++){
			System.out.print(missed[i] + " ");
		
		}
		

	public static char[] getAnswers(char studentAns[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter only answers A-D");

		for (int i = 0; i < studentAns.length; i++) {

			// do {
			int qNum;
			qNum = i + 1;

			System.out.println("Enter student answer for question #" + qNum);
			String s = input.nextLine();

			studentAns[i] = s.charAt(0);

			if (Character.isLowerCase(studentAns[i]) == true) {
				studentAns[i] = Character.toUpperCase(studentAns[i]);
			}
			// } while ();
		}
		return studentAns;
	}

	public static int totalCorrect(char[] answerKey, char[] studentAns) {
		int numRight = 0;
		for (int i = 0; i < answerKey.length; i++)
		{

			if (studentAns[i] == answerKey[i]) {

				numRight += 1;
			}
		}
		return numRight;
	}

	public  static  int[]  questionsMissed (char [] answerKey, char[] studentAns, int[] missed){

	
	for (int i = 0; i < answerKey.length; i++)
	{
		if (studentAns[i] != answerKey[i]) {

			missed[i] = 0;
		}
		else{
			missed[i] = 1;
		}
		
	}
	return missed;
	}
	
}


