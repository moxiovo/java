package com.fengtaisec.test.bean;

import java.util.ArrayList;
// 科室类
public class Department {
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public Department(String name, ArrayList<Doctor> doctors) {
        this.name = name;
        this.doctors = doctors;
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    public int getNumber(){
        return doctors.size();
    }
}
