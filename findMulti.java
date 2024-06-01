
class findMultOfArray {
    public int multOfArrayEle(int[] ar) {
        int res = 1;
        for (int i = 0; i < ar.length; i++) {
            res *= ar[i];
        }
        return res;
    }
}

public class findMulti {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        findMultOfArray obj = new findMultOfArray();
        int ans = obj.multOfArrayEle(ar);
        System.out.println("Multiple of Array Element: " + ans);
    }
}
