import java.util.Scanner;
class Ex2{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the date");
		int date=ob.nextInt();
		switch(date){
			case 1:System.out.println("this is monday");
			break;
			case 2:System.out.println("this is tuesday");
			break;
			case 3:System.out.println("this is wedsday");
			break;
			case 4:System.out.println("this is thursday");
			break;
			case 5:System.out.println("this is friday");
			break;
			case 6:System.out.println("this is saturday");
			break;
			case 7:System.out.println("this is sunday");
			break;
			default:System.out.println("not valid date");
			
		}
	}
}