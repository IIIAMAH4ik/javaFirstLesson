public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,6,8},{4,4,39}};

        for(int i = 0; i < 3; i++) {
            for(int j = 0; i < 3; i++){
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
