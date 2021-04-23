package Registration_Form.Validation.util;

import java.util.regex.*;

public final class Form {
	
	private Form() {} 
	
	public static boolean isValidFirstName(String firstname) {

        String pattern1="^[A-Z]{1}[A-Z a-z]{2,}$";

        Pattern P=Pattern.compile(pattern1);
        Matcher m=P.matcher(firstname);
        return m.matches();
    }

    public static boolean isValidLastName(String lastname) {

        String pattern2="^[A-Z]{1}[A-Z a-z]{2,}$";

        Pattern Q=Pattern.compile(pattern2);
        Matcher n=Q.matcher(lastname);
        return n.matches();
    }

    public static boolean isValidEmailID(String emailId) {

        String pattern3="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";

        Pattern R=Pattern.compile(pattern3);
        Matcher o=R.matcher(emailId);
        return o.matches();
    }


    public static boolean isValidMobileNumber(String pNumb) {

        String pattern4="^[+][0-9]{1,2}\\s{0,1}[1-9]{1}[0-9]{9}$$";

        Pattern S=Pattern.compile(pattern4);
        Matcher p=S.matcher(pNumb);
        return p.matches();
     }

    public static boolean isValidPassword(String password) {

        String pattern5="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";

        Pattern T=Pattern.compile(pattern5);
        Matcher q=T.matcher(password);
        return q.matches();
    }
    
    

}
