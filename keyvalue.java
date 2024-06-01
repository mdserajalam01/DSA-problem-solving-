
import java.util.Scanner;

class FindVal {
    public int Key_val(int ar[], int key) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

public class keyvalue {
    public static void main(String[] args) {

        int ar[] = { 1, 3, 5, 7, 9, 11 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Key Value:");
        int k = sc.nextInt();
        FindVal obj = new FindVal();
        int ans = obj.Key_val(ar, k);
        System.out.println("The Key Value index is :" + ans);
    }
}
