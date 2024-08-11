public class Floor_Number {
//    FLOOR NUMBER : Greaters number which is smaller then or equal to target element
    public static void main(String[] args) {
        int[] ar={1,23,34,45,56,67,89,90,92};
        int target = 78;
        int ans = FindFloorNum(ar,target);
        System.out.println(ans);
    }
    static int FindFloorNum(int[] ar, int target)
    {
        int start =0;
        int end = ar.length-1;
        int f_no = -1;
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
                f_no = ar[mid+1];
                return f_no;
            }
        }
        return ar[end];
    }
}

