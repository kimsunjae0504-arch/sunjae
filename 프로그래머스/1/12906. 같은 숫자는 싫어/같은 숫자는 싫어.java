import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        int cnt = 0;
        int chx = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != chx) {
                answer[cnt++] = arr[i];
                chx = arr[i];
            }
        }
        answer = Arrays.copyOf(answer,cnt);

        return answer;
    }
}