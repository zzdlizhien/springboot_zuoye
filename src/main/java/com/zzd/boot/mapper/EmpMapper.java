package com.zzd.boot.mapper;

import com.zzd.boot.pojo.DeptInfo;
import com.zzd.boot.pojo.EmpInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpMapper {

    public List<EmpInfo> findAll();

    public List<DeptInfo> allDept();

    int saveEmp(EmpInfo emp);

    int editEmp(EmpInfo emp);

    EmpInfo getEmpById(int empId);

    int delEmpById(int empId);
}
