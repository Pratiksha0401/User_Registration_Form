package Registration_Form.Validation.util;

import static org.junit.Assert.*;

import org.junit.Test;


public class User_Registration_form_Test 
{
	User_Registration_Form form=new User_Registration_Form();
	User user1=new User("Pratiksha","Nagoshe","Pratiksh123@gmail.com","778899665544","aQqe@123");
	User user2=new User("pratiksha","nagoshe","Pra@tiksh123@gmail.com","7788s99665544","aw!qe@123");
	User user3=new User("pratiksha675","nagoshe764","Pratik.sh123@.gmail.com","aa778899665544","awqe123");
    
	@Test
    public void tset_forValidFirstName_True()
    {   	
    	boolean isValid =form.isValid_firstName(user1);
		assertTrue(isValid);
    }	
	
	@Test
    public void tset_forValidFirstName_false()
    {   	
    	boolean isValid =form.isValid_firstName(user2);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidFirstName_false_return()
    {   	
    	boolean isValid =form.isValid_firstName(user3);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidLastName_True()
    {   	
    	boolean isValid =form.isValid_lastName(user1);
		assertTrue(isValid);
    }	
	
	@Test
    public void tset_forValidLasttName_false()
    {   	
    	boolean isValid =form.isValid_lastName(user2);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidLasttName_false_return()
    {   	
    	boolean isValid =form.isValid_lastName(user3);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidEmailId_True()
    {   	
    	boolean isValid =form.isValid_emailId(user1);
		assertTrue(isValid);
    }	
	
	@Test
    public void tset_forValidEmailId_false()
    {   	
    	boolean isValid =form.isValid_emailId(user2);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidEmail_false_return()
    {   	
    	boolean isValid =form.isValid_emailId(user3);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidMobileNumber_True()
    {   	
    	boolean isValid =form.isValid_MobileNumber(user1);
		assertTrue(isValid);
    }	
	
	@Test
    public void tset_forValidMobileNumber_false()
    {   	
    	boolean isValid =form.isValid_MobileNumber(user2);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidMobileNumber_false_return()
    {   	
    	boolean isValid =form.isValid_MobileNumber(user3);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidPassword_True()
    {   	
    	boolean isValid =form.isValid_Password(user1);
		assertTrue(isValid);
    }	
	
	@Test
    public void tset_forValidPassword_false()
    {   	
    	boolean isValid =form.isValid_Password(user2);
		assertFalse(isValid);
    }
	
	@Test
    public void tset_forValidPassword_false_return()
    {   	
    	boolean isValid =form.isValid_Password(user3);
		assertFalse(isValid);
    }
    	
}
