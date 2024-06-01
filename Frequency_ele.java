//package pw_java.Array_Class;
import java.util.Scanner;

class Frequency{

    public int find_friquency(int ar[],int target)
    {
    int n=ar.length;
    int counter=0;
    for (int i : ar)
     {
        if(i==target)
        {
            counter+=1;
        }    
    }return counter;
}
}
public class Frequency_ele {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter target :");
        int target=sc.nextInt();
         int ar[]={1,2,1,2,5,7,9,5,2,2};
         Frequency obj=new Frequency();
         int ans=obj.find_friquency(ar, target);
         System.out.println("Frequency of the Element : "+ans);
    }
}
