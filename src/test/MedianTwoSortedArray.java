package test;

public class MedianTwoSortedArray {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        if ((len1 + len2) % 2 != 0) {
            return findKth(nums1, nums2, (len1 + len2) / 2, 0, len1 - 1, 0, len2 - 1);
        } else {
            return (findKth(nums1, nums2, (len1 + len2) / 2, 0, len1 - 1, 0, len2 - 1) + 
                findKth(nums1, nums2, (len1 + len2) / 2 - 1, 0, len1 - 1, 0, len2 - 1)) / 2;
        }
    }

    public static double findKth(int[] nums1, int[] nums2, int k, int start1, int end1, int start2, int end2) {
        int len1 = end1 - start1 + 1;
        int len2 = end2 - start2 + 1;

        if(len1 == 0) {
            return nums2[start2 + k];
        } else if(len2 == 0) {
            return nums1[start1 + k];
        } else if(k == 0) {
            return nums1[start1] < nums2[start2] ? nums1[start1] : nums2[start2];
        }

        int mid1 = k * len1 / (len1 + len2);
        int mid2 = k - mid1 - 1;

        mid1 = start1 + mid1;
        mid2 = start2 + mid2;

        if(nums1[mid1] > nums2[mid2]) {
            k = k - (mid2 - start2 + 1);
            end1 = mid1;
            start2 = mid2 + 1; 
        } else {
            k = k - (mid1 - start1 + 1);
            end2 = mid2;
            start1 = mid1 + 1;
        }
        return findKth(nums1, nums2, k, start1, end1, start2, end2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,4,6,8,10,12};
		//System.out.println(arr1.length);
		System.out.println(findMedianSortedArrays(arr1, arr2));
	}

}
