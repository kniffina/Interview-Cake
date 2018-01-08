public class ProductOfAllOtherNumbers {

    //brute force approach is O(n2) because 2 for-loops
    public static int[] productNumsBrute(int[] arr) {
        if(arr == null) return null;
        int productForI = 1;
        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr.length; j++) {
                if(arr[i] != arr[j]) {
                    productForI *= arr[j];
                }
            }
            newArr[i] = productForI;
            productForI = 1;
        }
        return newArr;
    }

    public static int[] productOptimized(int[] arr) {
        if(arr == null) return null;
        int[] newArr = new int[arr.length];
        int product = 1;

        //[1, 7, 3, 4]
        // [1], 1 * 1 = [1], 1 * 7 = [7], 7 * 3 = [21]
        //  we never multiply the 4, we will do that later
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = product;
            product *= arr[i];
        }

        product = 1;

        for(int i = arr.length - 1; i >= 0; i--) {
            newArr[i] *= product;
            product *= arr[i];
        }

        return newArr;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1, 7, 3, 4};

        int[] arr2 = productOptimized(arr);

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
    }
}
