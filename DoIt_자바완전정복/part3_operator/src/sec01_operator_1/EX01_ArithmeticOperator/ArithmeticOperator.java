package sec01_operator_1.EX01_ArithmeticOperator;

public class ArithmeticOperator {
	public static void main(String[]args){
		//산술 연산자
		System.out.println(2 + 3);		// 5
		System.out.println(7/2);		// 3.5 --> 3 소수점 버림, 정수형
		System.out.println(8%5);		// 3, 모듈러 연산자 파이썬과 동일
		System.out.println();
		
		// 증감연산자 @case1
		int value1 = 3;
		value1++;
		System.out.println(value1);		// 4
		int value2 = 3;
		++value2;
		System.out.println(value2);		// 4
		System.out.println();
		
		// 증감연산자 @case2
		int value3 = 3;				// 3
		int value4 = value3++;		// value4 = 3, value3 = 4, 증감연산자가 우선순위가 할당 뒤로 밀림
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		int value5 = 3;				// 3
		int value6 = ++value5;		// value6 = 4, value5 = 4, 증간연산자의 우선순위가 할당보다 빠름
		System.out.println(value5);	
		System.out.println(value6);
		System.out.println();
		
		
		// 증감연산자 @case3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;		// 10, ++value8이 가장 먼저 실행, value7--이 마지막에 실행
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println();
		
	}
	
}
