package model;

import java.io.Serializable;

public class NhanVienThuKi extends NhanVien implements Serializable {
    private static final long serialVersionUID = 2906642554792891381L;
    public NhanVienThuKi(String name, int age, String email, String position, int horse, String address, int salaryFulTime) {
        super(name, age, email, position, horse, address, salaryFulTime);
    }

    public NhanVienThuKi() {
    }

    @Override
    public String toString() {
        return
                "Tên: " + name + "\t" +
                "Tuổi: " + age + "\t" +
                "Email: " + email + "\t" +
                "ID: " + horse + "\t" +
                "Địa chỉ: " + address + "\t" +
                "Lương: " + salary + "\n"
                ;
    }

    @Override
    public int payroll() {
        return salary * 30;
    }
}
