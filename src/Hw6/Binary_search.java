package Hw6;

public class Binary_search {

    public static void main(String[] args) {
        int[] array = {1,2,3,6,7,9,16,17,18,25,64};
        int target = 26;
        Binary_search bs = new Binary_search();
        bs.binary_search(array,target);
    }

    public void binary_search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;


        while (low <= high) {
            int mid = (low + high) / 2;
            int mid_val = array[mid];

            if (mid_val == target) {
                System.out.println("targetID = " + mid);
                break;
            } else if (mid_val < target) {
                low = mid + 1;
            } else if (mid_val > target) {
                high = mid - 1;
            }
        }
        System.out.println("target not found");
    }
}
