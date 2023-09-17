package sec01_primarydatatype.Ex02_PrimaryDataType_1;

public class PrimaryDataType_1 {
	public static void main(String[]args) {
		// boolean type : true or false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		//정수(byte, short, int, long)
		byte a = 100;
		short b = -3000;
		int c = 2000000000;
		long d = -100L;		// 변수값 뒤에 L을 써주면 long자료형으로 인식한다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		// 실수(float, double): 음의 실수/ 0 / 양의 실수
		float e = 1.2F;		// 변수값 뒤에 F 써주면 float 자료형으로 인식함
		double f = -1.5;
		double g = 5;		// 자동 타입 변환됨
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		
		
	}

}
