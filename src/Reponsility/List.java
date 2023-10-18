/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import common.Student;
import java.util.ArrayList;
import java.util.Collections;
import validation.Validation;

/**
 *
 * @author son
 */
public class List implements IList{
    ArrayList<Student> lt = new ArrayList<>();
    Validation v = new Validation();
    @Override
    public void addStudent() {
        while(true){
        System.out.println("====== Collection Sort Program ======");
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = v.checkInputString();
        System.out.print("Classes: ");
        String lop = v.checkInputString();
        System.out.print("Mark: ");
        float mark = v.checkinputfloat();
        lt.add(new Student(name, lop,mark));
        System.out.print("Do you want to enter more student information?(Y/N): ");
            if (!v.checkyesno()) {
                break;
            }
    }
    }

    @Override
    public void print() {
        if (lt.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            System.out.println("--------Student " + (i+1) +"--------");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Classes: " + lt.get(i).getLop());
            System.out.println("Mark: " + lt.get(i).getAvg());
        }
    }
    
}
