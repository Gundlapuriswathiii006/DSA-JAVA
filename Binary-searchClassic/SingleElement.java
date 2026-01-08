public class SingleElement {
    public static int NonDuplicate(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                low=mid+2;
            }else{
                high=mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        System.out.println(NonDuplicate(arr));
    }
}
