package com.zzd.boot.pojo;

public class EmpInfo {
    private Integer empId;
    private String empName;
    private Integer age;
    private String sex;
    private String phone;
    private DeptInfo dept;

    public EmpInfo() {
        super();
    }

    public EmpInfo(String empName, Integer age, String sex, String phone, DeptInfo dept) {
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.dept = dept;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DeptInfo getDept() {
        return dept;
    }

    public void setDept(DeptInfo dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", dept=" + dept +
                '}';
    }
}
