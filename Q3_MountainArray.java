public class Q3_MountainArray {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        int i=0;
        for(; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                i++;
                break;
            } else if(arr[i] == arr[i+1]) {
                return false;
            }
        }
        if(i<2) return false;

        for(; i<arr.length; i++) {
            if(arr[i-1] <= arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5,2,1,0};
        System.out.println(validMountainArray(arr));
    }
}
