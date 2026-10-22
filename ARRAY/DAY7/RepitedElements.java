class RepitedElements {
    public static void main(String args[])
    {
        boolean istrue=false;
        int [] arr={12,34,3434,3,45,3,34};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    
                    System.out.print(arr[i]);
                    istrue =true;
                    
                }
            }
            if(istrue)
        {
            break;
        } 
        }
        
        
        
    }
    
}
