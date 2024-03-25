package kr.or.ddit.study05.sec03;

public class CalExample {

	public static void main(String[] args) {
		CalExample c1 = new CalExample();
		c1.cal(1, 2, Operator.ADD);
	}
	
	
	public double cal(double num1, double num2, Operator op) {
		if(op == Operator.ADD) return add(num1,num2);
		if(op == Operator.SUB) return sub(num1,num2);
		if(op == Operator.MUL) return mul(num1,num2);
		if(op == Operator.DIV) return div(num1,num2);
		return 0;
	}
	
	// + - / * 메소드 각각 만들고 enum type에 추가
	
	public double add(double num1,double num2) {
		return num1 + num2;
	}
	public double sub(double num1,double num2) {
		return num1 - num2;
	}
	public double div(double num1,double num2) {
		return num1 / num2;
	}
	public double mul(double num1,double num2) {
		return num1 * num2;
	}
}
