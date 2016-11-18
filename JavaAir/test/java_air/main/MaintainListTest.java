/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_air.main;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author Dbowie
 */
public class MaintainListTest {
    
	@Test
	public void seTasksFulfilled_testNormal() {
		MaintainListFrame frame = new MaintainListFrame();
		frame.setPlaneStatusCheckBox();
                frame.setRefuelCheckBox();
                frame.setuUnloadluggageCheckBox();
                try{
                    frame.setMaintainCompleteButton();
                    assertTrue(true);
                }
                catch(Exception e){
                    fail();
                }
	}
        
        @Test
	public void seTasksUnfulfilled_testNormal() {
		MaintainListFrame frame = new MaintainListFrame();
		frame.setPlaneStatusCheckBox();
                try{
                    frame.setMaintainCompleteButton();
                    assertTrue(true);
                }
                catch(Exception e){
                    fail();
                }
	}
        
}
