import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];

        int[] sto = new int[progresses.length];

        for (int i = 0; i < speeds.length; i++) {
            if((100 -progresses[i]) % speeds[i] == 0) {
                sto[i] = (100 - progresses[i]) / speeds[i];
            }
            else {
                sto[i] = (100 - progresses[i]) / speeds[i] + 1;
            }
        }

        int cnt = 1;
        int asw_idx = 0;
        int a = sto[0];
        for (int i = 1; i < speeds.length; i++) {
            if(a >= sto[i]) {
                cnt++;
            }
            else {
                answer[asw_idx++] = cnt;
                cnt = 1;
                a = sto[i];
            }
        }
        answer[asw_idx++] = cnt;


        return Arrays.copyOf(answer,asw_idx);
    }
}