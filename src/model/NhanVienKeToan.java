package model;

import java.io.Serializable;

public class NhanVienKeToan extends NhanVien implements Serializable {
    private static final long serialVersionUID = 2906642554392891381L;

    public NhanVienKeToan(String name, int age, String email, String position, int horse, String address, int salary) {
        super(name, age, email, position, horse, address, salary);
    }

    public NhanVienKeToan() {
    }

    @Override
    public String toString() {
        return
                        "Tên: " + name + "\t" +
                        "Tuổi: " + age + "\t" +
                        "Email: " + email + "\t" +
                        "ID: " + horse + "\t" +
                        "Chức vụ: " + position + "\t" +
                        "Địa chỉ: " + address + "\n"
                ;
    }

    @Override
    public int payroll() {
        return salary * 30;
    }
}
