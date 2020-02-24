

import java.lang.Math;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {
	static Double studentAnswer=0.0;
	static SecureRandom num= new SecureRandom();
	static Integer val1=0;
	static Integer val2=0;
	static Integer responseSelector=num.nextInt(4);
	static Double correctCounter=0.0;
	static Double percent=0.0;
	static Integer difficulty=0;
	static Integer problemType=0;
	static Double correctAnswer=0.0;
		private static void readDifficulty() {
			Scanner input=new Scanner(System.in);
			System.out.print("Please select level of difficulty(1,2,3,4): ");
			difficulty=input.nextInt();
		}
		private static void readProblemType() {
			Scanner input=new Scanner(System.in);
			System.out.print("Please enter problem type(1,2,3,4,5): ");
			problemType=input.nextInt();
		}
		private static void multiply() {
			correctAnswer=(double) (val1*val2);
		}
		private static void divide() {
			String answer;
			if(val2==0) {
				
			correctAnswer=0.0;
			}else if (val2 <val1){
				 
				correctAnswer=(double)(val1)/(double)(val2);
				answer=String.format("%.1f", correctAnswer);
				correctAnswer=Double.parseDouble(answer);
			}else {
				correctAnswer=(double)(val1)/(val2);

				answer=String.format("%.1f", correctAnswer);
				correctAnswer=Double.parseDouble(answer);
			}
		}
		private static void addition() {
			correctAnswer=(double)(val1+val2);
		}
		private static void subtraction() {
			correctAnswer=(double)(val1-val2);
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
	    	 if(problemType==1) {
	    	 System.out.printf("How much is %d plus %d?: ",val1,val2);
	    	 addition();
	    	 }else if(problemType==2) {
	    		 System.out.printf("How much is %d times %d?: ",val1,val2);
	    		 multiply();
	    	 }else if(problemType==3) {
	    		 System.out.printf("How much is %d minus %d?: ",val1,val2);
	    		 subtraction();
	    	 }else if(problemType==4) {
	    		 System.out.printf("How much is %d divided by %d?(Round to one decimal place only if needed): ",val1,val2);
	    		 divide();
	    	 }else if(problemType==5) {
	    		 Integer random=0;
	    		 random=num.nextInt(4);
	 	    	++random;
	 	    	 switch(random) {
	 	    	 case 1:System.out.printf("How much is %d plus %d?: ",val1,val2);
	 	    	 addition();
	 	    	 break;
	 	    	 case 2:System.out.printf("How much is %d times %d?: ",val1,val2);
	 	    	 multiply();
	 	    	 break;
	 	    	 case 3:System.out.printf("How much is %d minus %d?: ",val1,val2);
	 	    	 subtraction();
	 	    	 break;
	 	    	 case 4:System.out.printf("How much is %d divided by %d?(Round to one decimal place if needed): ",val1,val2);
	 	    	 divide();
	 	    	 break;
	 	    	 }
	    	 }
	    	 }
	     private static void readResponse() {
	    	 
	    	 Scanner input = new Scanner(System.in);
	    	 studentAnswer = input.nextDouble();
	    	
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
	    	 if(studentAnswer.equals( correctAnswer)) {
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
	    		 System.out.printf("%nYou received a %.2f. Congratulations,you are ready to go to the next level!",(percent*100));
	    		 System.out.print("\nWould you like to try a new set?(Y or N): ");
	    		 correctCounter=0.0;
	    		 checker();
	    	 }else {
	    		 System.out.printf("%nYou received a %.2f. Please ask your teacher for extra help",(percent*100));
	    	 }
	    
	     }
	     private  static void quiz() {
	    	 readDifficulty();
	    	 readProblemType();
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
