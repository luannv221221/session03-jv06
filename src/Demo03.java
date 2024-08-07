import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số phần tử của mảng ");
        int n = scanner.nextInt();
        // khai báo mảng
        int[] array = new int[n];

        do {
            System.out.println("==============MENU=================\n" +
                    "1.Nhập vào các phần tử của mảng \n" +
                    "2.Hiển thị các giá trị của phần tử trong mảng \n" +
                    "3.Tính tổng các phần tử trong mảng \n" +
                    "4.In ra các phần tử có giá trị chẵn trong mảng \n" +
                    "5. Thoát");
            System.out.println("Mời bạn chọn 1 - 5 ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Mời bạn nhập các giá trị của mảng ");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập phần tử thứ "+(i+1));
                        array[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng ");
                    for (int i = 0; i < n; i++) {
                        System.out.println(array[i]);
                    }
                    break;
                case 3:
                    int total = 0;
                    for (int i = 0; i < n; i++) {
                        total += array[i];
                    }
                    System.out.println("tổng các phần tử trong mảng là "+total);
                    break;
                case 4:
                    System.out.println("Giá trị các phần tử chãn trong mảng ");
                    for (int i = 0; i < n; i++) {
                        if(array[i] % 2 == 0){
                            System.out.println(array[i]);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn lại ");
            }
        } while (true);
    }
}
