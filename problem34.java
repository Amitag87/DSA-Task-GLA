class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }

    public int findFirst(int[] a, int target) {
        int s = 0;
        int e = a.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == target) {
                ans = mid; 
                e = mid - 1;
            } else if (a[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public int findLast(int[] a, int target) {
        int s = 0;
        int e = a.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;  
            if (a[mid] == target) {
                ans = mid;  
                s = mid + 1;
            } else if (a[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
