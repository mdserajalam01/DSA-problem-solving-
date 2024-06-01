
class Rev {

    public void Rev_Array(int a[]) {
        int n = a.length;
        // int ar[]=new ar(n);
        /*
         * for (int i = n-1; i >=0; i--) {
         * System.out.print(a[i]);
         * }
         */
        int k = n - 1;
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[k++] = a[i];
            
        }
        for (int j = 0; j < k; j++) {
            System.out.println(ar[j]);
        }

    }
}

public class Reverse {
    public static void main(String[] args) {

        int ar[] = { 1, 2, 3 };
        Rev obj = new Rev();
        obj.Rev_Array(ar);
    }
}
