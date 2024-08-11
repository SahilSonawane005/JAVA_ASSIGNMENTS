public class Mountain_array {
    public static void main(String[] args) {
        int[] ar = {0,10,5,1};
        int ans = findPeakElement(ar);
        System.out.println(ans);
    }
    static int findPeakElement(int[] ar){
        int start =0;
        int end = ar.length-1;
        while(start<end){
            int mid = start = (end-start)/2;
            if (ar[mid]<ar[mid+1]){
                start = mid+1;
            }
            else if (ar[mid]<ar[mid-1]){
                end =mid -1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
