package lab10;

public class SortingAlgorithm {
    //Swap two elements at indexes, i and j, in array arrInt
    private static void swap(int[] arrInt, int i, int j) {
        int temp = arrInt[i];
        arrInt[i] = arrInt[j];
        arrInt[j] = temp;
    }

    /**
     * Sort the integer array using the insertion sort algorithm
     * @param arrInt: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void insertionSort(int[] arrInt) {
        //TODO add code below
    }

    /**
     * Merge two sorted arrays left and right into the result array
     * @param left: the left sorted array
     * @param right: the right sorted array
     * @param result: the merge sorted array from the left and right
     * @return: none (merge elements of the left and right arrays into the result array)
     */
    public static void merge(int[] left, int[] right, int[] result) {
        //TODO add code below
    }

    /**
     * Sort the integer array using the merge sort algorithm
     * @param arrInt: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void mergeSort(int[] arrInt) {
        //TODO add code below
    }

    /**
     * Partition the part of the array specified by low, high into three parts: left, pivot, right
     * @param array: the array to be sorted
     * @param low: the lowerbound index of the range
     * @param high: the upperbound index of the range
     * @return: the location of the pivot (should be between low and high)
     */
    public static int partition(int[] array, int low, int high) {
        //TODO add code below
    }

    /**
     * Perform Quick sort on the range specified by low and high indexes of the array
     * @param arrInt: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void quickSort(int[] array, int low, int high) {
        //TODO add code below
    }

    /**
     * Perform Quick sort on the array
     * @param arrInt: the integer array to be sorted
     * @return: none (this method will internally modify the order of elements of the array)
     */
    private static void quickSort(int[] array) {
        //TODO add code below
    }
    
    public static void main(String[] args) {
        //TODO add code below
    }
}
