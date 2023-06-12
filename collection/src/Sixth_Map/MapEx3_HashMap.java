package Sixth_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx3_HashMap {
    public static void main(String[] args) {
        // 번호(int), 이름(String)으로 구성된 key-value가 있는 map 생성
        // map 자료구조에 5개 만들고
        // 이를 iterator로 순회하는 코드 작성

        // map 생성
        HashMap<Integer, String> map = new HashMap<>();

        // 데이터 넣기(5개)
        map.put(1, "정발산");
        map.put(2, "산기슭");
        map.put(3, "슭곰발");
        map.put(4, "발냄새");
        map.put(5, "새타령");

        // iterator로 순회
        Set<Integer> keySet = map.keySet();
        // for (Integer key : keySet)
        // {
        //     System.out.println(map.get(key));
        // }
        
        Iterator<Integer> iter = keySet.iterator();

        // 또는
        // Iterator<Integer> iter = map.keySet().iterator();
        // 데이터타입을 결정해주는 것은 iterator가 읽어야 할 데이터범위를 지정해주는 것

        while (iter.hasNext())
        {
            int i = iter.next();
            System.out.printf("key : %d, value : %s \n" , i , map.get(i));
        }
        // hashMap이 hash를 이용한 자료구조인 이유 :
        // key가 중복되면 안 되는데 key의 hash값을 가지고 와서 비교하기 때문
    }
}
