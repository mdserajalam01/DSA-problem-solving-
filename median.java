class median_Array{

    public void medainEle(int ar[])
    {
        double median;
        int m1=0;
        int m2=0;
        if(ar.length%2==0)
        {
            m1=ar.length/2;
            m2=m1-1;
            median=(ar[m1]+ar[m2])/2.0;
        }else{
            int mid=ar.length/2;
            median=ar[mid];
        }System.out.print(median);
    }
}
public class median{
    public static void main(String[] args) {
        
        int ar[]={1,2,3,4,5,6,7};
        median_Array obj=new median_Array();
        obj.medainEle(ar);       
    }
}