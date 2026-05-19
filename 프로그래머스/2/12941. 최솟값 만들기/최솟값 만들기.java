class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        if(A.length > 1000 || B.length > 1000) {
            System.exit(0);
        }
        if(A.length != B.length) {
            System.exit(0);
        }

        for (int i = 0; i < A.length-1; i++){
            for (int j = i; j < A.length; j++) {
                if(A[i] < A[j]) {
                    int tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }
        for (int i = 0; i < B.length-1; i++){
            for (int j = i; j < B.length; j++) {
                if(B[i] > B[j]) {
                    int tmp = B[i];
                    B[i] = B[j];
                    B[j] = tmp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}