package model;

import java.io.Serializable;

public class NhanVienPartTime extends NhanVien implements Serializable {
    private static final long serialVersionUID = 2906642554792891381L;
    public int workingHours;//số giờ làm việc
//    public double salaryPartTime;

    public NhanVienPartTime(String name, int age, String email, String position, int horse, String address, int salaryFulTime, int workingHours) {
        super(name, age, email, position, horse, address, salaryFulTime);
        this.workingHours = workingHours;
    }

    public NhanVienPartTime(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return
                        "Tên: " + name + "\t" +
                        "Tuổi: " + age + "\t" +
                        "Email: " + email + "\t" +
                        "ID: " + horse + "\t" +
                        "Địa chỉ: " + address + "\t" +
                        "Lương: " + salary + "\t" +
                        "Số giờ làm việc" + workingHours + "\n"
                ;
    }

    @Override
    public int payroll() {

        return salary * workingHours;
    }
}
