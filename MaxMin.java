
class FindmaxminEle {
    public int Find(int ar[]) {
        int max = -128;
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        return max;
    }

    public int Find1(int ar[]) {
        int min = 128;
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        return min;
    }

}

public class MaxMin {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        FindmaxminEle obj = new FindmaxminEle();
        int ans1 = obj.Find(ar);
        System.out.println("Maximum Element : " + ans1);
        int ans2 = obj.Find1(ar);
        System.out.println("Minimum Element : " + ans2);
    }
}
