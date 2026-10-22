class Main{
    public static void main(String args[])
    {
        int [] arr={2,2,4,4,4};
        int [] arr1=new int[arr.length*2];
         int k=0;
        for(int i=0;i<arr.length;i++)
        {
           
            arr1[k]=arr[i];
            k++;
        }
         for(int i=0;i<arr.length;i++)
        {
           
            arr1[k]=arr[i];
            k++;
        }
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]);
        }
         
        
    }
}