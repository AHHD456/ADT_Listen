
public class Main {

	public static void main(String[] args) {
		
		BuildTree meinBaumchen = new BuildTree();
		meinBaumchen.root.right.show();
		meinBaumchen.root.insert(75);
		meinBaumchen.root.left.right.show();
		
		PQueue leitstelle = new PQueue();
		leitstelle.insert(new Notruf(1,3,14,35,33,"Amoklauf"));
		leitstelle.insert(new Notruf(2,2,18,33,21,"Rechte Party im Brandeck"));
		leitstelle.insert(new Notruf(3,1,22,44,22,"Hilfeleistung Linke Demo"));
		(leitstelle.Max()).anzeigen();
		leitstelle.delete();
		(leitstelle.Max()).anzeigen();
		leitstelle.delete();
		(leitstelle.Max()).anzeigen();
		leitstelle.delete();
		System.out.println(leitstelle.Empty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		ArrayQueue Queueii = new ArrayQueue(100);
		ArrayQueue Queueiii = new ArrayQueue(100);
		
		System.out.println(Queueii.Empty());
		Queueii.Enqueue(102);
		Queueii.Enqueue(992);
		for(int i = 0; i<19; i++) {
			Queueii.Enqueue(i);
		}
		System.out.println(Queueii.Front());
		Queueii.Dequeue();
		Queueii.Dequeue();
		System.out.println(Queueii.Front());
		
		for(int i =19; i > 0; i--) {
			Queueiii.Enqueue(i);
		}
		
		Queueii.concat(Queueiii);
		Queueii.Dequeue();
		Queueii.Dequeue();
		Queueii.Dequeue();
		System.out.println(Queueii.Front());
		System.out.println(Queueii.search(99));
		*/
		/*
		ArrayStack Stacki = new ArrayStack(100);
		ArrayStack tmp =new ArrayStack(100);
		ArrayStack copy =new ArrayStack(100);
		
		for(int i =0; i<100; i++) {
			Stacki.push(i);
			
		}
		System.out.println("copystartet");
		while(Stacki.empty() ==false) {
			System.out.println(Stacki.top());
			tmp.push(Stacki.top());
			Stacki.pop();
		}
		System.out.println("tmpr�ckcopy");
		while(tmp.empty() ==false) {
			System.out.println(tmp.top());
			int x = tmp.top();
			Stacki.push(x);
			copy.push(x);
			tmp.pop();
		}
		System.out.println(Stacki.top());
		System.out.println(copy.top());
		*/
		
		
		/*
		
		ListenElement element1 = new ListenElement(4);
		ListenElement element2 = new ListenElement(42);
		Queue myQueue = new Queue(3);
		myQueue.enqueue(6);
		System.out.println("Gr��e: " + myQueue.getGroesse());

		try {
			myQueue.dequeue();
		} catch (Exception e) {

			System.out.println("Die ist leer!");
		}

		System.out.println("Gr��e: " + myQueue.getGroesse());
*/
	}
}
/*
 * try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * System.out.println("Gr��e: " + stack.getGroesse()); try { stack.pop(); }
 * catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * /* Liste liste = new Liste(3); liste.add(5); liste.add(7); liste.add(999);
 * liste.add(1001); System.out.println(liste);
 * System.out.println(liste.getGroesse());
 */