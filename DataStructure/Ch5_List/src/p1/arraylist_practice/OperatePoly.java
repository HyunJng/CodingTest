package p1.arraylist_practice;

public class OperatePoly {	
	public static Polynomial addPoly(Polynomial A, Polynomial B) {
		int degree_A = 0, degree_B = 0, degree_C = 0; // �ְ�����
		int index_A = 0, index_B = 0, index_C = 0; // ������ ������ ����Ǿ��ִ� ��ġ(index)
		int expo_A, expo_B;	// ����� ���� ���� ����
		float coef_A, coef_B, coef_C;
		
		degree_A = A.getDegree(); // �ִ�����
		degree_B = B.getDegree();
		
		expo_A = degree_A;
		expo_B = degree_B;
		
		if(degree_A >= degree_B) degree_C = degree_A;
		else degree_C = degree_B;
		Polynomial C = new Polynomial(degree_C);
		
		while(index_A <= degree_A && index_B <= degree_B) {
			if(expo_A > expo_B){ //�ִ������� A�� ũ�ٸ�
				C.setCoef(index_C++, A.getCoef(index_A++));
				expo_A--;
			}
			else if(expo_A == expo_B) {
				C.setCoef(index_C++, (A.getCoef(index_A++) + B.getCoef(index_B++)));
				expo_A--;
				expo_B--;
			}
			else {
				C.setCoef(index_C++, A.getCoef(index_B++));
				expo_B--;
			}
		}
		return C;
	}
}
