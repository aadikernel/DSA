class RepitedeElement {
    public static void main(String args[])
    {
        int [] arr= {1,24,34,45,24,24};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==24)
            {
               count++; 
            }

                
        }
        System.out.print(count);
    }
    
}
