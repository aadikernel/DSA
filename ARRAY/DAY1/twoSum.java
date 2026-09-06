class Main
{
    public static void main(String args[])
    {
        int arr[]={2,4,4,3};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==8)
                {
                    System.out.print(i + "  "+j);
                }
            }
        }
    }
}