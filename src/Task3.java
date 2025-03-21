public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int sum = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = i; // Put numbers 0 to 9 on the diagonal
                    sum += matrix[i][j];
                } else {
                    matrix[i][j] = 0; // Put 0 elsewhere
                }
            }
        }


        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


        System.out.println("Sum of diagonal elements: " + sum);
    }
}
