class Main
{
    public static void main(String[] args)
    {
        int [] arr={1,2,34,56,57};
         int l=0;
         int r=arr.length-1;
         while(l<r)
         {
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
         }
         for(int i=0;i<arr.length;i++)
         {
            System.out.print(arr[i]+" ");
         }

    }
}