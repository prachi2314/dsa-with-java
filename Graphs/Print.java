

public class Print {
    public static void main(String[] args) {
        int n = 3;
        int[][] gr = new int[n][n];

        // A-B
        gr[0][1] = 1;
        gr[1][0] = 1;
        // A-C
        gr[0][2] = 1;
        gr[2][0] = 1;
        // B-C
        gr[1][2] = 1;
        gr[2][1] = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.err.print(gr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
