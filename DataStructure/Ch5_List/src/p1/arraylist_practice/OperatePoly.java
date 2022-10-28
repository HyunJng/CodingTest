package p1.arraylist_practice;

public class OperatePoly {	
	public static Polynomial addPoly(Polynomial A, Polynomial B) {
		int degree_A = 0, degree_B = 0, degree_C = 0; // 최고차항
		int index_A = 0, index_B = 0, index_C = 0; // 실제로 차수가 저장되어있는 위치(index)
		int expo_A, expo_B;	// 계산을 위한 논리적 차수
		float coef_A, coef_B, coef_C;
		
		degree_A = A.getDegree(); // 최대차수
		degree_B = B.getDegree();
		
		expo_A = degree_A;
		expo_B = degree_B;
		
		if(degree_A >= degree_B) degree_C = degree_A;
		else degree_C = degree_B;
		Polynomial C = new Polynomial(degree_C);
		
		while(index_A <= degree_A && index_B <= degree_B) {
			if(expo_A > expo_B){ //최대차수가 A가 크다면
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
