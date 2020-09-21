package com.zzd.boot.service;

import com.zzd.boot.pojo.EmpInfo;
import com.zzd.boot.utils.JsonData;

public interface EmpService {

    JsonData findAll(int page,int limit);

    JsonData allDept();

    JsonData saveEmp(EmpInfo emp);

    JsonData getEmpById(int empId);

    JsonData delEmpById(int empId);
}
