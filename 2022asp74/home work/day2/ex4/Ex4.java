import java.util.Random;
import java.util.Date;

public class Ex4{
	public static void main(String[] args){
		System.out.println("Max:"+Math.max(7,11));
		System.out.println("Min:"+Math.min(-8,22));	
		System.out.println("Square:"+Math.sqrt(400));	
		System.out.println("Absolute"+Math.abs(-5.9));
		System.out.println("Round"+Math.round(7.758));	
		
		String name = "Java";
		System.out.println("Length:"+name.length());	
		System.out.println(name.toUpperCase());	
		System.out.println(name.toLowerCase());	
		
		int Num1 = Integer.parseInt("150"); 
		double Num2 = Double.parseDouble("45.98");
		System.out.println(Num1+Num2);
		
		Random random = new Random();
		int Num3 = random.nextInt(10);
		System.out.println(Num3);
		
		Date date = new Date();
		System.out.println(date);
	}
}