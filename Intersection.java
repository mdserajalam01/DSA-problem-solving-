class array {
    public void intersec_array(int a[], int ar[]) {
        int n1 = a.length;
        int n2 = ar.length;
        int i, j;
        int k = 0;

        int temp[] = new int[n1];
        for (i = 0; i < n1; i++) {
            for (j = 0; j < n2; j++) {
                if (a[i] == ar[j]) {
                    temp[k++] = a[i];
                }
            }
        }
        for (i = 0; i < k; i++) {
            a[i] = temp[k];
            System.out.print(ar[i]);
            // return a[i];
        } // return -1;
    }
}

public class Intersection {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int ar[] = { 1, 3, 5, 2, 7 };
        array obj = new array();
        obj.intersec_array(a, ar);
        // System.out.print(" "+ans);
    }
}