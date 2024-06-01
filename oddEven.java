
class check {
    public int OddEven() {
        int count = 0;
        int ar[] = new int[5];
        // ar[]={1,2,3,4,5};

        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        ar[3] = 4;
        ar[4] = 5;

        for (int i = 0; i < 5; i++) {
            if (ar[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
        // System.out.print(count);
    }
}

public class oddEven {
    public static void main(String[] args) {

        check obj = new check();
        int ans = obj.OddEven();
        System.out.print(ans);
    }

}
