public class MinMax {

    public static void minMax(int [][]arr) {

        int summin = 0;
        int summax = 0;
       // int arr[][]=new int[5][5];
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
            summin+= min;
            summax += max;

        }
        System.out.println("sum of 5 maximum will be:" + summax);
        System.out.println("sum of 5 minimum will be: " + summin);


    }

    public static void main(String[] args) {
        int arr[][]=new int[5][5];
         arr = new int[][]{{50, 10, 50}, {5, 13, 40, 55}, {70, 89, 10}, {10, 20, 30}, {10, 20, 30}};


        minMax(arr);
    }
}


