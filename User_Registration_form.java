package Registration_Form.Validation.util;

import java.util.regex.*;

import javax.script.ScriptException;

import Registration_Form.Validation.util.UserValidation_Exception.Validation;
import Registration_Form.Validation.util.ValidationException.Code;

import java.util.*;
import java.util.function.Predicate;
class  User_Registration_Form
{
	static Pattern p;
	static Matcher m;
	static String regex;

	protected static boolean isValidFirstName(User user) throws UserValidation_Exception  {
		regex="^[A-Z]{1}[a-z]+";
		
		try {
			if (user.getFirstName() == null) {
				throw new UserValidation_Exception(Validation.NULL,"Null firstName");
	        }
			else if(user.getFirstName()=="")
				throw new UserValidation_Exception(Validation.EMPTY,"Empty firstName");
			else {	
				Predicate<String> predicate=p->user.getFirstName().matches(regex);
				boolean result = predicate.test(user.getFirstName());
				return result;
				}
		}catch(UserValidation_Exception e) {
			throw new UserValidation_Exception(Validation.INVALID,"Invalid firstName");
		}	
		
	}

  protected static boolean isValidLastName(User user) throws UserValidation_Exception{
		regex="^[A-Z]{1}[a-z]+";
		try {
			if (user.getLastName()== null) 
				throw new UserValidation_Exception(Validation.NULL,"Null lastName");
			else if(user.getLastName()==" ")
				throw new UserValidation_Exception(Validation.EMPTY,"Empty lasttName");
			else {	
				Predicate<String> predicate=p->user.getLastName().matches(regex);
				boolean result = predicate.test(user.getLastName());
				return result;
				}
		}catch(Exception e) {
			throw new UserValidation_Exception(Validation.INVALID,"Invalid firstName");
		}	
	}

	protected static boolean isValid_emailId(User user) throws UserValidation_Exception{
		regex="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
		try {
			if (user.getEmailId() == null) 
				throw new UserValidation_Exception(Validation.NULL,"Null Email Id");
			else if(user.getEmailId()==" ")
				throw new UserValidation_Exception(Validation.EMPTY,"Empty Email Id");
			else {	
				Predicate<String> predicate=p->user.getEmailId().matches(regex);
				boolean result = predicate.test(user.getEmailId());
				return result;
				}
		}catch(Exception e) {
			throw new UserValidation_Exception(Validation.INVALID,"Invalid Email Id");
		}	
	}

	protected static boolean isValid_MobileNumber(User user) throws UserValidation_Exception{
		regex="^[1-9]{2}\\s{0,1}[1-9]{1}[0-9]{9}$";
		try {
			if (user.getMobileNumber()== null) 
				throw new UserValidation_Exception(Validation.NULL,"Null Mobile Number");
			else if(user.getMobileNumber()==" ")
				throw new UserValidation_Exception(Validation.EMPTY,"Empty Mobile Number");
			else {	
				Predicate<String> predicate=p->user.getMobileNumber().matches(regex);
				boolean result = predicate.test(user.getMobileNumber());
				return result;
				}
		}catch(Exception e) {
			throw new UserValidation_Exception(Validation.INVALID,"Invalid Mobile Number");
		}	
	}

	protected static boolean isValid_Password(final User user) throws UserValidation_Exception{
		regex="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";
		try {
			if (user.getPassword()== null) 
				throw new UserValidation_Exception(Validation.NULL,"Null Password");
			else if(user.getPassword()==" ")
				throw new UserValidation_Exception(Validation.EMPTY,"Empty Password");
			else {	
				Predicate<String> predicate=p->user.getPassword().matches(regex);
				boolean result = predicate.test(user.getPassword());
				return result;
				}
		}catch(Exception e) {
			throw new UserValidation_Exception(Validation.INVALID,"Invalid Password");
		}	
	}

	public static void main(String[] args) throws UserValidation_Exception 
	{
    Scanner sc=new Scanner(System.in); 
    User_Registration_Form form=new User_Registration_Form();
    User user =new User();
    
      System.out.println("Enter First Name");
      user.setFirstName(sc.next());
      System.out.println(user.getFirstName()+":"+isValidFirstName(user));
      
      System.out.println("Enter last Name");
      user.setLastName(sc.next());
      System.out.println(user.getLastName()+":"+isValidLastName(user));
	  
      System.out.println("Enter Email Id");
      user.setEmailId(sc.next());
      System.out.println(user.getEmailId()+":"+isValid_emailId(user));
	
      System.out.println("Enter Mobile Number");
      user.setMobileNumber(sc.next());
      System.out.println(user.getMobileNumber()+":"+isValid_MobileNumber(user));
      
      System.out.println("Enter Password");
      user.setPassword(sc.next());
      System.out.println(user.getPassword()+":"+isValid_Password(user));
      
      
	}
}

class User
{
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String password;
	
	public User(String firstName,String lastName,String emailId,String mobileNumber,String password) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.mobileNumber=mobileNumber;
		this.password=password;
	}
	
	public User() {

	}

	public String getFirstName(){
		return firstName;
	  }
	public void setFirstName(String firstname) {
			this.firstName=firstname;
	  }

	 public String getLastName(){
		return lastName;
	  }
	  public void setLastName(String lastName) {
			this.lastName=lastName;
	 }

	 public String getEmailId(){
		return emailId;
	  }
	  public void setEmailId(String emailId) {
			this.emailId=emailId;;
	 }

	 public String getMobileNumber(){
		return mobileNumber;
	  }
	  public void setMobileNumber(String mobileNumber) {
			this.mobileNumber=mobileNumber;;
	 }

	 public String getPassword(){
		return password;
	  }
	  public void setPassword(String password) {
			this.password=password;;
	 }
}