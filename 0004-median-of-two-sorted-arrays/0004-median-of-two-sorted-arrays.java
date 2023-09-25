class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int arr[] = new int[nums1.length + nums2.length];

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){                        
            arr[k++] = nums1[i++];
        }
          while(j < nums2.length){
            arr[k++] = nums2[j++];
        }

        if(arr.length %2 == 0){
            return ((float) arr[ (arr.length /2) -1 ] + (float) arr[arr.length /2])/ 2.0 ;
        }else{
            return (float) arr[arr.length /2];
        }
    }
}    
            
        