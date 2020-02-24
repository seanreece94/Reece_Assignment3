import java.util.Scanner;
import java.security.SecureRandom;
public class CAI1 {
static Integer studentAnswer;
static SecureRandom num= new SecureRandom();
static Integer val1= num.nextInt(10);
static Integer val2= num.nextInt(10);
     
     private static void askQuestion() {
    	 System.out.printf("How much is %d times %d?: ",val1,val2);
    	 }
     private static void readResponse() {
    	 
    	 Scanner input = new Scanner(System.in);
    	 studentAnswer = input.nextInt();
     }
     
     private static void displayCorrectResponse() {
    	 System.out.println("Very good");
     }
     private static void displayIncorrectResponse() {
    	 System.out.println("No.Please try again.");
    	 askQuestion();
    	 readResponse();
     }
     private static void isAnswerCorrect() {
    	 Integer answer=val1*val2;
    	 if(studentAnswer== answer) {
    		 displayCorrectResponse();
    	 }else {
    		 displayIncorrectResponse();
        	 isAnswerCorrect();
    	 }
     }
     private  static void quiz() {
    	 
    	 askQuestion();
    	 readResponse();
    	 isAnswerCorrect();
    	
     }
    	
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             quiz();
	}

}
