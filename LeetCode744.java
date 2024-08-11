public class LeetCode744 {
        //    CEILING NUMBER : Smallest number which is greater or equal to target element
        public static void main(String[] args) {
            System.out.println("Find letter greater then target letter");
            char[] ar={'x','x','y','y'};
            char target = 'z';
            char ans = FindGraterLetter(ar,target);
            System.out.println(ans);
        }
        static char FindGraterLetter(char[] ar, char target)
        {
            int start =0;
            int end = ar.length-1;
            char letter = 'a';
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
                    letter = ar[mid+1];
                    return letter;
                }
            }
            return ar[0];
        }


}
