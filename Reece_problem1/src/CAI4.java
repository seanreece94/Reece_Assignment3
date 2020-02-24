

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
	static Integer studentAnswer;
	static SecureRandom num= new SecureRandom();
	static Integer val1;
	static Integer val2;
	static Integer responseSelector=num.nextInt(4);
	static Double correctCounter=0.0;
	static Double percent=0.0;
	static Integer difficulty=0;
	
	
		private static void readDifficulty() {
			Scanner input=new Scanner(System.in);
			System.out.print("Please select level of difficulty(1,2,3,4): ");
			difficulty=input.nextInt();
		}
	     private static void generateQuestionDifficulty() {
	    	
	    	 switch(difficulty) {
	    	 case 1:
	    	 val1= num.nextInt(10);
    		 val2= num.nextInt(10);
	    	 break;
	    	 case 2: 
	    	 val1=num.nextInt(100);
    		 val2=num.nextInt(100);
	    	 break;
	    	 case 3:
	    		 val1=num.nextInt(1000);
	    		 val2=num.nextInt(1000);
	    	 break;
	    	 case 4:
	    		 val1=num.nextInt(10000);
	    		 val2=num.nextInt(10000);
	    	 break;
	    	 }
	     }
	    	 
	     private static void askQuestion() {
	    	 generateQuestionDifficulty();
	    	 System.out.printf("How much is %d times %d?: ",val1,val2);
	    	 
	    	 }
	     private static void readResponse() {
	    	 
	    	 Scanner input = new Scanner(System.in);
	    	 studentAnswer = input.nextInt();
	    	 
	     }
	     
	     private static void displayCorrectResponse() {
	    	
	    	responseSelector=num.nextInt(4);
	    	++responseSelector;
	    	 switch(responseSelector) {
	    	 case 1:System.out.println("Excellent!");
	    	 break;
	    	 case 2:System.out.println("Very good!");
	    	 break;
	    	 case 3:System.out.println("Keep up the good work!");
	    	 break;
	    	 case 4:System.out.println("Nice work!");
	    	 break;
	    	 }
	     }
	     private static void displayIncorrectResponse() {
	    	
	    	responseSelector =num.nextInt(4);
	    	++responseSelector;
	    	 switch(responseSelector) {
	    	 case 1:System.out.println("No.Please try again.");
	    	 break;
	    	case 2:System.out.println("Wrong.Try once more.");
	    	 break;
	    	case 3:System.out.println("Don't give up!");
	    	  break;
	    	 case 4:System.out.println("No.Keep trying.");
	    	 break;
	    	 }
	    	
	     }
	     private static void isAnswerCorrect() {
	    	 
	    	 
	    	 if(studentAnswer == val1*val2) {
	    		 correctCounter= correctCounter+1.0;
	    		 displayCorrectResponse();
	    		
	    	 }else {
	    		 displayIncorrectResponse();
	    		
	    	 }
	    	 
	    	 
	     }
	     private static void checker() {
	    	 Scanner input=new Scanner(System.in);
	    	 String option;
	    	 option=input.nextLine();
	    	 if(option.equals("Y")) {
    			 quiz();

    		 }else if(option.equals("N")) {
    			 System.out.println("Thank You.");
    			 
    		 }
	     }
	     private static void displayCompletionMessage() {
	    	 percent=(correctCounter/10.0);
	    	 if(percent>=(7.5/10.0)) {
	    		 System.out.printf("%nYou received a %.2f.Congratulations,you are ready to go to the next level!",(percent*100));
	    		 System.out.print("\nWould you like to try a new set?(Y or N): ");
	    		 correctCounter=0.0;
	    		 checker();
	    	 }else {
	    		 System.out.printf("%nYou received a %.2f.Please ask your teacher for extra help",(percent*100));
	    	 }
	    
	     }
	     private  static void quiz() {
	    	 readDifficulty();
            // generateQuestionDifficulty();
	    	 int i=1;
				do {
			 askQuestion();
	    	 readResponse();
	    	 isAnswerCorrect();
	    	 i++;
				}while(i<=10);
	    	
	    	 displayCompletionMessage();
	    	 
	     }
	    	
	     
		public static void main(String[] args) {
			 quiz();
	           
		}
}