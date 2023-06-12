package Fourth_TreeSet;

import java.util.Comparator;

public class Person_StringCompare implements Comparator<Person> {

    // 이름 오름차순
    @Override
    public int compare (Person p1, Person p2)
    {
        return p1.getName().compareTo(p2.getName());        
    }

}   
