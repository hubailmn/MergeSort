import java.util.Arrays;

public class MergeSortDriver {
    private static final MergeSort sort = new MergeSort();

    public static void main(String[] args) {

        System.out.println("Normal Array");
        String[] strArr = {"H", "M", "I", "U", "T", "W", "!"    };
        mergeAndPrint(strArr);

        System.out.println("\nNull Element");
        String[] arrWithNull = {"Z", "A", null, "B"};
        mergeAndPrint(arrWithNull);

        System.out.println("\nInvalid Range Boundaries");
        String[] arrBounds = {"C", "A", "B"};
        mergeAndPrint(arrBounds, -1, 5);

        System.out.println("\nInvalid Range");
        String[] arrInvalidRange = {"C", "A", "B"};
        mergeAndPrint(arrInvalidRange, 2, 1);

        System.out.println("\nNull Array");
        String[] nullArr = null;
        mergeAndPrint(nullArr, 0, 1);
        mergeAndPrint(nullArr);

        System.out.println("\nSingle Element");
        String[] singleElement = {"One"};
        mergeAndPrint(singleElement);

        System.out.println("\nNo Elements");
        String[] none = {};
        mergeAndPrint(none);

    }

    private static void mergeAndPrint(String[] array) {
        if (array == null) {
            sort.mergeSort(array);
            return;
        }
        mergeAndPrint(array, 0, array.length - 1);
    }

    private static void mergeAndPrint(String[] array, int left, int right) {
        System.out.println("Original Array: " + Arrays.toString(array));
        sort.mergeSort(array, left, right);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
