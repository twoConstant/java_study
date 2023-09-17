package sec02_Primarydatatype.EX06_OperationBetweenDataType;

public class OperationBetweenDataType {
	public static void main(String[]args) {
		// 같은 자료형의 연산
		int value1 = 3 + 5;
		int value2 = 8/5;		// 언뜻 안될 것 같지만 = 기준으로 둘다 int형태기 때문에 가능하며 결과값이 int로 나옴
		float value3 = 3.0f + 5.0f;		// 기본적으로 소수점 표현은 double 자료형으로 인식된다
		double value4 = 3.0 + 5.0;
		
		byte data1 = 3;		// byte의 경우 -100~100 까지 표현 가능
		short data2 = 5;	// short의 경우 -3000~3000
		// byte vlaue5 = data1 + data2;		// 오류 나는 이유는 int보다 작은 애들끼리 연산은 int로 되기때문에 자료형이 안맞음
		int value5 = data1 + data2;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();
		
		// 다른 자료형 간의 연산
		double value6 = 6 + 3.5;		// int + double = double
		int value7 = 5 + (int)3.8;		// int + int = int(반 내림 박아버리네) 
		double value8 = 5/2.0;			// int/double = double
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4;		// byte + short = int
		double value10 = data3 + data4;	// int --> double로 up-casting
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
		
		
	}
}
