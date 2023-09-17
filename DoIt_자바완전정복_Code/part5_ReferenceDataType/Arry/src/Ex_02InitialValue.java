import java.util.Arrays;

public class Ex_02InitialValue {
    public static void main(String[] args) {
    // 강제 초기화 = 변수나 객체 선언시 기본값으로 값을 할달 해주는 것
    // 스택 메모리값, 변수 선언만 하면 값이 없음. 즉 스택 메모리는 강제 초기화 되지 않음
        int a;
        int[] b;
//        System.out.println(a);      선언만 되고 값이 없기 때문에 오류
//        System.out.println(b);      선언만 되고 값이 없기 때문에 오류
        int c = 0;      // 스택에 변수 선언하고 값을 할당
        int[] d = null; // 스택에 참조형 자료형 선언하고 주소값을 null로 할당
        System.out.println(c);      // 할당 한 값이 있기 때문에 오류x
        System.out.println(d);      // null로 주소값을 줬기 때문에 오류x

        // 힙 메모리의 초기값(강제 초기화)
        // 기본 자료형 배열
        // false로 강제 초기화
        boolean[] array1 = new boolean[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // 0으로 강제 초기화
        int[] array2 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // 0.0으로 초기화
        float[] array3 = new float[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        // @ 참조 자료형 배열
        // null 값으로 초기화
        String[] array4 = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();
        System.out.println();


        // 배열을 한번에 출력
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
