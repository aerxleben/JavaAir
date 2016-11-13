package java_air.main;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Xu Wu
 *
 */
public class AccountConfirmationPanelTest {

	@Test
	public void setEmailLabelText_testNormal() {
		AccountConfirmationPanel panel = new AccountConfirmationPanel();
		panel.setEmailLabelText("Jose@yahoo.com");
		String email = panel.getEmailLabel().getText();
		
		assertEquals(email, "Your Java Air Account Username is: Jose@yahoo.com");
	}

	@Test
	public void setEmailLabelText_testNull() {
		AccountConfirmationPanel panel = new AccountConfirmationPanel();
		try{ 
		panel.setEmailLabelText(null);
		fail();
		}catch (Exception e){
			assertTrue(true);
		}
	}

	@Test
	public void setEmailLabelText_testFormat() {
		AccountConfirmationPanel panel = new AccountConfirmationPanel();
		try{
			panel.setEmailLabelText("ABcd332");
			fail();
			}catch (Exception e){
				assertTrue(true);
			}
	}
	
}
