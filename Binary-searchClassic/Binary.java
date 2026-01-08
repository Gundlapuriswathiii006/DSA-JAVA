public class Binary{
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
        return -1;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7,8,9,10,12};
        int target = 9;
        Binary obj = new Binary();
        int result = obj.search(arr,target);
        System.out.println("index =" +result);

    }
}