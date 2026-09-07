// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class BestTimeToBuyAndSellStock {
   public BestTimeToBuyAndSellStock() {
    int [] arr={2,4,5,3,8};
    int min=arr[0];
    int max=0;

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }
        int profit=arr[i]-min;
        if(profit>max)
            {
                max=profit;
            }

    }
    System.out.print(max);
   
}
}