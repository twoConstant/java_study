package sec02_Primarydatatype.EX03_PrimaryDataType_2;

public class PrimaryDataType_2 {
	public static void main(String[]args) {
		
		// 문자로 저장하는 방법
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';		// 숫자가 아닌 문자임
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println();
		
		// 정수로 "문자를" 저장하는 방법
		char value4 = 65;		// 65에 대응되는 문자를 value4에 저장한것
		char value5 = 0xac00;	// 16진수로 그대로 value5에 할당 해줌
		char value6 = 51;		// 51에 대응되는 문자를 value6에 할당 해줌
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println();
		
		// 유니코드로 직접 입력
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println();
		
	}

}
