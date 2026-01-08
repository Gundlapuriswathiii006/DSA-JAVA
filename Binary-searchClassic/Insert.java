public class Insert {
    public int search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr = {1,3,4,5,7,8,9,11,13};
        int target=10;
        Insert obj = new Insert();
        int result = obj.search(arr,target);
        System.out.println("index=" +result);

    }
}
