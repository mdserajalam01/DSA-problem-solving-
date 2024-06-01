import java.util.Scanner;

class Avg_Array {

    public int Find_Avg(int ar[]) {
        int size = ar.length;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < size; i++) {
            sum += ar[i];
            avg = (sum / size);
        }
        return avg;
    }
}

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[5];
        System.out.println("Enter the Element: ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        // int ar[]={1,2,3,4,5};
        Avg_Array obj = new Avg_Array();
        int ans = obj.Find_Avg(ar);
        System.out.println(ans);
    }
}
