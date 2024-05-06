package com.fengtaisec.test.frame;

import com.fengtaisec.test.bean.Appointment;
import com.fengtaisec.test.bean.Department;
import com.fengtaisec.test.bean.Doctor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class HospitalManager {
    private ArrayList<Department> allDepartments = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void start(){
        while (true){
            System.out.println("====欢迎使用医院信息管理系统====");
            System.out.println("1、科室管理-添加科室");
            System.out.println("2、科室管理-删除科室");
            System.out.println("3、科室管理-修改科室");
            System.out.println("4、医生管理-录入医生");
            System.out.println("5、医生管理-医生坐诊设置(可设置当天和未来6天的坐诊情况)");
            System.out.println("6、医生管理-展示全部医生的坐诊详情(当前和未来6天的坐诊详情)");
            System.out.println("7、医生管理-挂号预约");
            System.out.println("8、搜索某个医生当前和未来6天的病人预约详情(展示每天预约病人的具体信息)");
            System.out.println("请输入操作命令：");
            Scanner sc = new Scanner(System.in);
            switch (sc.next()){
                case "1":
                    addDepartments();
                    break;
                case "3":
                    addDoctor();
                    break;
                case "5":
                    setDoctorJob();
                    break;
                case "6":
                    showAllDoctorInfos();
                    break;    
                default:
                    System.out.println("输入的命令有误");

            }
        }
    }

    private void showAllDoctorInfos() {
    }

    private Department getDepartmentByUser(){
        if (allDepartments.size() == 0){
            return null;
        }
        while (true){
            System.out.println("请选择科室：");
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                System.out.println((i + 1) + "," + department.getName());
            }
            System.out.println("请输入");
            int command = sc.nextInt();
            if (command < 1 || command > allDepartments.size()){
                System.out.println("选择有误请重新确认");
                continue;
            }
            Department department = allDepartments.get(command - 1);
            return department;
        }
    }

    private void addDepartments() {
        System.out.println("========添加科室========");
        OUT: // 标签语法
        while (true){
            System.out.println("请您输入科室名称");
            String name = sc.next();
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                if (department.getName().equals(name)) continue OUT;
            }
            Department department = new Department();
            department.setName(name);
            allDepartments.add(department);
            System.out.println("添加科室成功！");
            break;
        }
    }

    private void addDoctor() {
        System.out.println("========录入医生========");
        if (allDepartments.size() == 0){
            System.out.println("您当前没有科室，不能录入医生！");
            return;
        }
        Doctor doctor = new Doctor();
        while (true){
            System.out.println("请选择科室：");
            for (int i = 0; i < allDepartments.size(); i++) {
                Department department = allDepartments.get(i);
                System.out.println("名称重复，请重新输入。");
                System.out.println((i + 1) + "," + department.getName());
            }
            System.out.println("请输入");
            int command = sc.nextInt();
            if (command < 1 || command > allDepartments.size()){
                System.out.println("选择有误，请重新输入~");
                continue;
            }
            Department department = allDepartments.get(command -1);
            doctor.setDepartmentName(department.getName());

            doctor.setDoctorId(UUID.randomUUID().toString());
            System.out.println("请输入医生姓名：");
            String name = sc.next();
            doctor.setName(name);

            System.out.println("请输入医生性别：");
            String sex = sc.next();
            doctor.setGender(sex);

            System.out.println("请输入医生年龄：");
            int age = sc.nextInt();
            doctor.setAge(age);

            System.out.println("请输入医生特长：");
            String specialty = sc.next();
            doctor.setSpecialty(specialty);

            System.out.println("请输入医生的入职日期 yyyy-MM-dd：");
            String joinDateString = sc.next();
            LocalDate joinDate = LocalDate.parse(joinDateString);
            doctor.setJoinDate(joinDate);

            department.getDoctors().add(doctor);
            System.out.println("录入医生到该科室成功！");
            break;

        }
    }

    private void setDoctorJob() {

    }

}
