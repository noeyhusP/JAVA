package Fourth_TreeSet;

import java.util.*;

public class TreeSet_Ex1 {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        // HashSet<Integer> tree = new HashSet<>();
        
        tree.add(10);
        tree.add(20);
        tree.add(30);
        tree.add(40);

        System.out.println(tree.size());

        System.out.println("---------------------------------");

        Iterator<Integer> iter = tree.iterator();

        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        // Set과 다르게 순서대로 출력되는 것을 볼 수 있음
    }
}
