package StandardOfJava;

import java.util.*;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println("strArr= " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        // 대소문자 구분 X
        System.out.println("strArr= " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        // 역순 정렬
        System.out.println("strArr= " + Arrays.toString(strArr));
    }
}

