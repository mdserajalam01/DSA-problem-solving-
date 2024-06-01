
class common{
    public void commonEle(int a[],int ar[],int arr[])
    {
        int n=a.length;
        int n1=ar.length;
        int n2=arr.length;
        int n3=n+n1+n2;
        System.out.println(n3);
        int s=0;
        
        int temp[]=new int[n3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n1;j++)
            {
                for(int k=0;k<n2;k++)
                {
                    if(a[i]==ar[j]||a[i]==arr[k]||ar[j]==arr[k])
                    {
                       temp[s++]= a[i];
                    }
                }
            }
        }for(int h=0;h<s;h++)
        {
            a[h]=temp[s];
            System.out.println(a[h]);
        }
    }
}


public class commonEle {

        public static void main(String[] args) {
            
            int a[]={1,2,3};
            int ar[]={3,2,1};
            int arr[]={1,2,4};
            common obj=new common();
            obj.commonEle(a, ar, arr);
        }
}
