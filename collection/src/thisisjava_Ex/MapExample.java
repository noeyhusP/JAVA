package thisisjava_Ex;

// 이것이자바다 p703 9번

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);
        map.put("pink", 98);
        map.put("black", 72);

        String name = null; // 최고점수 받은 아이디 저장
        int maxScore = 0; // 최고점수를 저장
        int totalScore = 0; // 점수 합계를 저장

        // 여기에 코드 작성
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();

        String key;
        int value;
        int preValue = 0;
        while(iter.hasNext())
        {
            key = iter.next(); 
            value = map.get(key);
            totalScore += value;  
            if (value > preValue)
            {
                name = key;
                maxScore = value;
            }    
            preValue = value;
        }
        totalScore = totalScore / map.size(); 

        // enhanced for문 ver
        // for (String getkey : keySet)
        // {
        //     System.out.println(map.get(getkey));
        // }

        System.out.println("최고점수 id: " + name);
        System.out.println("최고 점수: " + maxScore);
        System.out.println("점수 합계: " + totalScore);
    }    
}
