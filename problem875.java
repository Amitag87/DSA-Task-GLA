class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1; // Minimum speed
        int max = 0; // Maximum speed, which is the largest pile
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        // Binary search for the minimum speed
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (canFinish(piles, mid) <= h) {
                max = mid; // Try for a smaller speed
            } else {
                min = mid + 1; // Need a bigger speed
            }
        }
        return min; // Minimum speed found
    }

    private int canFinish(int[] piles, int k) {
        int time = 0; // Total time needed
        for (int pile : piles) {
            // Calculate hours needed for each pile at speed k
            time += (pile + k - 1) / k; // Ceiling division
        }
        return time; // Total time needed to eat all bananas
    }
}
