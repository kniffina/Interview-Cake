public class AppleStocks {

    public static int maxProfit(int[] arr) {
        if(arr == null || arr.length < 1) return 0;
        if(arr.length == 1) return arr[0];

        int least = arr[0];
        int max = arr[0];
        int maxProfit = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < least)
                least = arr[i];

            if(arr[i] > max)
                max = arr[i];

            maxProfit = max - least;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 20, 5, 1, 6, 8};

        System.out.println(maxProfit(arr));
    }
}
