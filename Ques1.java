import java.util.Scanner;

public class Ques1 {
    static void printMatrix(int[][] arr, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] Prefix(int[][] arr,int n,int m){
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = arr[i][j];
                if(i == 0 && j == 0){
                    continue;
                }else if(i == 0){
                    arr1[i][j] += arr1[i][j-1];
                }else if(j == 0){
                    arr1[i][j] += arr1[i-1][j];
                }else{
                    arr1[i][j] += arr1[i-1][j] + arr1[i][j-1];
                }
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row:");
        int r = sc.nextInt();
        System.out.println("Enter the column:");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the Elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int[][] freq=Prefix(arr,r,c);
        printMatrix(freq,r,c);
    }
}
