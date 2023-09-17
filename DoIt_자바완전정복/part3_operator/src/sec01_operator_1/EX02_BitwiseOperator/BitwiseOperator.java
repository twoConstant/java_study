package sec01_operator_1.EX02_BitwiseOperator;

public class BitwiseOperator {
	public static void main(String[]args) {
		// 자바 메서드로 진법 변환(십진법을 제외하곤 다 "문자열"이다.)
		int data = 13;
		System.out.println(Integer.toBinaryString(data));		// 이진수로 변환 1101
		System.out.println(Integer.toOctalString(data));		// 팔진수로 변환 15
		System.out.println(Integer.toHexString(data));			// 16진수로 변환 d
		System.out.println();
		
		
		System.out.println(Integer.parseInt("1101", 2));		// 문자열을 정수로 변환해주는 것
		System.out.println(Integer.parseInt("15", 8));
		System.out.println(Integer.parseInt("d", 16));
		System.out.println();
		
		// 다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);		// 0b : 이진수, 0 : 8진수, 0x : 16진수
		System.out.println(015);
		System.out.println(0x0D);
		System.out.println();
		
		//비트 연산자
		// AND 연산자 : 모두 1이면 1
		System.out.println(3 & 10);		// 2
		System.out.println(0b0011 & 0b1010);		// 2
		System.out.println();
		
		// @ OR 연산자 : 둘다 0이면 0
		System.out.println(3 | 10);
		System.out.println(0b0011 | 0b1010);		// 1011 --> 11
		System.out.println();
		
		// @XOR 비트 연산자. : 같으면 0 다르면 1
		System.out.println(0b0011 ^ 0b1010);		// 1001 --> 9
		System.out.println();
		
		// @NOR 비트 연산자 : 반대로, 가장 앞은 부호가 됨.
		System.out.println(~0b0011); 				// 0011 --> 3
		
	}

}
