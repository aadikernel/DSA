class Main
{
    public static void main(String[] args)
    {
        int [] arr1={1,2,3,3};
        int [] arr2={2,34,3,3};
        int [] merge=new [arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++)
        {
           
            merge[k]=arr1[i];
            k++;
        }
        for(int i=0;i<arr2.length;i++)
        {
           merge[k]=arr2[i];
           k++;
        }
        for(int i=0;i<merge.length;i++)
        {
            System.out.print(merge[i]);
        }
    }
}