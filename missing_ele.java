import java.util.concurrent.CountDownLatch;

class missing {

    public void missEle(int ar[]) {
        int sum = 0;
        int n = ar.length;
        int k = 0;
        int temp = 0;
        int i, j;
        for (i = 0; i < ar.length; i++) {
            for (j = i + 1; j < n - 1; j++) {
                if(ar[i] + ar[i] != ar[j])
                {
                    k=ar[j]-1;
                }
                else if (ar[i] + ar[j] == ar[j]+1 ) {
                    //k=ar[j]-1;
                    continue;

                } else {
                    temp = ar[j] + 1;
                    // System.out.println(ar[j] + 1);
                }
            }
        }
        System.out.println(temp+" "+k);

    }
}

public class missing_ele {

    public static void main(String[] args) {

        int ar[] = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
        missing obj = new missing();
        // int ans =
        obj.missEle(ar);
        // System.out.println(ans);
    }
}
