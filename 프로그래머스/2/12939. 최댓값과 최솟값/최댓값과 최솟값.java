class Solution {
    public String solution(String s) {
        String answer = "";
        String a = s.replace("\"","");
        String[] str = a.split(" ");
        int[] arr = new int[str.length];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
                             
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        
        answer = answer + min + " " + max;
        
        
        return answer;
    }
}