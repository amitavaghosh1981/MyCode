package geekforgeek;

import java.util.*;

public class ProgramMaster {
    static int getOddOccurrence(int[] arr, int n) {
        // code here

        int result = 0;
        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            numberMap.put(arr[i], numberMap.get(arr[i]) == null ? 1 : numberMap.get(arr[i]) + 1);
        }
        for (Integer key : numberMap.keySet()) {
            if (numberMap.get(key) % 2 != 0) {
                result = key;
            }
        }
        return result;
    }

    static String removeDups(String S) {
        Set<Character> uniqueSet = new LinkedHashSet<Character>();
        StringBuilder result = new StringBuilder();
        for (char element : S.toCharArray()) {
            uniqueSet.add(element);
        }
        uniqueSet.stream().forEach(character -> result.append(character));
        return result.toString();
    }

    static int isPalindrome(String S) {
        int result = 1;
        int last = S.length()-1;
        char[] charData = S.toCharArray();
        for (int i = 0; i < S.length() / 2; i++) {
            //5/2= 2.5=2
            if (charData[i] != charData[last]) {
                return 0;
            }
            last = last - 1;
        }
        return result;
    }

    static boolean check(long A[], long B[], int count) {
        boolean isEqual = true;
        if (A.length != B.length) {
            return false;
        }
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < count; i++) {
            if (A[i] != B[i])
                return false;
        }
        return isEqual;
    }

    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 2, 3, 1, 3};
        //  System.out.println(getOddOccurrence(arr, 7));
        // System.out.println(removeDups("zvvvo"));
//        long[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        long[] B = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        System.out.println(check(A,B,10));
        System.out.println(isPalindrome("abcba"));
    }
}
