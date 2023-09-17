package sec01_datatype.EX03_RangeOfVariableUse;

public class RangeOfVariableUse {
	public static void main(String[] args) {
		int value1 = 3;		//정수형 value1 선언
		{
			int value2 = 5;	// 2번째 중괄호 영역내에서 선언
			System.out.println("value1 : " + value1);
			System.out.println(value2);		// println은 문자와 정수혀을 섞어서 출력하지 못한다.
		}		// value2 변수 소멸 시점
		
		System.out.println(value1);
		// System.out.println(value2);		// 이미 소멸한 변수이기 때문에 오류가 뜸
	}

}
