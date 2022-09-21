
public class Main {

	public static void main(String[] args) {
		
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
		System.out.println("tmprückcopy");
		while(tmp.empty() ==false) {
			System.out.println(tmp.top());
			int x = tmp.top();
			Stacki.push(x);
			copy.push(x);
			tmp.pop();
		}
		System.out.println(Stacki.top());
		System.out.println(copy.top());
		
		
		
		/*
		
		ListenElement element1 = new ListenElement(4);
		ListenElement element2 = new ListenElement(42);
		Queue myQueue = new Queue(3);
		myQueue.enqueue(6);
		System.out.println("Größe: " + myQueue.getGroesse());

		try {
			myQueue.dequeue();
		} catch (Exception e) {

			System.out.println("Die ist leer!");
		}

		System.out.println("Größe: " + myQueue.getGroesse());
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
 * System.out.println("Größe: " + stack.getGroesse()); try { stack.pop(); }
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