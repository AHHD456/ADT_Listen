
public class ArrayQueue {

	int tos;
	Object arrayqueue[];
	int groese;
	
	public ArrayQueue(int groese) {
		arrayqueue = new Object[groese];
		tos = -1;
		this.groese = groese;
	}
	
	public void Enqueue(Object x) {
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
		for(int i= 0; i< (groese-1); i++) {
			arrayqueue[i] = arrayqueue[i+1];
		}
		arrayqueue[tos] = null;
		tos--;
	}
	
	public Object Front() {
		 return arrayqueue[0];
		
	}
	
	public boolean search(Object look) {
		ArrayQueue tmp = new ArrayQueue(groese);
		ArrayQueue lookqueue = new ArrayQueue(groese);
		
		while((arrayqueue[0] == null) == false) {
			tmp.Enqueue(arrayqueue[0]);
			lookqueue.Enqueue(arrayqueue[0]);
			for(int i= 0; i< (groese-1); i++) {
				arrayqueue[i] = arrayqueue[i+1];
			}
			arrayqueue[tos] = null;
			tos--;
		}
		System.out.println(arrayqueue[0]);
		while(tmp.Empty() == false) {
			tos ++;
			arrayqueue[tos] = tmp.Front();
			tmp.Dequeue();
		}
		while(lookqueue.Empty() == false) {
			if(lookqueue.Front() == look) {
				return true;
			}else {
				lookqueue.Dequeue();
			}
		}
		return false;
	}
	
	public boolean Empty() {
		if(arrayqueue[0] == null) {
			return true;
		}else {
			return false;
		}
	}
   
}
