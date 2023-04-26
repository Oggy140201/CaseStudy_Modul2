
package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class QuanLy implements Serializable {
    private static final long serialVersionUID = 2906642554792891381L;
    public String userName;
    public int passWord;
    public int age;

    public QuanLy(String userName, int passWord, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
    }

    public QuanLy() {

    }

    public class quanLyNhanVien {
        static Scanner scanner = new Scanner(System.in);
        static Map<String, String> map = new HashMap<>();
        static String[] username = new String[6];
        static String[] password = new String[6];
        static int count = 0;
        static Scanner sc = new Scanner(System.in);


        public quanLyNhanVien(String username, int password) {
            this.username = new String[]{username};
            this.password = new String[]{String.valueOf(password)};
        }


        public static void register() {
            count = 0;
            boolean check = true;
            while (check){
                try {
                    if (count == 6) {
                        System.out.println("Hệ thống đã đầy, không thể đăng kí thêm tài khoản.");
                        return;
                    }
                    System.out.print("Nhập tên đăng nhập: ");
                    String username = sc.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String password = sc.nextLine();
                    if(username.equals("") && password.equals("")){
                        System.out.println("Đăng kí thất bại.");
                    }else {
                        System.out.println("Đăng kí thành công.");
                        count++;
                        map.put(username, password);
                        check = false;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static boolean login() {
            //Objects.equals(username, usernames[i]) && Objects.equals(password, passwords[i])
            try {
                System.out.print("Nhập tên đăng nhập: ");
                String usernames = scanner.nextLine();

                System.out.print("Nhập mật khẩu: ");
                String passwords = scanner.nextLine();

                for (Map.Entry<String, String> checkCondition : map.entrySet()) {
                    if (usernames.equals(checkCondition.getKey()) && passwords.equals(checkCondition.getValue())) {
                        System.out.println("Đăng nhập thành công.");
                        return true;
                    } else {
                        System.out.println("Tên đăng nhập hoặc mật khẩu không đúng.");
                        return false;
                    }
                }
                System.out.println("Đăng nhập thất bại.");
                return false;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassWord() {
        return passWord;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "nameLogin='" + userName + '\'' +
                ", passwork=" + passWord +
                ", age=" + age +
                '}';
    }
}
