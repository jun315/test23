import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        Map<Integer,String> map1 = new LinkedHashMap<>();

        map1.put(1,"aaa");
        map1.put(2,"bbb");
        map1.put(3,"ccc");

        map.put("A",100);
        map.put("B",102);
        //중복키는 이전 키,값을 지금 것으로 업데이트.
        System.out.println(map);
        System.out.println("A : " + (map.get("A")+1));
        System.out.println(map.get("B"));
        if(!map.containsKey("A")) //map.containsValue 도 있다.
            map.put("A",500);


        System.out.println("사이즈  : " + map.size());

        for(Entry<String,Integer> entry : map.entrySet()){
            System.out.println("key : " +entry.getKey() + " value : " + entry.getValue());
        }

        Collection<Integer> values = map.values();
        Integer[] aa = values.toArray(new Integer[0]);

/*
        Collection<String> value = map1.values();
        String[] arr = value.toArray(new String[0]);
*/
        System.out.println("arr : " + aa[0]);
        System.out.println("arr : " + aa[1]);




    }
}
