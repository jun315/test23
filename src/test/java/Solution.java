import java.util.Arrays;
public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] count = new int[id_list.length]; //신고받은 횟수.
        boolean[] suspended_id = new boolean[id_list.length]; //아이디 정지여부

        Arrays.fill(answer,0);
        Arrays.fill(count,0);
        Arrays.fill(suspended_id,false);


        for (int i = 0; i < report.length; i++) {
            boolean check1 = false; //중복신고 방지
            int x = report[i].indexOf(" ");
            String reported_id = report[i].substring(x+1);
            for(int j = 0;j < i;j++){
                if(report[i].equals(report[j])){
                    check1 = true;
                }
            }
            if(check1 == false){
                for (int j = 0; j < id_list.length; j++) {
                    if(id_list[j].equals(reported_id)) {
                        count[j] += 1;
                    }
                    if(count[j] >= k){
                        suspended_id[j] = true;
                    }
                }
            }
        }

        for(int i=0;i<report.length;i++){
            boolean check1 = false;
            int x = report[i].indexOf(" ");
            String reported_id = report[i].substring(x+1);
            String report_id = report[i].substring(0,x);
            for(int j = 0;j < i;j++){
                if(report[i].equals(report[j])){
                    check1 = true;
                }
            }

            if(check1 == false){
                for(int j= 0;j<id_list.length;j++){
                    if(reported_id.equals(id_list[j])){
                        if(suspended_id[j] == true){
                            for(int z=0;z<id_list.length;z++){
                                if(report_id.equals(id_list[z])){
                                    answer[z] += 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        return answer;
    }
}
