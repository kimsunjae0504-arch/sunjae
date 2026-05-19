class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isFirst = true;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == ' ') {
                answer += ch;
                isFirst = true;
            }
            else {
                if (isFirst) {
                    answer += Character.toUpperCase(ch);
                    isFirst = false;
                }
                else {
                    answer += Character.toLowerCase(ch);
                }
            }
        }
        
        return answer;
    }
}