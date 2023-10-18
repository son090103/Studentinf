/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Comparator;

/**
 *
 * @author son
 */
public class Student implements Comparable<Student>{
    public String name;
    public String lop;
    public float avg;

    public Student() {
    }

    public Student(String name, String lop, float avg) {
        this.name = name;
        this.lop = lop;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return   "name: " + name + ", lop: " + lop + ", avg: " + avg ;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
 
    
}
