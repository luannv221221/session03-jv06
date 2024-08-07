import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // khai mảng có n phần tử n nhập từ bàn phím
        // Nhập các giá trị cho mảng
        // Hiểnthijij gia trị cua các phần tử mảng

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số phần tử của mảng ");
        int n = scanner.nextInt();

        // khai báo mang có n phần tử
        int[] array = new int[n];

        // nhập vào các phần của mảng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ "+(i+1));
            array[i] = scanner.nextInt();
        }
        
        // hiển thị các giá trị của phần tử mảng 
        for (int i = 0; i < n; i++) {
            System.out.printf("Phần tử thứ %d = %d \n",i+1,array[i]);
        }
    }
}
