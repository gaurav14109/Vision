/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vision;
import views.PatientExamination;
/**
 *
 * @author aurav
 */
public class App {
    
    public static void main(String[] args) {
        
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientExamination().setVisible(true);
            }
        });
    }
    
}
