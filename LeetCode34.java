public class LeetCode34 {
    public static void main(String[] args) {
        System.out.println("First and last position of element in sorted array");
        int [] ar = {5,7,7,8,8,9};
        int target = 8;
        int ans = PositionOfElement(ar, target);
        System.out.println(ans);
    }
    static int   PositionOfElement(int[] ar ,int target)
    {
        int start =0;
        int end = ar.length-1;
        while (start<=end)
        {
            int mid= start+(end-start)/2;
            if (target<ar[mid])
            {
                end = mid-1;
            }
            else if(target > ar[mid])
            {
                start = mid +1;
            }
            else {
//                end = mid-1;
////                return mid;
                if (mid!=ar[0]){
                    end = mid-1;
                }
                return mid;

            }

        }
        return -1 ;

    }
}
