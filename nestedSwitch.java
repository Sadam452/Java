import java.util.*;
class nestedSwitch{
	public static void main(String[] args) {
		int userGuess,choice;
		String msg;
		Scanner sc = new Scanner(System.in);
		System.out.println("I have choosen a number between 1 to 5. Can you guess it?");
		userGuess = sc.nextInt();
		System.out.println("Pick any number among 1,2,3:");
		choice = sc.nextInt();
		switch(userGuess){
			case 1:
			msg = "Wrong Guess! Better luck next time.";break;
			case 2:
			msg = "Wrong Guess! Better luck next time.";break;
			case 3: // let us say 3 is correct guess, within it , i will display value of choice also
			switch(choice){
				case 1:
				msg = "Congratulations you have guessed it right...You are inside nested switch case1";break;
			    case 2:
				msg = "Congratulations you have guessed it right...You are inside nested switch case2";break;
			    case 3:
				msg = "Congratulations you have guessed it right...You are inside nested switch case3";break;
				default:
				msg =" correct guess, but wrong choice.";
			} break;
			case 4:
			msg = "Wrong Guess! Better luck next time.";break;
			case 5:
			msg = "Wrong Guess! Better luck next time.";break;
			default:
			msg ="Please enter any number from 1 to 5.";

		}
		System.out.println(msg);

	}
}