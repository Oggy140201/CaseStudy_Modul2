package model;

import java.io.Serializable;

public abstract class NhanVien implements Serializable {
    private static final long serialVersionUID = 2906642554792891381L;
    public String name;
    public int age;
    public String email;
    public String position;//chức vụ
    public int horse;//mã nhân viên
    public String address;//địa chỉ
    public int salary;//lương

    public NhanVien(String name, int age, String email, String position, int horse, String address, int salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.position = position;
        this.horse = horse;
        this.address = address;
        this.salary = salary;
    }

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        this.name = name;
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHorse() {
        return horse;
    }

    public void setHorse(int horse) {
        this.horse = horse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + "\t" +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", horse=" + horse +
                ", address='" + address + '\'' +
                ", salaryFulTime=" + salary +
                '}';
    }

    public abstract int payroll();

}
