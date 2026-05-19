class Solution {
    boolean solution(String s) {
        boolean answer =  true;

        int cnt = 0;
        
        if(s.length() > 100000) {
            System.exit(0);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') cnt++;
            else if(ch == ')')  cnt--;
            else {System.exit(0);}

            if(cnt < 0) return false;
        }
        if(cnt != 0) return false;



        return answer;
    }
}