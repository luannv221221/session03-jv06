import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        // khai báo mảng 2 chiều có kích thước 3 * 3

        int [][] arr = new int[3][3];
        // khai báo mảng 2 chiều có kích thước 2 * 3 và khởi tạo giá trị
        int [][] arr1 = {{1,2,3},{4,5,6}};

        // khai báo mảng 2 chiều có kích thước 3 * 3 và khởi tạo giá trị
        int [][] array = {{1,3,4},{5,6,7},{5,5,5}};

        // truy cập phần tử mảng 2 chiều gán giá trị
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[0][2] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[2][0] = 5;
        arr[2][1] = 6;
        arr[2][2] = 7;
        // truy cập lấy giá trị

//        System.out.println(arr1[0][0]);
//        System.out.println(arr1[0][1]);
//        System.out.println(arr1[0][2]);
//        System.out.println(arr1[1][0]);
//        System.out.println(arr1[1][1]);
//        System.out.println(arr1[1][2]);


        // sử dụng vòng lặp với mảng 2 chiều
        // th nhập giá trị cho phần tử
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[2][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("arr[%d][%d] = ",i,j);
                a[i][j] = scanner.nextInt();
            }
        }
        // hiển thị các phần tử mảng 2 chiều
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%d \n",a[i][j]);
            }
        }
        // in dưới dạng ma trận
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("\t %d",a[i][j]);
            }
            System.out.println("");
        }
    }
}
