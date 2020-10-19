class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j=0;
        for (int i=0;i<A.length;i++) {
            while (j<A.length-1 && j%2==A[j]%2 ) {
                j++;
            }
            if (i<=j && j<A.length-1) {
                i=j+1;
            }
            if (i%2!=A[i]%2) {
                int temp = A[j];
                if (i!=j && A[i]%2!=A[j]%2) {
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
        return A;
    }
}
