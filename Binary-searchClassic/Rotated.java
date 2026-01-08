public class Rotated {
    public int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }

            return -1;
        
    }
        public static void main(String[] args){
            int[] nums = {6,2,3,4,5,1};
            int target = 5;
            Rotated obj=new Rotated();
            int result=obj.search(nums,target);
            System.out.println("answer "+result);


        }
    }

