class Solution {

    public boolean search(int[] nums, int target) {

        int left = 0;

        int right = nums.length - 1;

        while (left <= right) {

            // 1. Safe midpoint (avoids integer overflow on large arrays)

            int mid = left + (right - left) / 2;

            // 2. Found the target

            if (nums[mid] == target) {

                return true;

            }

            // 3. Duplicates: cannot determine which side is sorted.

            //    Shrink the window from both ends and continue.

            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {

                left++;

                right--;

            }

            // 4. LEFT half [left..mid] is sorted

            else if (nums[left] <= nums[mid]) {

                if (nums[left] <= target && target < nums[mid]) {

                    right = mid - 1; // target lies in the sorted left half

                } else {

                    left = mid + 1; // target must be in the right half

                }

            }

            // 5. RIGHT half [mid..right] is sorted

            else {

                if (nums[mid] < target && target <= nums[right]) {

                    left = mid + 1; // target lies in the sorted right half

                } else {

                    right = mid - 1; // target must be in the left half

                }

            }

        }

        // 6. Exhausted the search range — target is not present

        return false;

    }

}