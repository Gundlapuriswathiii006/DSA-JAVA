public class infinite {
    public static int search(int[] arr,int target){
        int low=0;
        int high=1;
        while(high<arr.length && arr[high]< target){
            low=high;
            high=high*2;
            if(high>=arr.length){
                high = arr.length-1;
                break;
            }
        }
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }else if (arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
            return -1;
        
        }
        public static void main(String[] args){
            int[] arr = {3,4,5,6,7,8,9,10,11,12};
            int target=11;
            int result = search(arr,target);
            System.out.println("Index " + result);
        }

    }

