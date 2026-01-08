public class MinRotated {
    public static int Rotated(int[] nums){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]<nums[high]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return nums[low];
    }
    public static void main(String[] args){
        int[] nums={4,5,6,7,0,1,2};
        System.out.println(Rotated(nums));
    }
}
