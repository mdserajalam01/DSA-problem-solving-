
//import java.util.Scanner;
class duplicate {

    public void remove_ele(int ar[]) {
        int n = ar.length;
        int k = 0;
        int temp[] = new int[n];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {

                    ar[i] = -1;

                }
            }
        }
        for (i = 0; i < n; i++) {
            // ar[i]=temp[k];
            System.out.print(" "+ar[i]);
            // return ar[i];
        }
        // return -1;
    }
}

public class Remove_duplicate {

    public static void main(String[] args) {
        int ar[] = { 1, 1, 2, 3, 2, 4, 5 };
        duplicate obj = new duplicate();
        obj.remove_ele(ar);
        // System.out.println(ans);
    }
}
