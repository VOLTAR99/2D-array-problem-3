import java.util.Scanner;

public class Ques3 {

//    static void printMatrix(int[][] arr, int r, int c) {
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
    static void upper(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    System.out.print(arr[i][j]+" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
//        int[][] upp=new int[n][n];
//        int i=0,j=0;
//        while(i<=j && i<n) {
//            for (j=0; j < n; j++) {
//                upp[i][j] = arr[i][j];
//                j++;
//            }
//            i++;
//        }
//        return upp;
//    }
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
        upper(arr,n);

    }
}
