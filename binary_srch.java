class Binary {
    public int Binary_srch(int ar[], int key) {
        int s = 0;
        int e = ar.length;
        int mid = 0;
        while (s <= e) {

            mid = (s + e) / 2;
            if (ar[mid] == key) {
                return mid;
            } else if (key > ar[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}

public class binary_srch {
    public static void main(String[] args) {

        int ar[] = { 1, 2, 3, 4, 5, 6, 7 };
        int key = 4;
        Binary obj = new Binary();
        int ans = obj.Binary_srch(ar, key);
        System.out.println("Your key On this index : " + ans);
    }
}