import java.util.Scanner;
class Ex1{
	public static void main (String []args){
		Scanner ob =new Scanner(System.in);
		System.out.println("enter the number");
		int no=ob.nextInt();
		if(no>0)
		{
			System.out.println("this is posiive no");
		}else if(no<0)
		{
			System.out.println("this is negative no");
		}else
		{
			System.out.println("this is zero");
		}
	}
}