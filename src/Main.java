
import controller.StudentManager;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author son
 */
public class Main {
  public static void main(String[] args) {
        String title = "====== Collection Sort Program ======";
        String[] s = new String[]{"Add Student", "Display","Exit"};
        StudentManager menu = new StudentManager(title, s);
        menu.run();
    }
}
