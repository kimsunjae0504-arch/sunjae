class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = i;
        }
        
        for (int i = 1; i < n+1; i++) {
            int sum = 0;
            for (int j = i; j < n+1; j++) {
                sum += arr[j];
                if(sum > n) break;
                if(sum == n) {
                    answer++;
                    break;
                }
            }
        }
        
        
        
        return answer;
    }
}