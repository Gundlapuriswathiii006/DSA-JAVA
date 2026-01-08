public class NearlySorted {
    public static int Sorted(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            if(mid-1>=low && arr[mid-1]==target)
                return mid-1;
                if(mid+1<=high && arr[mid+1]==target)
                    return mid+1;
                    if(target<arr[mid])
                        high=mid-2;
                    else
                        low=mid+2;
                    }
                return -1;
            }
             public static void main(String[] args){
            int[] arr={10,3,40,20,50,80,70};
            int target=40;
            System.out.println(Sorted(arr,target));
        }
       
    
    }


