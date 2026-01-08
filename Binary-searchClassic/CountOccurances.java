public class CountOccurances {
    public static int Count(int[] arr,int target){
        int count =0;
        int low=0;
        int high = arr.length-1;
        int first=-1;
        int last=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(first==-1) return 0;
            low=0;
            high=arr.length-1;
            while(low<=high){
             int mid = low+(high-low)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return last-first+1;
    }
public static void main(String[] args){
    int[] arr={1,2,3,4,4,4,5,5,5,5,5,5,6,7,8};
    int target=4;
    int result = Count(arr,target);
    System.out.println("count=" +result);

    }
}
