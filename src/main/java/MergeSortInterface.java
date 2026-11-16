public interface MergeSortInterface {

    /**
     * Sort the array of strings, v, into ascending lexicographic order using Merge sort.
     * No errors may be reported, and no exceptions may be thrown.
     * If an error is detected or an exception occurs, return without modifying the array.
     *
     * @param arr   The array to be sorted.
     * @param left  The left index of the array.
     * @param right The right index of the array.
     */
    void mergeSort(String[] arr, int left, int right);
}
