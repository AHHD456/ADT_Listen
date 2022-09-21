
public class ArrayStack {

	private int stack[];
	private int index;
	
	public ArrayStack(int groeﬂe) {
		stack =new int[groeﬂe];
		index = -1;
	}
	
	public void push(int neuelement) {
		index =index +1;
		stack[index] = neuelement;
	}
	
	public void pop() {
		stack[index] = 0;
		index = index -1;
		
	}
	
	public int top() {
		return stack[index];
	}
	
	public boolean empty() {
		if(index == -1) {
			return true;
		}else {
			return false;
		}
	}
	
//	public int[] add(ArrayStack erstes, int[] zweites) {
		
		
		
		
		
	//}
}
