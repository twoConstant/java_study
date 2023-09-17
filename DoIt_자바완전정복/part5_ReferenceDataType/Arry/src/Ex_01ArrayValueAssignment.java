public class Ex_01ArrayValueAssignment {
    public static void main(String[] args) {
        // 3가지 객체 대입 선언을 활용해 array = [1, 2, 3]을 만들어라
        // 1. 각각 대입해주는 방식
        // 스택에 배열 선언, 힙에 객체 선언
        int[] array1 = new int[3];
        // 객체값 대입
        for (int i = 0; i < 3; i++) {
            array1[i] = i + 1;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(array1[i] + "," + " ");
        }
        System.out.println();

        // 2. 한번에 선언해주는 방식 단 배열 선언과 객체 대입을 분리 할 수 있는 형태
        int[] array2 = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.print(array2[i] + "," + " ");
        }
        System.out.println();

        // 3. 한번에 선언해주는 방식 단 배열 선언과 객체 대입을 분리할 수 없는 형태
        int[] array3 = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.print(array3[i] + "," + " ");
        }
        System.out.println();
    }
}
