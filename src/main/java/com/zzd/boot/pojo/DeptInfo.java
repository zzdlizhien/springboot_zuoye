package com.zzd.boot.pojo;

public class DeptInfo {
    private Integer deptId;
    private String deptName;

    public DeptInfo() {
        super();
    }

    public DeptInfo(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "DeptInfo{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
