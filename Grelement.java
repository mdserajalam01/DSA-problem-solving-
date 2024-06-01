//package pw_java.Array_Class;

class GreatestEle {

    public int grEle(int ar[]) {
        int gr = -128;

        for (int i = 0; i < 5; i++) {
            if (gr < ar[i]) {
                gr = ar[i];
            }
        }
        return gr;
    }

    public int SmEle(int ar[]) {
        int sm = 128;
        for (int j = 0; j < 5; j++) {
            if (sm > ar[j]) {
                sm = ar[j];
            }
        }
        return sm;
    }
}

public class Grelement {

    public static void main(String[] args) {

        int ar[] = { 1, 2, 12, 4, 5 };
        GreatestEle obj = new GreatestEle();
        int ans = obj.grEle(ar);
        System.out.println("The Greatest Element is: " + ans);

        int result = obj.SmEle(ar);
        System.out.println("Small Element is : " + result);
    }
}
