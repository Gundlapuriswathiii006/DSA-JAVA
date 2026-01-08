public class Bitonic {
    public static int Peak(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1])
                low=mid+1;
            else
                high=mid;
        }
        return low;
    }
    public static int descBinary(int[] arr,int low,int high,int target){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid]> target)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
    public static int ascBinary(int[] arr,int low,int high,int target){
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid]< target)
                low=mid+1;
            else
                high=mid-1;
}
return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,3,8,12,9,5,2};
        int target = 9;
        int ans  = search(arr,target);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target){
        int peak = Peak(arr);
        int left = ascBinary(arr,0,peak,target);
        if(left!=-1) return left;
        return descBinary(arr,peak+1,arr.length-1,target);
    }
}
