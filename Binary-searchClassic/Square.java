public class Square {
    public static int SquareRoot(int x){
    int low=1;
    int high = x;
    int ans =0;
    while(low<=high){
        int mid =low+(high-low)/2;
        if((long)mid*mid<=x){
            ans = mid;
            low=mid+1;
        }else{
            high=mid-1;
        }
    }
    return ans;

    }
public static void main(String[] args){
    int x=169;
    System.out.println(SquareRoot(x));
}
}

