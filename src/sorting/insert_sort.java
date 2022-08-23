package sorting;

public class insert_sort {
    public static void main(String[] args) {
        int[] arr = {56, 18};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i = 0; i < arr.length - i; i++) {
            for(int j = j+i; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, k, second:j-1)
                } else {
                    break;
                }
            }
        }
    }
}
