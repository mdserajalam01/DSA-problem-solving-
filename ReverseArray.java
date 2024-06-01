
class Reverse_Array {

    public void rev(int ar[]) {
        int s = 0;
        int e = ar.length - 1;
        int temp = 0;
        while (s <= e) {

            temp = ar[s];
            ar[s] = ar[e];
            ar[e] = temp;
            s++;
            e--;
        }
        System.out.println("After Reverse Array Element : ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i]);
        }
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        System.out.println("Before Reverse Array Element :");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i]);
        }
        System.out.print("\n");
        Reverse_Array obj = new Reverse_Array();
        obj.rev(ar);
        // System.out.println(ans);
    }
}
