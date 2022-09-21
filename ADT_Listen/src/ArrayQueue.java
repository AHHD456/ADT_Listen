
public class ArrayQueue {

	int tos;
	Object arrayqueue[];
	int groeﬂe;
	
	public ArrayQueue(int groeﬂe) {
		arrayqueue = new Object[groeﬂe];
		tos = -1;
		this.groeﬂe = groeﬂe;
	}
	
	public void Enqueue(int x) {
		tos ++;
		arrayqueue[tos] = x;
		
	}
	
	 public void concat(ArrayQueue queue2) {
	  while(queue2.Empty() == false) {
		  tos++;
		  arrayqueue[tos] =queue2.Front();
		  queue2.Dequeue();
		  
	  }}
	
	public void Dequeue() {
		for(int i= 0; i< (groeﬂe-1); i++) {
			arrayqueue[i] = arrayqueue[i+1];
		}
		arrayqueue[tos] = null;
		tos--;
	}
	
	public Object Front() {
		 return arrayqueue[0];
		
	}
	
	public boolean Empty() {
		if(arrayqueue[0] == null) {
			return true;
		}else {
			return false;
		}
	}
   
}
