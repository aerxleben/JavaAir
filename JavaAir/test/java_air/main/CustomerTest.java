package java_air.main;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CustomerTest {

	@Test
	// Based on SRS v4.2 Section 3.2.2.1
	public void setDateOfBirth_testFormatNormal() throws Exception {
		ArrayList<String> customerInfo = new ArrayList<String>();
		/*
		 * private String firstName; //index 0 private String lastName; //index
		 * 1 private String dateOfBirth; //index 2 private String gender;
		 * //index 3 private String physicalAddress; //index 4 private String
		 * addressCity; //index 5 private String addressState; //index 6 private
		 * String addressZipCode; //index 7 private String phoneNumber; //index
		 * 8 private String emailAddress; //index 9 private String password;
		 * //index 10
		 */
		customerInfo.add("John");
		customerInfo.add("Doe");
		customerInfo.add("1988-01-01");
		customerInfo.add("male");
		customerInfo.add("2200 169th St");
		customerInfo.add("Hammond");
		customerInfo.add("IN");
		customerInfo.add("46323");
		customerInfo.add("2191234567");
		customerInfo.add("johndoe@gmail.com");
		customerInfo.add("123");
		Customer customer = new Customer(customerInfo);
		try {
			customer.setDateOfBirth("1988-01-01");
			assertTrue(true);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	// Based on SRS v4.2 Section 3.2.2.1
	public void setGender_testFormatNormal() throws Exception {
		ArrayList<String> customerInfo = new ArrayList<String>();
		/*
		 * private String firstName; //index 0 private String lastName; //index
		 * 1 private String dateOfBirth; //index 2 private String gender;
		 * //index 3 private String physicalAddress; //index 4 private String
		 * addressCity; //index 5 private String addressState; //index 6 private
		 * String addressZipCode; //index 7 private String phoneNumber; //index
		 * 8 private String emailAddress; //index 9 private String password;
		 * //index 10
		 */
		customerInfo.add("John");
		customerInfo.add("Doe");
		customerInfo.add("1988-01-01");
		customerInfo.add("male");
		customerInfo.add("2200 169th St");
		customerInfo.add("Hammond");
		customerInfo.add("IN");
		customerInfo.add("46323");
		customerInfo.add("2191234567");
		customerInfo.add("johndoe@gmail.com");
		customerInfo.add("123");
		Customer customer = new Customer(customerInfo);
		try {
			customer.setGender("male");
			assertTrue(true);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	// Based on SRS v4.2 Section 3.2.2.1
	public void setPhoneNumber_testFormatNormal() throws Exception {
		ArrayList<String> customerInfo = new ArrayList<String>();
		/*
		 * private String firstName; //index 0 private String lastName; //index
		 * 1 private String dateOfBirth; //index 2 private String gender;
		 * //index 3 private String physicalAddress; //index 4 private String
		 * addressCity; //index 5 private String addressState; //index 6 private
		 * String addressZipCode; //index 7 private String phoneNumber; //index
		 * 8 private String emailAddress; //index 9 private String password;
		 * //index 10
		 */
		customerInfo.add("John");
		customerInfo.add("Doe");
		customerInfo.add("1988-01-01");
		customerInfo.add("male");
		customerInfo.add("2200 169th St");
		customerInfo.add("Hammond");
		customerInfo.add("IN");
		customerInfo.add("46323");
		customerInfo.add("2191234567");
		customerInfo.add("johndoe@gmail.com");
		customerInfo.add("123");
		Customer customer = new Customer(customerInfo);
		try {
			customer.setPhoneNumber("2191234567");
			assertTrue(true);
		} catch (Exception e) {
			fail();
		}
	}

	
	@Test
	// Based on SRS v4.2 Section 3.2.2.1
	public void setEmail_testFormatNormal() throws Exception {
		ArrayList<String> customerInfo = new ArrayList<String>();
		/*
		 * private String firstName; //index 0 private String lastName; //index
		 * 1 private String dateOfBirth; //index 2 private String gender;
		 * //index 3 private String physicalAddress; //index 4 private String
		 * addressCity; //index 5 private String addressState; //index 6 private
		 * String addressZipCode; //index 7 private String phoneNumber; //index
		 * 8 private String emailAddress; //index 9 private String password;
		 * //index 10
		 */
		customerInfo.add("John");
		customerInfo.add("Doe");
		customerInfo.add("1988-01-01");
		customerInfo.add("male");
		customerInfo.add("2200 169th St");
		customerInfo.add("Hammond");
		customerInfo.add("IN");
		customerInfo.add("46323");
		customerInfo.add("2191234567");
		customerInfo.add("johndoe@gmail.com");
		customerInfo.add("123");
		Customer customer = new Customer(customerInfo);
		try {
			customer.setEmailAddress("johndoe@gmail.com");
			assertTrue(true);
		} catch (Exception e) {
			fail();
		}
	}
	
}
