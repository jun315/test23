import java.util.*;
import java.util.Map.Entry;


public class Solution1 {
    public int[] solution(String[] id_list, String[] report, int k){
        int[] answer = new int[id_list.length];
        String report_id = "";
        String reported_id = "";

        Map<String,String> map = new HashMap<>();
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new LinkedHashMap<>();


        for(int i=0;i<id_list.length;i++){
            map1.put(id_list[i],0);
            map2.put(id_list[i],0);
        }

        for(int i=0;i<report.length;i++){
            report_id = report[i].substring(0,report[i].indexOf(" "));
            reported_id = report[i].substring(report[i].indexOf(" ")+1);
            map.put(report_id,reported_id);
        }


        for(Entry<String,String> entry : map.entrySet()){
                int i = map1.get(entry.getValue())+1;
                map1.put(entry.getValue(),i);
        }

        for(Entry<String,Integer> entry : map1.entrySet()){
            if(entry.getValue()>=k){
                int i = map2.get(entry.getKey())+1;
                map2.put(entry.getKey(),i);
            }
        }

        Collection<Integer> values = map2.values();
        Integer[] aa = values.toArray(new Integer[0]);

        for(int i=0;i< id_list.length;i++){
            answer[i] = aa[i];
        }

        return answer;
    }
}
