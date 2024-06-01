class counter {

    public int digit_count(int ar[]) {
        int count = 0;
        int size = ar.length;
        for (int i = 0; i < size; i++) {
            count += 1;
        }
        return count;
    }
}

public class digit_count {
    public static void main(String[] args) {

        int ar[] = { 9, 8, 7, 6, 5, 4, 3, 2, 10, 11 };
        counter obj = new counter();
        int ans = obj.digit_count(ar);
        System.out.println("The Total Digits Of Array : " + ans);
    }
}