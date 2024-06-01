import java.util.Scanner;

class square {
    public int sqr(int n) {
        int s = 1;
        s = n * n;
        return s;
    }
}

public class square_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square obj = new square();
        // System.out.println("Enter the value :");
        System.out.println("Enter");

        int num = sc.nextInt();
        int ans = obj.sqr(num);
        System.out.println(ans);
    }
}