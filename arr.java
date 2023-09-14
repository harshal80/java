public class arr {
    public static void main(String[] args) {
        // java array dicalration

        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 5;
        // arr[2] = 2;
        // arr[3] = 3;
        // arr[4] = 4;
        // System.out.println(arr[0]);

        // int arr[] = { 1, 2, 3, 45, 6, 7, 9 };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);

        // }
        // int arr[][]=new int[2][4];
        int arr[][] = { { 1, 2, 34, 5 }, { 2, 3, 4, 5 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
