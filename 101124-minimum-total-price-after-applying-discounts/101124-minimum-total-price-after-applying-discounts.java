class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double totalminprice = 0;
        int pIndex = prices.length-1;
        int dIndex = discounts.length-1;

        while(pIndex >=0 && dIndex >=0) {
            double price = prices[pIndex];
            double discount = discounts[dIndex];
            totalminprice += (price * (100.0 - discount)) / 100.0;
            pIndex--;
            dIndex--;
        }
        while (pIndex >= 0) {
            totalminprice += prices[pIndex];
            pIndex--;
        }
        return totalminprice;
    }
}