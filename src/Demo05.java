import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        int row,col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận ");
        row = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận ");
        col = scanner.nextInt();

        // Khai báo mảng 2 chiều row col
        int[][] array = new int[row][col];

        // in menu
        do {
            System.out.println("==============MENU=================\n" +
                    "                1.Nhập vào các phần tử của mảng \n" +
                    "                2.Hiển thị các giá trị của phần tử trong mảng \n" +
                    "                3.Tính tổng các phần tử trong mảng \n" +
                    "                4.In ra các phần tử có giá trị chẵn trong mảng \n" +
                    "                5. Hiển thị các phần tử mảng dưới dạng ma trận \n" +
                    "                6. Tính tổng đường chéo chính \n" +
                    "                7. In ra đường biên\n" +
                    "                5. Thoát");
            System.out.println("Mời bạn chọn 1 - 5 ");
            int chocie = scanner.nextInt();
            switch (chocie){
                case 1:
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.printf("array[%d][%d] = ",i,j);
                            array[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.printf("arrray[%d][%d] = %d",i,j,array[i][j]);
                        }
                    }
                    break;
                case 3:
                    int total = 0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                           total += array[i][j];
                        }
                    }
                    System.out.println("Tổng các phần tử là : "+total);
                    break;
                case 4:
                    System.out.println("Các phần tử có giá trị chẵn là : ");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if(array[i][j] % 2 == 0){
                                System.out.println(array[i][j]);
                            }
                        }

                    }
                    break;
                case 5:
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.printf("\t %d",array[i][j]);
                        }
                        System.out.println(" ");
                    }
                    break;
                case 6:
                    // tính tổng đường chéo chính
                    int totalElement = 0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if(i == j){
                               totalElement += array[i][j];
                            }
                        }
                    }
                    System.out.println("Tổng các phần tử trên đường chéo chính là "+totalElement);
                    break;
                case 7:
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            if(i == 0 || j == 0|| i == array.length - 1|| j == array[i].length - 1) {
                                System.out.printf("\t %d",array[i][j]);
                            } else {
                                System.out.printf("\t %s"," ");
                            }
                        }
                        System.out.println(" ");
                    }
                    break;
                default:
                    System.out.println("Sai lựa chọn");
            }
        } while (true);
    }
}
