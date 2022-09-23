
public class Element {

	public int value;
	public Element left, right;
	
	public Element(int n) {
		value = n;
		left = null;
		right = null;
	}
	
	public int show() {
		System.out.println(" "+value);
		return value;
	}
	
	public void insert(int wert ) {
		
		if(wert >= this.value) {
			if(right == null) {
				right = new Element(wert);
			}else {
				right.insert(wert);
			}
		}else {
			if(left == null) {
				left= new Element(wert);
			}else {
				left.insert(wert);
			}
		}
	}
}
