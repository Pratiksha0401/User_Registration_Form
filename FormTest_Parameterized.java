package Registration_Form.Validation.util;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//parameterized test 
@RunWith(Parameterized.class)
public class FormTest_Parameterized {
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object [][]{
			{"lalu@gmail.com", true}, {"#sdadfd@@gmail.com", false}
		});
	}

	private final String email;
	private final boolean expected;
	
	public FormTest_Parameterized(String email, boolean expected) {
		this.email = email;
		this.expected = expected;
		
	}
	

	@Test
	public void testEmailID_shouldReturnAsExpected() {
		boolean isValid=Form.isValidEmailID(email);
		assertEquals(isValid, expected);
	}
}
