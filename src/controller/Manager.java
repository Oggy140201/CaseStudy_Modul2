package controller;

import model.*;

import java.io.Serializable;
import java.util.*;

public class Manager implements Serializable {
    private static final long serialVersionUID = 2906642554792891381L;
    public static ArrayList<NhanVien> listTong = new ArrayList<>();
    public static ArrayList<QuanLy> list = new ArrayList<>();
    QuanLy quanLy = new QuanLy();
    private final String username = "tienanh";
    private final int passWord = 007;
    Scanner scanner = new Scanner(System.in);

    public void ManagerNhanVien() {
    }

    public void logIn() {
        System.out.println("Nhập Tài khoản: ");
        String name = scanner.nextLine();
        System.out.println("Nhập PassWord: ");
        int prd = Integer.parseInt(scanner.nextLine());
        if (username.equals(name) && passWord == prd) {
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Đăng nhập thất bại =>>> Lêu Lêu");
            System.exit(0);
        }
    }


    public static void addNhanVien(NhanVien nhanVien) {
//        listTong.add(new NhanVienFullTime("anh",22,"tienanh@gmail.com","học viên",01,"hải phòng",1000));
//        listTong.add(new NhanVienPartTime("vũ",25,"quocvu@gmail.com","học viên",02,"hà nội",2000,8));
//        listTong.add(new NhanVienThuKi("sơn",29,"haison@gmail.com","học viên",03,"hà nội",3000));
//        listTong.add(new NhanVienKeToan("giang",33,"giang123@gmail.com","học viên",04,"hà nội",5000));
        listTong.add(nhanVien);
    }

    public void searchNhanVien() {
        String search = scanner.nextLine();
        for (int i = 0; i < listTong.size(); i++) {
            if (search.equals(listTong.get(i).getName())) {
                System.out.println("Đây là nhân viên: " + search);
            }
        }
    }

    public void checkNhanVienFullTime() {
        for (NhanVien q : listTong) {
            if (q instanceof NhanVienFullTime) {
                System.out.println("Đây là nhân viên FullTime: " + q);
            }
//            }else  if(listTong instanceof NhanVienPartTime) {
//                System.out.println("Nhân viên PartTime");
//            }else if (listTong instanceof NhanVienKeToan){
//                System.out.println("Nhân viên kế toán");
//            }else {
//                System.out.println("Nhân viên thư kí");
//            }
        }
    }

    public void checkNhanVienPartTime() {
        for (NhanVien p : listTong) {
            if (p instanceof NhanVienPartTime) {
                System.out.println("Đây là nhân viên PartTime: " + p);
            }
        }
    }

    public void checkNhanVienThuKi() {
        for (NhanVien e : listTong) {
            if (e instanceof NhanVienThuKi) {
                System.out.println("Đây là nhân viên thư kí: " + e);
            }
        }
    }

    public void checkNhanVienKeToan() {
        for (NhanVien r : listTong) {
            if (r instanceof NhanVienKeToan) {
                System.out.println("Đây là nhân viên kế toán: " + r);
            }
        }
    }

    public void deleteNhanVienPartTime() {
        System.out.println("Xóa nhân viên");
        String delete = scanner.nextLine();
        for (int i = 0; i < listTong.size(); i++) {
            if (listTong.get(i).getName().equals(delete)) {
                listTong.remove(i);

            }
        }
        System.out.println(listTong);
    }

    public void displayNhanVien() {
        for (NhanVien nhanVien : listTong) {
            if (nhanVien instanceof NhanVien) {
                System.out.println(nhanVien);
            }
        }
    }

    //    public void fixNhanVien(){
//        String name = scanner.nextLine();
//        for (int i = 0; i < listTong.size(); i++) {
//            if(listTong.get(i).setName(name)){
//                System.out.println("Đây là nhân viên sau khi sửa" + listTong.get(i));
//            }
//        }
//    }
    public void fixNhanVien() {
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String email = scanner.nextLine();
        int horse = Integer.parseInt(scanner.nextLine());
        String address = scanner.nextLine();
        int salary = Integer.parseInt(scanner.nextLine());
        for (NhanVien nhanVien : listTong) {
            if (nhanVien.getName().equals(name)) {
                nhanVien.setName(name);
                nhanVien.setAge(age);
                nhanVien.setEmail(email);
                nhanVien.setHorse(horse);
                nhanVien.setAddress(address);
                nhanVien.setSalary(salary);
            }
        }
    }


    public void sortByName() {
        Collections.sort(listTong, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}