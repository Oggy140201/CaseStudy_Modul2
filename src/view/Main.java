package view;

import controller.Manager;
import model.*;
import java.util.Scanner;
import static model.QuanLy.quanLyNhanVien.login;
import static model.QuanLy.quanLyNhanVien.register;

public class Main {
    static ReadAndWrite readAndWrite = new ReadAndWrite();
//    static {
//        Manager.list= read.inputStream("D:\\CodeGym\\Modul_2\\Case_Modul2\\Case\\src\\file\\Nhanvien1");
//    }
    static {
        Manager.listTong= readAndWrite.inputStream("D:\\CodeGym\\Modul_2\\Case_Modul2\\Case\\src\\file\\Nhanvien");
    }
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
//        manager.logIn();
//        QuanLy quanLy = new QuanLy();
//        quanLy.passWord;
        boolean running = true;
        while (running) {
            System.out.println("""
            \033[31m========================
            |         Menu         |
            ========================
            | 1. Đăng kí           |
            | 2. Đăng nhập         |
            | 3. Thoát             |
            ========================
            |......................|
            ========================
            MỜI BẠN NHẬP LỰA CHỌN
            """);
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    register();
                    readAndWrite.outPutStream("D:\\CodeGym\\Modul_2\\Case_Modul2\\Case\\src\\file\\Nhanvien",Manager.listTong);
                    break;
                case 2:
                    if(!login()){
                        break;
                    }
                        while (true){
                            System.out.println("""
                                    \033[30m=====================================
                                    |               MENU                |
                                    =====================================
                                    | 1.Thêm                            |
                                    | 2.Tìm kiếm                        |
                                    | 3.Check                           | 
                                    | 4.Xóa                             |
                                    | 5.Hiển thị                        |
                                    | 6.Sửa                             |
                                    | 7.Sắp xếp                         | 
                                    | 0.Thoát                           |
                                    =====================================
                                    |-----------------------------------|
                                    =====================================\033[0m
                                    """);

                            String choice1 = scanner.nextLine();
                            switch (choice1){
                                case "1":
                                    System.out.println("""
                            1.Nhân viên thư kí
                            2.Nhân viên kế toán
                            3.Nhân viên PartTime
                            4.Nhân viên FullTime
                            """);
                                    String num = scanner.nextLine();
                                    switch (num){

                                        case "1":
                                            System.out.print("Nhập tên: ");
                                            String name1 = scanner.nextLine();
                                            System.out.print("Nhập tuổi: ");
                                            int age1 = Integer.parseInt(scanner.nextLine());
                                            System.out.print("Nhập email: ");
                                            String email1 = scanner.nextLine();
                                            System.out.println("Nhập chức vụ: ");
                                            String position1 = scanner.nextLine();
                                            System.out.print("Nhập mã: ");
                                            int horse1 = Integer.parseInt(scanner.nextLine());
                                            System.out.print("Nhập địa chỉ: ");
                                            String address1 = scanner.nextLine();
                                            System.out.println("Nhập lương: ");
                                            int salaryFullTime1 = Integer.parseInt(scanner.nextLine());
                                            NhanVienKeToan nhanVienKeToan = new NhanVienKeToan(name1,age1,email1,position1,horse1,address1,salaryFullTime1);
                                            Manager.addNhanVien(nhanVienKeToan);
                                            readAndWrite.outPutStream("D:\\CodeGym\\Modul_2\\Case_Modul2\\Case\\src\\file\\Nhanvien",Manager.listTong);
                                            break;
                                        case "2":
                                            System.out.print("Nhập tên: ");
                                            String name = scanner.nextLine();
                                            System.out.print("Nhập tuổi: ");
                                            int age = Integer.parseInt(scanner.nextLine());
                                            System.out.print("Nhập email: ");
                                            String email = scanner.nextLine();
                                            System.out.print("Nhập mã: ");
                                            int horse = Integer.parseInt(scanner.nextLine());
                                            System.out.print("Nhập chức vụ: ");
                                            String position = scanner.nextLine();
                                            System.out.println("Nhập địa chỉ: ");
                                            String address = scanner.nextLine();
                                            System.out.println("Nhập lương: ");
                                            int salaryFullTime = Integer.parseInt(scanner.nextLine());
                                            NhanVien nhanVienThuKi = new NhanVienThuKi(name,age,email,position,horse,address,salaryFullTime);
                                            Manager.addNhanVien(nhanVienThuKi);
                                            readAndWrite.outPutStream("D:\\CodeGym\\Modul_2\\Case_Modul2\\Case\\src\\file\\Nhanvien",Manager.listTong);
                                            break;
                                        case "3":
                                            System.out.print("Nhập tên: ");
                                            String name2 = scanner.nextLine();
                                            System.out.print("Nhập tuổi: ");
                                            int age2 = Integer.parseInt(scanner.nextLine());
                                            System.out.print("Nhập email: ");
                                            String email2 = scanner.nextLine();
                                            System.out.println("Nhập chức vụ: ");
                                            String position2 = scanner.nextLine();
                                            System.out.print("Nhập mã: ");
                                            int horse2 = Integer.parseInt(scanner.nextLine());
                                            System.out.print("Nhập địa chỉ: ");
                                            String address2 = scanner.nextLine();
                                            System.out.println("Nhập lương: ");
                                            int salaryFullTime2 = Integer.parseInt(scanner.nextLine());
                                            System.out.println("Nhập giờ làm việc: ");
                                            int workingHouse = Integer.parseInt(scanner.nextLine());
                                            NhanVien nhanVienPartTime = new NhanVienPartTime(name2,age2,email2,position2,horse2,address2,salaryFullTime2,workingHouse);
                                            Manager.addNhanVien(nhanVienPartTime);
                                            readAndWrite.outPutStream("D:\\CodeGym\\Modul_2\\Case_Modul2\\Case\\src\\file\\Nhanvien",Manager.listTong);
                                            break;
                                        case "4":
                                            System.out.print("Nhập tên: ");
                                            String name3 = scanner.nextLine();
                                            System.out.print("Nhập tuổi: ");
                                            int age3 = Integer.parseInt(scanner.nextLine());
                                            System.out.print("Nhập email: ");
                                            String email3 = scanner.nextLine();
                                            System.out.println("Nhập chức vụ: ");
                                            String position3 = scanner.nextLine();
                                            System.out.print("Nhập mã: ");
                                            int horse3 = Integer.parseInt(scanner.nextLine());
                                            System.out.print("Nhập địa chỉ: ");
                                            String address3 = scanner.nextLine();
                                            System.out.println("Nhập lương: ");
                                            int salaryFullTime3 = Integer.parseInt(scanner.nextLine());
                                            NhanVien nhanVienFullTime = new NhanVienFullTime(name3,age3,email3,position3,horse3,address3,salaryFullTime3);
                                            Manager.addNhanVien(nhanVienFullTime);
                                            readAndWrite.outPutStream("D:\\CodeGym\\Modul_2\\Case_Modul2\\Case\\src\\file\\Nhanvien",Manager.listTong);
                                            break;
                                    }
                                    break;
                                case "2":
                                    System.out.println("Tìm kiếm nhân viên: ");
                                    manager.searchNhanVien();
                                    break;
                                case "3":
                                    System.out.println("""
                            1.Check nhân viên PartTime
                            2.Check nhân viên FullTime
                            3.Check nhân viên thư kí
                            4.Check nhân viên kế toán
                            """);
                                    int number = Integer.parseInt(scanner.nextLine());
                                    switch (number){
                                        case 1:
                                            manager.checkNhanVienPartTime();
                                            break;
                                        case 2:
                                            manager.checkNhanVienFullTime();
                                            break;
                                        case 3:
                                            manager.checkNhanVienThuKi();
                                            break;
                                        case 4:
                                            manager.checkNhanVienKeToan();
                                            break;
                                    }
                                    break;
                                case "4":
                                    manager.deleteNhanVienPartTime();
                                    break;
                                case "5":
                                    manager.displayNhanVien();
                                    break;
                                case "6":
                                    manager.fixNhanVien();
                                    break;
                                case "7":
                                    manager.sortByName();
                                    manager.displayNhanVien();
                                    break;
                                case "0":
                                    return;
                            }
                        }
                case 3:
                    running = false;
                    System.out.println("Cảm ơn đã sử dụng hệ thống đăng nhập.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
}