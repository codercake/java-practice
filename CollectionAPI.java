//concept Collection is an interface
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionAPI {
    public static void main(String[] args) {
        //Shrinkable, Expandable and Dynamic

        //removes the duplicate values, just keeps the unique values
        //doesn't allow sequence, not in asc or desc order
        HashSet<Integer> num=new HashSet<>();
        num.add(0);
        num.add(1);
        num.add(2);
        num.add(0);

        System.out.println(num);

        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        // nums.add("Isha");

        for(int n:nums){
            System.out.println(n);
        }
        System.out.println(nums.get(2));
        System.out.println(nums);

        //key-value pair 
        Map<Integer,String> map=new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(4, "JavaScript");
        //when key repeats, it discards the value too

        System.out.println(map);
    }
}
