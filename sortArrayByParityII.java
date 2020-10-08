public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] A = {4,2,5,7,6,9,11,12,13,15,17,16,18,20};
        /*for (int x : A) {
            System.out.println(x);
        }*/
        int j=0;
        for (int i=0;i<A.length;i++) {
            if (i%2==A[i]%2) {
                j++;
            }
            if (i%2!=A[i]%2) {
                int temp = A[j];
                if (i!=j && A[i]%2!=A[j]%2) {
                    A[j] = A[i];
                    A[i] = temp;
                    System.out.println("i="+i+";A[i]="+A[i]);
                    System.out.println("j="+j+";A[j]="+A[j]);
                    j++;
                }
            }
        }
        for (int y : A) {
            System.out.println(y);
        }
     }
}
