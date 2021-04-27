public class Calculate{
	// Class Calculate. It is Proba Java
	public static void main(String[] arg){
		System.out.println("Calculate");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		System.out.println("Sum = " + sum);
		int pow = first * second;
		System.out.println("Pow = " + pow);
		int minus = first - second;
		System.out.println("Minus = " + pow);		
	}
}