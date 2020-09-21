package com.zzd.boot.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zzd.boot.mapper.EmpMapper;
import com.zzd.boot.pojo.DeptInfo;
import com.zzd.boot.pojo.EmpInfo;
import com.zzd.boot.service.EmpService;
import com.zzd.boot.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public JsonData findAll(int page,int limit) {
        PageHelper.startPage(page,limit);
        List<EmpInfo> infos = empMapper.findAll();
        PageInfo<EmpInfo> pageInfo=new PageInfo<>(infos);
        return JsonData.buildSuccess(pageInfo);
    }

    @Override
    public JsonData allDept() {
        List<DeptInfo> deptInfos = empMapper.allDept();
        return JsonData.buildSuccess(deptInfos);
    }

    @Override
    public JsonData saveEmp(EmpInfo emp) {
        int result=0;
        if(emp.getEmpId()==null){
           result = empMapper.saveEmp(emp);
        }else{
            result = empMapper.editEmp(emp);
        }
        if(result>0){
            return JsonData.buildSuccess("操作成功");
        }
        return JsonData.buildError("操作失败");
    }

    @Override
    public JsonData getEmpById(int empId) {
       EmpInfo empInfo=empMapper.getEmpById(empId);
        return JsonData.buildSuccess(empInfo);
    }

    @Override
    public JsonData delEmpById(int empId) {
        if(empMapper.delEmpById(empId)>0){
            return JsonData.buildSuccess("删除成功");
        }
        return JsonData.buildError("删除失败");
    }
}
