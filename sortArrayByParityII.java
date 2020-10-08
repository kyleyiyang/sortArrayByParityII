public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] A = {4,2,5,7,6,9,11,12,13,15,17,16,18,20};
        int j=0;
        for (int i=0;i<A.length;i++) {
            while (j%2==A[j]%2 && j<A.length-1) {
                j++;
            }
            
            if (i%2!=A[i]%2) {
                int temp = A[j];
                if (i!=j && A[i]%2!=A[j]%2) {
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
        for (int y : A) {
            System.out.println(y);
        }
     }
}
