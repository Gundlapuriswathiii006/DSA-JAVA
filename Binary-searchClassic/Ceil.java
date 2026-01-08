// Smallest element>=X//
public class Ceil {
    public static int Smallest(int[] arr,int X){
        int low=0;
        int high = arr.length-1;
        int ans =-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]>=X){
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int X=9;
        int result = Smallest(arr,X);
            System.out.println(result);
            System.out.println(arr[result]);
        }
    }

