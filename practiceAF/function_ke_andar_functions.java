package practiceAF;

public class function_ke_andar_functions {
    public static int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }

    public static int calculateTotalHours(int[] arr,int hourly) {
        int totalH = 0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            totalH += Math.ceil((double)(arr[i]) / (double)(hourly));
        }
        return totalH;
    }

    public static int minimumRateToEatBananas(int[] arr,int h){
        int low = 1, high = findMax(arr);

        while(low <= high){
            int mid = (low+high)/2;
            int totalH = calculateTotalHours(arr, mid);
            if(totalH <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        int[] arr = {7,15,6,3};
        int h = 8;
        int ans = minimumRateToEatBananas(arr, h);
        System.out.println("koko should eat at least "+ ans + " bananas/hr.");
    }
}
