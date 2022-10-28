package p1.arraylist_practice;

public class Ex5_4 {
	public static void main(String[] args) {
		float a[] = new float[] {4, 3, 5, 0};
		float b[] = new float[] {3, 1, 0, 2, 1};
		Polynomial A = new Polynomial(a.length - 1, a);
		Polynomial B = new Polynomial(b.length - 1, b);
		
		Polynomial C = OperatePoly.addPoly(A, B);
		System.out.printf("A(x) = "); A.printPoly();
		System.out.printf("B(x) = "); B.printPoly();
		System.out.printf("C(x) = "); C.printPoly();
		
	}
}
