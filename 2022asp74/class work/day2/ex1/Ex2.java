class Ex2{
	public static void main (String[] args){
		String name,address,dob,sex;
		int age;
		name=args[0];
		address=args[1];
		dob=args[2];
		sex=args[3];
		age=Integer.parseInt(args[4]);
		
		System.out.println("name:"+name+"\naddress:"+address+"\ndob:"+dob+"\nage:"+age);
	}
}