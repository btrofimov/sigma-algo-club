package algorithms;

public class Tools {
    public static void merge(int[] numbers) {
        int lLen = numbers.length / 2;
        int rLen = numbers.length - lLen;
        int[] left = new int[lLen];
        int[] right = new int[rLen];
        int i = 0;

        while (i < lLen) {
            left[i] = numbers[i++];
        }
        for (int j = 0; j < rLen; j++) {
            right[j] = numbers[i++];
        }

        int lId, rId;
        for (lId = rId = 0, i = 0; i < numbers.length; i++) {
            if (lId < lLen && rId < rLen) {
                numbers[i] = left[lId] < right[rId] ? left[lId++] : right[rId++];
            } else {
                numbers[i] = lId == lLen ? right[rId++] : left[lId++];
            }
        }
    }
}
