public class Searching{
    public static int linearSearch(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
      
        while(start<=end){
            int mid = (start + end)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }
        }
        

        return -1;
    }

    public static int recursiveBinarySearch(int[] nums, int target, int start, int end){
        int mid = (start+end)/2;

        if(nums[mid] == target){
            return mid;
        }
        if(start>=end){
            return -1;
        }

        if(nums[mid] > target){
            end = mid-1;
            return recursiveBinarySearch(nums,target,start,end);
        }else{
            start = mid + 1;
            return recursiveBinarySearch(nums,target,start,end);
        }
    }

    public static void main(String args[]){
        int[] nums = {3,5,7,9,11,13,15};
        int size = nums.length;
        int target = 3;
        // int result = linearSearch(nums,target);
        // int result = binarySearch(nums,target);
        int result = recursiveBinarySearch(nums, target, 0, size-1);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at " + result);        
    }
}