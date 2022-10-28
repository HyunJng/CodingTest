package p2.linkedlist_practice;

public class OpPoly {
	public static Poly add(Poly a, Poly b) {
		Poly c = new Poly();
		Node atA = a.head.next;
		Node atB = b.head.next;
		
		while(atA != null && atB != null) { 
			if(atA.expo == atB.expo) {
				int sum = atA.coef + atB.coef;				
				c.appendTerm(sum, atA.expo);
				atA = atA.next;
				atB = atB.next;
			}
			else if(atA.expo > atB.expo) {
				c.appendTerm(atA.coef, atA.expo);
				atA = atA.next;
			}
			else {
				c.appendTerm(atB.coef, atB.expo);
				atB = atB.next;
			}
		}
		//茄 率捞 刚历 场车阑 嫐 贸府
		if(atA == null) {
			while(atB != null) {
				c.appendTerm(atB.coef, atB.expo);
				atB = atB.next;
			}
		}
		
		if(atB == null) {
			while(atA != null) {
				c.appendTerm(atA.coef, atA.expo);
				atA = atA.next;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		Poly a = new Poly();
		a.appendTerm(4, 3);
		a.appendTerm(3, 2);
		a.appendTerm(5, 1);
		
		Poly b = new Poly();
		b.appendTerm(3, 4);
		b.appendTerm(1, 3);
		b.appendTerm(2, 1);
		b.appendTerm(1, 0);
		
		Poly c = OpPoly.add(a, b);
		c.print();
	}
}
