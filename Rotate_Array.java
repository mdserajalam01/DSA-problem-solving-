//package pw_java.Array_Class;

class Rotate {
    public void Rot_Ele(int ar[], int d) {
        int size = ar.length-1;
        int k = 0;
        int i;
        int a[] = new int[size];
        for (i = 0; i < d; i++) {
            a[k++] = ar[i];
        }
        for (i = d; i < size; i++) {
            a[k++] = ar[i];
        }
        for (i = 0; i <size; i++) {
            ar[i] = a[k];
            System.out.println(ar[i]);
        }
    }
}

public class Rotate_Array {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 3, 4, 5 };
        Rotate obj = new Rotate();
        obj.Rot_Ele(ar, 2);
    }
}
