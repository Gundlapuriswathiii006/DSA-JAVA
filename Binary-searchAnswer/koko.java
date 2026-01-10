public class koko {
    public static boolean canEat(int[] piles,int k,int H){
        long hours = 0;
        for(int pile:piles){
            hours+=(pile+k-1)/k;
        }
        return hours<=H;

    }
    public static int minEatingspeed(int[] piles,int h){
        int low = 0;
        int high = 0;
        for(int pile:piles){
            high = Math.max(high,pile);
        }
        int ans = high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canEat(piles,h,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] piles = {3,4,5,6,7,8};
        int h=10;
        int result = minEatingspeed(piles,h);
        System.out.println("Minimum eating speed of koko is: " +result);
    }
}
