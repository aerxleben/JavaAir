package java_air.main;


import java.awt.CardLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Georege
 */
public class TestPanel {
         //test
         public TestPanel(){
            CardLayout cl = (CardLayout)(Global.cardsPanel.getLayout());
            cl.show(Global.cardsPanel, Global.textReservationPassenger);   
         }
}
