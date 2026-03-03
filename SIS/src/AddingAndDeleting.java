import java.util.Scanner;
import java.util.ArrayList;



public class AddingAndDeleting
	{
	
	static Scanner userInput = new Scanner(System.in);

		public static void addingAndDeleting()
		{

			//code to add data to a created object, need ArrayList name and name of the class where it is kept
				//directory.add(new Student(newFirstName, newLastName, newPeriodOne, newPeriodOneGrade, newPeriodTwo, newPeriodTwoGrade, newPeriodThree, newPeriodThreeGrade));
			}
			else if(choice==2)
			{
				//prints out directory with numbers and lets the user pick and delete a student by using their number.
				System.out.println("Select the student you wish to delete.");
				//a for loop to print the students with their number, need ArrayList name and name of the class where it is kept
		//**** 		for(int i=0; i<directory.length(); i++)
				{
		//****		System.out.println("["+i+1+"]  "+directory.get(i).getFirstName()+","+directory.get(i).getLastName()+","+directory.get(i).getPeriodOne()+directory.get(i).getPeriodOneGrade()+","+directory.get(i).getPeriodTwo()+directory.get(i).getPeriodTwoGrade()+","+directory.get(i).getPeriodThree()+directory.get(i).getPeriodThreeGrade());
					
				}
			int selection = userInput.nextInt();
		//****	System.out.println("Are you sure you wish to delete "+directory.get(selection-1).getFirstName()+" "+directory.get(selection-1).getLastName()+"?");
			System.out.println("(1) yes\n(2) no");
			int doubleSelection = userInput.nextInt();
			
			if(doubleSelection==1)
			{
		//****   directory.delete(selection-1)
			}
			else
			{
				addingAndDeleting();
			}
				
			}
			else if(choice==3)
			{
				System.out.println("Back to the main menu");
			}
			else
			{
				//Just dummy proofing it a little bit.
				
				System.out.println("Try again");
				addingAndDeleting();
			}
			
		}
		
	}
