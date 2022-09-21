
public class ArrayQueue {

	int tos;
	int arrayqueue[];
	int groeﬂe;
	
	public ArrayQueue(int groeﬂe) {
		arrayqueue = new int[groeﬂe];
		tos = -1;
		this.groeﬂe = groeﬂe;
	}
	
	public void Enqueue(int x) {
		tos ++;
		arrayqueue[tos] = x;
		
	}
	
	public void Dequeue() {
		for(int i= 0; i< (groeﬂe-1); i++) {
			arrayqueue[i] = arrayqueue[i+1];
		}
		tos--;
	}
	
	public int Front() {
		 return arrayqueue[0];
		
	}
	
	public boolean Empty() {
		if(arrayqueue[0] == 0) {
			return true;
		}else {
			return false;
		}
		
	}
}
