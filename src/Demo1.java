public class Demo1 {
    public static void main(String[] args) {
        // khai báo mảng 1 chiều
        // cần khai báo mang chiều chứa 5 phần tử có kiểu dữ liệu là int
        int[] array = new int[5];
        // khai bảo mảng 1 chiều có 5 phần tử kiểu int gián giá trị cho 5 phần tử
        int[] array01 = {3,5,6,7,9};

        // truy cập các phần tử của mảng

        // Th1: Truy suất để lấy ra giá trị thông qua chỉ mục của mảng
        System.out.println("GT của phẩn tử thứ 1 của mảng array01 "+array01[0]);
        System.out.println("GT của phẩn tử thứ 2 của mảng array01 "+array01[1]);
        System.out.println("GT của phẩn tử thứ 3 của mảng array01 "+array01[2]);

        // th2: truy suất để gián giá trị của các phần tử trong mảng thông chỉ mục

        array[0] = 8;
        array[1] = 10;
        array[2] = 10;
        array[3] = 10;
        array[4] = 10;

        System.out.println("Giá trị của phần tử thứ nhất mảng array "+array[0]);

        // sử dụng mảng duyệt các phần tử của mảng
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
