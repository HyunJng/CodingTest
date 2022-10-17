package p2.Polynomial;

public class Polynomial {
	private int degree; // 차수
	private float coef[] = new float[20]; // 계수

	Polynomial(int degree, float[] coef) {
		this.degree = degree;
		this.coef = coef;
	}

	Polynomial(int degree) {
		this.degree = degree;
		for (int i = 0; i < degree; i++)
			this.coef[i] = 0;
	}

	public int getDegree() {
		return degree;
	}

	public float getCoef(int i) {
		return coef[i];
	}

	public void setCoef(int i, float coef) {
		this.coef[i] = coef;
	}
	
	public void printPoly() {
		int temp = this.degree;
		for(int i = 0; i<this.degree; i++) {
			System.out.printf("%3.0fx^%d", this.coef[i], temp--);
		}
		System.out.println();
	}

	
}
