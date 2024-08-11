public class SearchInMountainArray {
    public static int main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int peak = findPeakElement(ar);
        int firstsearch = Binary_Search_Program(ar, target, 0, peak);
        if (firstsearch != -1) {
            return firstsearch;
        }

        return -1;
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

    public static int Binary_Search_Program(int[] ar, int target ,int beginning,int peak){
        int start = 0;
        int end = ar.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            if (target>ar[mid]){
                start = mid+1;
            }
            else if (target<ar[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
