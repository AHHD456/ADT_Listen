
public class PQueue {

	ArrayQueue p1 = new ArrayQueue(100);
	ArrayQueue p2 = new ArrayQueue(100);
	ArrayQueue p3 = new ArrayQueue(100);
	

	public void insert(Notruf alarm) {
		if(alarm.getPrio() == 1) {
			p1.Enqueue(alarm);
		}else if(alarm.getPrio() == 2) {
			p2.Enqueue(alarm);
		}else if(alarm.getPrio() == 3) {
			p3.Enqueue(alarm);
		}else {
			System.out.println("Prio nicht korrekt. Element nicht hinzugefügt");
		}
	}
	
	public void delete() {
		if(p1.Empty() != true) {
			p1.Dequeue();
		}else if(p2.Empty() != true) {
			p2.Dequeue();
		}else if(p3.Empty() != true) {
			p3.Dequeue();
		}else {
			System.out.println("alles done");
		}
		
	}
	
	public Notruf Max() {
		if(p1.Empty() != true) {
			return (Notruf) p1.Front();
		}else if(p2.Empty() != true) {
			return (Notruf) p2.Front();
		}else if(p3.Empty() != true) {
			return (Notruf) p3.Front();
		}else {
			System.out.println("alles done");
			return null;
		}
	}
	
	public boolean Empty() {
		if(p1.Empty() == true) {
			if(p2.Empty() == true) {
				if(p3.Empty() == true) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
