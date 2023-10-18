/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Reponsitory.List;
import view.Menu;

/**
 *
 * @author son
 */
public class StudentManager extends Menu{
    
    public List l = new List();
    public StudentManager(String title, String []mc){
        super(title, mc);
    }
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                l.addStudent();
                break;
            case 2:
                l.print();
                break;
            case 3: 
                return;
            default:
                throw new AssertionError();
        }
    }
}
