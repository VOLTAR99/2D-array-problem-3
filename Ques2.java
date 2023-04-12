import java.util.Scanner;

public class Ques2 {
    static void printMatrix(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || i+j == n-1){
                    if(arr[i][j] == 0){
                        System.out.println("false");
                        return;
                    }
                }
                else{
                    if(arr[i][j] != 0){
                        System.out.println("false");
                        return;
                    }
                }
            }
        }
        System.out.println("true");
        printMatrix(arr,n,n);

    }

}
