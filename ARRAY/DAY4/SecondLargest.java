class Main
{
    public static void main(String[] args)
    {
        int [] arr={2,4};
        int lar=arr[0];
        int slar=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
            {
            slar=lar;
            lar=arr[i];
            }
            else if(arr[i]>slar)
            {
                slar=arr[i];
            }
        }
        System.out.print(slar);

        
    }
}