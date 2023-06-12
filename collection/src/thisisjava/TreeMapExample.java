package thisisjava;

// 이것이 자바다 ch15 p685

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // TreeMap 컬렉션 생성
        // TreeMap은 이진트리를 기반으로 한 map 컬렉션으로
        // Treeset과 달리 key, value가 저장된 entry를 저장함
        // TreeMap에 엔트리를 저장하면 키를 기준으로 자동 정렬되는데
        // 부모키와 비교해서 낮은 것은 왼쪽, 높은 것은 오른쪽 자식 노드에 entry 객체를 저장함
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // 엔트리 저장
        treeMap.put("apple", 10);
        treeMap.put("forever", 60);
        treeMap.put("description", 40);
        treeMap.put("ever", 50);
        treeMap.put("zoo", 80);
        treeMap.put("base", 20);
        treeMap.put("guess", 70);
        treeMap.put("cherry", 30);

        // 정렬된 엔트리를 하나씩 가져오기
        // 키 오름차순
        Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
        for (Entry<String, Integer> entry : entrySet)
        {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();

        // 특정 키에 대한 값 가져오기 (현재 sort : 키 오름차순)
        Entry<String, Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞 단어 : " + entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lastEntry();
        System.out.println("제일 뒤 단어 : " + entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lowerEntry("ever");
        System.out.println("ever 앞 단어 : " + entry.getKey() + "-" + entry.getValue() + "\n");

        // 키 내림차순 정렬하기
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();

        for (Entry<String, Integer> e : descendingEntrySet)
        {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        System.out.println();

        // 범위 검색
        System.out.println("[c~h사이의 단어 검색]");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false);
        for (Entry<String, Integer> e : rangeMap.entrySet())
        {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }    
}
