class Solution {
    public int[] solution(String s) {
        int[] answer= {0,0};
        int zero_cnt = 0;
        int cnt = 0;


        if(s.length() < 1 || s.length() > 150000) System.exit(0);
        int pq = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '1') pq++;
        }
        if(pq == 0) System.exit(0);

        while(!s.equals("1")) {
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(ch == '0') zero_cnt++;
            }
            s = s.replace("0","");
            int l = s.length();
            s = Integer.toBinaryString(l);
            cnt++;
        }

        answer[0] = cnt;
        answer[1] = zero_cnt;
        return answer;
    }
}