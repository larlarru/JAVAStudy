package e_oop;

public class Calculator {
	//더하기 빼기 곱하기 나누기 나머지 각각 하나의 메소드씩 만듬 메소드는 2개의 파라미터 가짐 그리고 그걸 연산해서 데이터 가짐
	
	//더하기 메소드
	double add(double x, double y){
		return x + y;
	}
	//빼기 메소드
	double sub(double x, double y){
		return x - y;
	}
	//곱하기 메소드
	double mul(double x, double y){
		return x * y;
	}
	//나누기 메소드
	double div(double x, double y){
		return x / y;
	}
	//나머지 메소드
	double rem(double x, double y){
		return x % y;
	}

}
