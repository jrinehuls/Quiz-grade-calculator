import java.util.Scanner;
import java.util.ArrayList;

public class Project {

	public static void main(String[] args) {
		int save = 0;
		int total = 0;
		int average = 0;
		char letter = 'F';
		
		Scanner input = new Scanner(System.in);
		/**This method prints the programming specifications to the screen.*/
		System.out.println("This program will ask you for up to 10 quiz scores, computes the average, "
				+ "then displays a letter grade." + '\n' + "You may termintate the program with fewer "
				+ "than 10 scores by entering 999.");
		/**Here, I allow the user to input grades. The ArrayList is used to hold the acceptable inputs.
		 * The for loop is used to ask the user to input grades with a maximum of 10.*/
		ArrayList <Integer> grades = new ArrayList <Integer> ();
			for(int i = 1; i <= 10;) {
				System.out.println("Please enter a grade.");
		/**The while loop prevents any non-integer inputs from being accepted.*/
				while(!input.hasNextInt()) {
				System.out.println("I need whole numbers please.");
				input.next();
				}
		/**The save variable is used to hold the input so that the next if statement can determine
		 * whether or not the input meets the criteria of being a valid grade.*/
				save = input.nextInt();
		/**If the grade is between 0 and 100, it is stored in the 'grades' ArrayList.
		 * The counter is then incremented.*/		
				if(save >= 0 && save <= 100) {
					grades.add(save);
					i++;}
		/** If the user types 999, the input ends and the calculations are performed.*/
				else if(save == 999) {
					System.out.println("Program ended.");
					break;}
		/**Else is used for integer values that are not between 0 and 100 and not 999 to be discarded and request a new input.*/
				else {System.out.println("The grade must be between 0 and 100.");}	
			}
		/**The next line prints the grades ArrayList which shows all of the acceptable inputs from the user.*/		
			System.out.println("You've entered: " + grades);
		/**Here, a for loop is used to add the grades stored in the ArrayList for a total of all grades.*/
			for(int grd : grades) {
				total += grd;
			}
		/**The average is calculated by dividing the total by the number of grades for a final score.*/
			if(grades.size() > 0) {
				average = (total / grades.size());
		/**The following if statements relate the final score to a letter grade.*/
				if(average >= 90) {letter = 'A';}
				if(average >= 80 && average < 90) {letter = 'B';}
				if(average >= 70 && average < 80) {letter = 'C';}
				if(average >= 60 && average < 70) {letter = 'D';}
		/**The number of accepted quiz entries, the final score, and the letter grade are printed.*/
				System.out.println("The average of these " + grades.size() + " grades is: " + average + '\n' +
					"Your letter grade is: " + letter);
			}
		input.close();
	}
}