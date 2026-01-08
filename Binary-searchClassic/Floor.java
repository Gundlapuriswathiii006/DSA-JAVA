// Greatest element<=X//
public class Floor {
    public static int Greatest(int[] arr,int X){
        int low=0;
        int high=arr.length-1;
        int ans =-1;
        while(low<=high){
            int mid =  low+(high-low)/2;
            if(arr[mid]<=X){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int X=7;
        int index = Greatest(arr,X);
        System.out.println(index);
        System.out.println(arr[index]);
    }
}
