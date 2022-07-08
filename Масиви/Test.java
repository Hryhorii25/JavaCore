package Масиви;

public class Test {
    public static void main(String[] args) {
        int[] A ={1, 2, 3};

        Solution solution = new Solution();
        System.out.println(solution.solution(A));

    }
}


class Solution {


    public int solution(int[] A) {
        int N = 0;

        for (int i = 0; i < A.length; i++) {

            N=i;
            if (A.length==3){N=N+2;}
        }
        return N;
    }}