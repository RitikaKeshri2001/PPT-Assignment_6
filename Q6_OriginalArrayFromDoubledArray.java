import java.util.*;

public class Q6_OriginalArrayFromDoubledArray {
    public static int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        int n = changed.length, original[]=new int[n/2],i=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: changed){
            if(num%2==0 && map.containsKey(num/2)){
                remove(num/2,map);
                original[i++]=num/2;
            }else map.put(num,map.getOrDefault(num,0)+1);
        }
        return (n%2==0 && i==n/2)?original:new int[0];
    }
    static void remove(int key, HashMap<Integer,Integer> map){
        int freq=map.get(key);
        if(freq==1) map.remove(key);
        else map.put(key,freq-1);
    }

    public static void main(String[] args) {
        int[] changed = {1,3,4,2,6,8};
        int[] ori = findOriginalArray(changed);
        for(int i=0; i<ori.length; i++) {
            System.out.print(ori[i]+" ");
        }
    }
}
