import java.util.Arrays;
public class Ex_03ReadArrayData {
    public static void main(String[] args) {
        // 배열 생성
        int[] array = new int[]{1, 2, 3, 4, 5};
        
        // for + length를 활용하기
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // for-each문 활용하기
        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();

        // toString 메서드 활용하기
        System.out.println(Arrays.toString(array));


    }
}

