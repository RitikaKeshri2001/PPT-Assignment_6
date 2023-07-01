public class Q1_DI_StringMatch {
    public static int[] diStringMatch(String s) {
        int high = s.length(), low = 0, i = 0;
        int[] arr = new int[high+1];
        for(int j=0; j<s.length(); j++) {
            if(s.charAt(j) == 'I') {
                arr[i++] = low++;
            } else {
                arr[i++] = high--;
            }
        }
        arr[i++] = high;
        return arr;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] arr = diStringMatch(s);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
