public class BitwiseOperatorDemo{
	public static void main(String[]a){
	int num1 = 10, num2 = 2;
	System.out.println("Bitwise Operator Demo :");
	System.out.println("Bitwise AND :");
	System.out.println(num1+"&"+num2+ ":" +(num1 & num2));
	System.out.println("("+num1+" < 10) & ("+num2+" <5 ) : "+((num1<10) & (num2<5)));
	System.out.println("Bitwise Operator Demo :");
	System.out.println("Bitwise OR :");
	System.out.println(num1+" | "+num2+ ":" +(num1 | num2));
	System.out.println("("+num1+" < 10) | ("+num2+" <5 ) : "+((num1<10) | (num2<5)));
	System.out.println("Bitwise Operator Demo :");
	System.out.println("Bitwise EX-OR :");
	System.out.println(num1+"^"+num2+ ":" +(num1 ^ num2));
	System.out.println("("+num1+" < 10) ^ ("+num2+" <5 ) : "+((num1<10) ^ (num2<5)));
	
	}
}