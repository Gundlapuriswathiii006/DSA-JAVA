public class Missing {
    public static int Find(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid =low+(high-low)/2;
            if(arr[mid]==mid+1){
                low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return low+1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,6,7,8,9};
        System.out.println(Find(arr));
    }
}
