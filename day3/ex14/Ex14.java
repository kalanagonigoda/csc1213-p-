import java.util.Scanner;
class Ex14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		if(num1>num2){
			System.out.println("Maximum number: " + num1);
		}else{
			System.out.println("Maximum number: " + num2);
		}
	}
}