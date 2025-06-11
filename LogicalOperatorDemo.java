public class LogicalOperatorDemo{
	public static void main(String[]a){
	int num1 = 10, num2 =20;
	System.out.println("Logical AND && :");
	System.out.println("Logical Operator Demo!!!");
	System.out.println(num1+"< 10 &&"+num2+"<10:"+(num1<10 && num2<10 ));
	System.out.println(num1+"<= 10 &&"+num2+"<10:"+(num1<=10 && num2<10 ));
	System.out.println(num1+"< 10 &&"+num2+">10:"+(num1<10 && num2>10 ));
	System.out.println(num1+"<= 10 &&"+num2+">10:"+(num1<=10 && num2>10 ));
	}
}