class arsum{

    public int sum(int ar[])
    {
        int i,sum=0;
        for( i=0;i<5;i++)
        {
             sum+=ar[i];
        }
        return sum;
    }
}

public class ar_sum {
    public static void main(String[] args) {
        arsum obj=new arsum();
        int ar[]={1,2,3,4,5};
        int ans=obj.sum(ar);
        System.out.print("Sum Of Given Array Is:"+ans);
    }
}
