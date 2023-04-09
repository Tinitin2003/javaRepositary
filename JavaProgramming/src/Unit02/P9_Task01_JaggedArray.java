package Unit02;

public class P9_Task01_JaggedArray {

	public static void main(String[] args) {
		int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[] {1, 2,3};
        jaggedArray[1] = new int[] {4, 5, 6,7};
        jaggedArray[2] = new int[] {8, 9, 10};
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

	}

}
