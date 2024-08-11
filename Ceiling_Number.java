public class Ceiling_Number {
//    CEILING NUMBER : Smallest number which is greater or equal to target element
    public static void main(String[] args) {
        System.out.println("Find Celining number");
        int[] ar={1,23,34,45,56,67,89,90,92};
        int target = 49;
        int ans = FindCeilingNum(ar,target);
        System.out.println(ans);
    }
    static int FindCeilingNum(int[] ar, int target)
    {
        int start =0;
        int end = ar.length-1;
        int c_no = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if (target<ar[mid])
            {
                end = mid-1;
            } else if (target > ar[mid]) {
                start = mid+1;
            }
            else {
                c_no = ar[mid+1];
                return c_no;
            }
        }
        return ar[start];
    }
}
