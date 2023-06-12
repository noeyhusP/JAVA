package Sixth_Map;

import java.util.HashMap;
import java.util.Set;

public class MapEx2 {
    public static void main(String[] args) {
        // id, name 으로 key, value 구성한 맵 만들기
        // 데이터 3개 넣어보고
        // 출력해보기
        HashMap<String, String> map = new HashMap<>();

        // 데이터 넣기
        map.put("A", "홍길동");
        map.put("B", "홍이동");
        map.put("C", "홍삼동");

        // 데이터 출력
        // Map은 Iterable 안 됨
        // = enhanced for문도 쓸 수 없음
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("C"));
        
        System.out.println("==================================");
        // Map 순회하는 방법
        Set<String> keySet = map.keySet();
        // key만 가져와서 Set에 집어넣어 만들어줌 
        // (순서x, 중복x 이므로 Set이 가장 적절함)
        for (String key : keySet)
        {
            System.out.println(map.get(key));
        }

    }
}
