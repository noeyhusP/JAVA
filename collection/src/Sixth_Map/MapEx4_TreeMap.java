package Sixth_Map;

import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class MapEx4_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        // HashMap<Integer, String> tMap = new HashMap<>();

        tMap.put(12, "정성훈");
        tMap.put(4, "이지우");
        tMap.put(434, "김재운");
        tMap.put(85, "민동기");
        tMap.put(32, "정재근");
        tMap.put(3, "박수현");
        tMap.put(55, "최이서");
        tMap.put(61, "성유림");

        Set<Integer> kSet = tMap.keySet();
        
        Iterator<Integer> iter = kSet.iterator();

        int k;
        while(iter.hasNext())
        {
            k = iter.next();
            System.out.printf("%d %s\n", k, tMap.get(k));
        }
    }
}
