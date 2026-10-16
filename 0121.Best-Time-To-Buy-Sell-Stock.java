class Solution {
    public int maxProfit(int[] price) {
        if (price == null || price.length < 2) {
            return 0;
        }

        int i=0;
        int maxProfit=0;
        int minPrice=price[0];
        while(i<price.length){

            if(price[i]<minPrice){
                minPrice=price[i];
            }
            int profit=price[i]-minPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }

            i++;
        }
        return maxProfit;
    }
}
