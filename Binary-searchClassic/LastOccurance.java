public class LastOccurance {
    public int search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans =-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                ans = mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5,5,5};
        int target=4;
        LastOccurance obj = new LastOccurance();
        int result = obj.search(arr,target);
        System.out.println("index=" +result);
    }
}
