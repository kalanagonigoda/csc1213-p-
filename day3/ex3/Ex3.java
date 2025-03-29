import java.util.Scanner;
class Ex3{
	public static void main(String[]args){
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the vowel");
		char vow = ob.next().charAt(0);
		switch(vow){
			    case 'A':
			    case 'a':System.out.println("this is a  vowel");
				break;
				case 'I':
	      	    case 'i':System.out.println("this is a  vowel");
				break;
				case 'O':
			    case 'o':System.out.println("this is a  vowel");
				break;
				case 'U':
		        case 'u':System.out.println("this is a  vowel");
				break;
				case 'E':
				case 'e':System.out.println("this is a  vowel");
				break;
				default:System.out.println("this is not a vowel");
		}
	}
}
			