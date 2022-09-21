
public class ArrayQueue {

	int tos;
	int arrayqueue[];
	int groe�e;
	
	public ArrayQueue(int groe�e) {
		arrayqueue = new int[groe�e];
		tos = -1;
		this.groe�e = groe�e;
	}
	
	public void Enqueue(int x) {
		tos ++;
		arrayqueue[tos] = x;
		
	}
	
	public void Dequeue() {
		for(int i= 0; i< (groe�e-1); i++) {
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
