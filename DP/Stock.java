//2110 leetcode : Number of smooth periods of descent of stocks
class Stock{
    public long descentPeriods(int[] price){
        int n = price.length;
        int count = 1; // to increment the length of current smooth descent period
        int res = 1; // to increment the total number of descents
        for(int i = 1; i < n; i++){
            if(price[i - 1] - price[i] == 1){
                count++;
            }else{
                count = 1;
            }
            res += count;
        }
        return res;
    }
    public static void main(String[] args){
        Stock stock = new Stock(); // if not created the above method will be static
        int []price = {3,2,1,4};
        System.out.println(stock.descentPeriods(price)); //object created to call the method because its non static method , hence we need to create object to call the method.
    }
}