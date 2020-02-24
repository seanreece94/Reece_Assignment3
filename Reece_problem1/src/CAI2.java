import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	static Integer studentAnswer;
	static SecureRandom num= new SecureRandom();
	static Integer val1= num.nextInt(10);
	static Integer val2= num.nextInt(10);
	static Integer responseSelector=num.nextInt(4);
	
	     
	     private static void askQuestion() {
	    	 System.out.printf("How much is %d times %d?: ",val1,val2);
	    	 }
	     private static void readResponse() {
	    	 
	    	 Scanner input = new Scanner(System.in);
	    	 studentAnswer = input.nextInt();
	    	 
	     }
	     
	     private static void displayCorrectResponse() {
	    	// System.out.println("Very good");
	    	Integer generator=responseSelector;
	    	++generator;
	    	 switch(generator) {
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
	    	 Integer answer=val1*val2;
	    	 
	    	 while(studentAnswer != answer){
	    		 displayIncorrectResponse();
	    		 askQuestion();
		    	 readResponse();
	    		responseSelector=num.nextInt(4);
	    	 }
	    	 if(studentAnswer== answer) {
	    		 displayCorrectResponse();
	    	 }
	    	 
	     }
	     private  static void quiz() {
	    	 //Integer answer=val1*val2;
	    	 askQuestion();
	    	 readResponse();
	    	 isAnswerCorrect();
	    	 
	     }
	    	
	     
		public static void main(String[] args) {
			
	             quiz();
		}
}
