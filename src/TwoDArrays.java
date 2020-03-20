public class TwoDArrays {

    /*
    public static void main(String[] args) {


        int[][] arr1 = {{1, 2, 3, 4}, {6, 2, 5, 3}, {9, 0, 1, 7}, {3, 1, 8, 6}};
        int[][] arr2 = {{1, 6, 4}, {6, 2, 1}};


        System.out.println(isSquare(arr1));
        System.out.println(isSquare(arr2));
    }

     */


    public static int maxValue(int[][] arr) {

        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] > max)
                    max = arr[row][col];
            }
        }
        return max;
    }

    public static int sumAll(int[][] arr) {
        int totalSum = 0;

        for (int[] ints : arr) {
            for (int col = 0; col < arr[0].length; col++) {
                totalSum += ints[col];
            }
        }
        return totalSum;

    }

    public static boolean isSquare(int[][] arr) {
        boolean testSquare = true;
        int arrLength = arr.length;

        for (int row = 0; row < arrLength; row++) {
            if (arr[row].length != (arrLength)) {
                testSquare = false;
            }
        }
        return testSquare;
    }
}
