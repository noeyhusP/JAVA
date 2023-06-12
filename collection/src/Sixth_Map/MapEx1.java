package Sixth_Map;

import java.util.HashMap;

public class MapEx1 {
    public static void main(String[] args) {
        // Key : Integer, Value : String
        HashMap<Integer, String> map = new HashMap<>();

        // 데이터 추가
        map.put(1, "정성훈");
        map.put(2, "이지우");
        map.put(3, "김동욱");
        map.put(4, "박지은");

        // 데이터 꺼내기
        System.out.println(map.get(3));
        System.out.println(map.get(4));

        System.out.println("===================================");
        // 데이터 지우기
        map.remove(1);

        // 확인
        System.out.println(map.get(1));
    }
}
