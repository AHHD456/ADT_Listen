
public class Fibonacci {

	public static long f1 =1;
	public static long f2 = 1;
	public static long fib =3;
	
	public static void main(String args[]) {
		
	for(int i =1; i<70; i++) {
		fib =f1+f2;
		System.out.println(fib);
		f1 =f2;
		f2 =fib;
	}
	
	FibonacciRekursiv a = new FibonacciRekursiv(1,1,0);
	FibonacciRekursiv.go();
	
	
	}
}
