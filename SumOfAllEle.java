
//import java.util.Scanner;

class SumElement {

    public int SumEle(int ar[]) {
        int sum = 0;
        for (int n : ar) {
            sum += n;
        }
        return sum;
    }
}

public class SumOfAllEle {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5, 6 };

        SumElement obj = new SumElement();
        int ans = obj.SumEle(ar);
        System.out.println("Sum Of All Element : " + ans);

    }
}
