package com.zzd.boot.controller;


import com.zzd.boot.pojo.EmpInfo;
import com.zzd.boot.service.EmpService;
import com.zzd.boot.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/findAll")
    public JsonData findAll(int page,int limit){
        JsonData jsonData = empService.findAll(page,limit);
        return jsonData;
    }

    @PostMapping("/allDept")
    public JsonData allDept(){
        JsonData jsonData = empService.allDept();
        return jsonData;
    }

    @PostMapping("/saveEmp")
    public JsonData saveEmp(EmpInfo emp){
        JsonData jsonData = empService.saveEmp(emp);
        return jsonData;
    }

    @PostMapping("/getEmpById")
    public JsonData getEmpById(int empId){
        JsonData jsonData = empService.getEmpById(empId);
        return jsonData;
    }

    @PostMapping("/delEmpById")
    public JsonData delEmpById(int empId){
        JsonData jsonData = empService.delEmpById(empId);
        return jsonData;
    }
}
