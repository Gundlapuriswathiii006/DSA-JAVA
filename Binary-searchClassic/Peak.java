public class Peak {
    public static int Find(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int result = Find(arr);
        System.out.println("peak element= " +arr[result]);

    }
}
