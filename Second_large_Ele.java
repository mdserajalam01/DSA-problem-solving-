//package pw_java.Array_Class;

class slarge {
    public void slargeEle(int ar[]) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        if (ar.length < 2) {
            System.out.println("Not Valid!");
        }
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];

            }
        }
        System.out.println("Largest Element : " + max);
        for (int j = 0; j < ar.length; j++) {
            if (ar[j] > smax && ar[j] < max) {
                smax = ar[j];
            }
        }
        System.out.println("Second Largest Element : " + smax);
    }
}

public class Second_large_Ele {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        slarge obj = new slarge();
        obj.slargeEle(ar);
    }
}
