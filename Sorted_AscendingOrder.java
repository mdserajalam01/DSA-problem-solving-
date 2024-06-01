
class sorted_array{

    public void sorted(int ar[])
    {
        int size=ar.length;
        int temp=0;
        int i,j;
        for (i=0;i<size;i++)
        {
            for( j=i+1;j<size;j++)
            {
                if(ar[i]>ar[j])
                {
                    /*temp=ar[i];
                    ar[j]=ar[i];
                    ar[i]=temp;*/
                    ar[i]=ar[i]+ar[j];
                    ar[j]=ar[i]-ar[j];
                    ar[i]=ar[i]-ar[j];
                }
            }
        }
            for( i=0;i<size;i++)
            {
                System.out.print(" "+ar[i]);
            }
        
    }
}



public class Sorted_AscendingOrder {
    
    public static void main(String[] args) {
        
        int ar[]={5,4,3,2,1};
        sorted_array obj=new sorted_array();
        obj.sorted(ar);
                
    }
}
