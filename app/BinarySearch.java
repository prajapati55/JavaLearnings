public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("BinarySearch ans index => ");
        int[] sourceArr = {-18,-12,-4,0,2,3,4,15,16,18, 22, 45, 65, 89};
        int target = 15;
        int ans = binarySearch(sourceArr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] source, int target){
        int s = 0;
        int e = source.length-1;
        while(s<=e){
            int mid = s + ((e-s)/2);
            if(source[mid]== target){
                return mid;
            }

            if(source[mid]> target){
                e = mid-1;
            }else{
                s= mid+1;
            }
        }
        return -1;
    }
}