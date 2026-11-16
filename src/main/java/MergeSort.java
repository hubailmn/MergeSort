public class MergeSort implements MergeSortInterface {

    public void mergeSort(String[] arr) {
        if (arr == null) return;
        if (arr.length < 2) return;

        mergeSort(arr, 0, arr.length - 1);
    }

    @Override
    public void mergeSort(String[] arr, int left, int right) {
        if (arr == null || arr.length < 2) return;
        if (left < 0 || right >= arr.length) return;

        String[] copy = arr.clone();

        try {
            if (left < right) {
                int mid = Math.floorDiv((left + right), 2);
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        } catch (Exception e) {
            System.arraycopy(copy, 0, arr, 0, copy.length);
        }
    }

    private void merge(String[] arr, int left, int mid, int right) {
//        System.out.println(Arrays.toString(arr));
        int leftHalf = mid - left + 1;
        int rightHalf = right - mid;

        String[] first = new String[leftHalf];
        String[] second = new String[rightHalf];

        for (int i = 0; i < leftHalf; i++) {
            first[i] = arr[left + i];
        }
//        System.out.println("First: " + Arrays.toString(first));

        for (int i = 0; i < rightHalf; i++) {
            second[i] = arr[mid + 1 + i];
        }
//        System.out.println("Second: " + Arrays.toString(second));

        int leftIndex = 0;
        int rightIndex = 0;

        int walk = left;

        while (leftIndex < leftHalf && rightIndex < rightHalf) {
            if (first[leftIndex].compareTo(second[rightIndex]) <= 0) {
                arr[walk] = first[leftIndex];
                leftIndex++;
            } else {
                arr[walk] = second[rightIndex];
                rightIndex++;
            }
            walk++;
        }

        if (first.length == leftIndex) {
            while (rightIndex < rightHalf) {
                arr[walk] = second[rightIndex];
                rightIndex++;
                walk++;
            }
        } else {
            while (leftIndex < leftHalf) {
                arr[walk] = first[leftIndex];
                leftIndex++;
                walk++;
            }
        }
    }

}
