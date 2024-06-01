class OddEven {

    public void sum(int ar[]) {
        int evenSum = 0, oddSum = 0, i;
        for (i = 0; i < 5; i++) {
            if (ar[i] % 2 == 0) {
                evenSum += ar[i];
            } else {
                oddSum += ar[i];
                       
            }
        }
        System.out.println("Sum of Even: "+evenSum+" Sum of Odd: "+oddSum);

        
    }
}

public class sumOfOddEven {

    public static void main(String[] args) {

        OddEven obj = new OddEven();
        int ar[] = { 1, 2, 3, 4, 5 };
        obj.sum(ar);
    }

}
