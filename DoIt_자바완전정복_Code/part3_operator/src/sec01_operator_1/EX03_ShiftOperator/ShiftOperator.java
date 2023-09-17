package sec01_operator_1.EX03_ShiftOperator;

public class ShiftOperator {
	public static void main(String[]args) {
		// 산술 시프트 : << , >> 부호를 담당하는 비트는 움직이지 않음
		// @ <<
		System.out.println(3 << 1);		// 3 * 2 = 6
		System.out.println(-3 << 1);	// -3 * 2 = -6
		System.out.println(3 << 2);		// 3 * 4 = 12
		System.out.println(-3 << 2);	// -3 * 4 = -12
		System.out.println();
		
		
		// @ >>
		System.out.println(5 >> 1);		// 5 / 2 = 2.5 --> 소수점 버림 2
		System.out.println(-5 >> 1);	// -5 / 2 = -2.5 --> 소수점 버림 -2
		System.out.println(5 >> 2);		// 5 / 4 --> 1
		System.out.println(-5 >> 2);	// -5 / 4 --> -1
		System.out.println();
		
		// 논리 시프트(>>>) : 부호도 같이 움직임
		System.out.println(3 >>> 1);		// 0b011 --> 0b001 --> 1
		System.out.println(-3 >>> 31);		// 0b1111...1101 --> 0b000...0001 --> 1
		
		
	}

}
