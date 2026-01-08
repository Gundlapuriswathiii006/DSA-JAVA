public class FirstOccurance {
    public int search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans =-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        

        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,5,6,7,9,10};
        int target=3;
        FirstOccurance obj=new FirstOccurance();
        int result=obj.search(arr,target);
        System.out.println("index="+result);
    }
}
