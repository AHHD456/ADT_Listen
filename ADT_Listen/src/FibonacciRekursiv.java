
public class FibonacciRekursiv {

	int max;
	long fib1;
	long fib2;
	long fib;
	
	public FibonacciRekursiv(long fib1, long fib2, int max){
		this.fib1 =fib1;
		this.fib2 =fib2;
		this.max = max;
	}
	
	public void go() {
		
		
		if(max<91) {
			max++;
		fib =fib1+ fib2;
		System.out.println(fib);
		fib1 = fib2;
		fib2= fib;
		this.go();
	
		}
	}
	
	
}
