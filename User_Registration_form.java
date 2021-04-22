import java.util.regex.*;
import java.util.*;
class  User_Registration_form extends User
{
	

	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in); 
    User_Registration_form form=new User_Registration_form();
    
	while(true){
      System.out.println("Enter First Name");
      String first_Name=sc.nextLine();
      if((form.isValid_firstName(first_Name))==true)
        break;
      else
        System.out.println("Invalid...1st letter must be Capital");
    }

    while(true){
      System.out.println("Enter last Name");
      String last_Name=sc.nextLine();
      if((form.isValid_lastName(last_Name))==true)      
        break;
      else
        System.out.println("Invalid...1st letter must be Capital");
    }

	  while(true){
      System.out.println("Enter Email Id");
      String emailId=sc.nextLine();
      if((form.isValid_emailId(emailId))==true)
        break;
      else
        System.out.println("Invalid.. enter valid email Id");
    }

	  while(true){
      System.out.println("Enter Phone Number");
      String phoneNumber=sc.nextLine();
      if((form.isValid_phoneNumber(phoneNumber))==true)
        break;
      else
        System.out.println("Invalid.. enter phone number");
    }

	 while(true){
      System.out.println("Enter password");
      String password=sc.nextLine();
      if((form.isValid_password(password))==true)
        break;
      else
        System.out.println("Invalid.. enter at least 8 char password");
    }

  }
}

class User
{
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneNumber;
	private String password;
	Pattern p;
	Matcher m;
	String regex;
  protected boolean isValid_firstName(String first_Name)
	{
    this.firstName=first_Name;
		regex="^[A-Z]{1}[a-z]+";
		p = Pattern.compile(regex);
		if (firstName == null) {
          return false;
        }
		 m= p.matcher(firstName);
		return m.matches();
	}

  protected boolean isValid_lastName(String last_Name)
	{
    this.lastName=last_Name;
		regex="^[A-Z]{1}[a-z]+";
		p = Pattern.compile(regex);
		if (lastName == null) {
          return false;
        }
		m = p.matcher(lastName);
		return m.matches();
	}

	protected boolean isValid_emailId(String emailId)
	{
    this.emailId=emailId;
		 regex="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
		p = Pattern.compile(regex);
		if (emailId == null) {
          return false;
        }
		m = p.matcher(emailId);
		return m.matches();
	}

	protected boolean isValid_phoneNumber(String phoneNumber)
	{
    this.phoneNumber=phoneNumber;
		 regex="^[1-9]{2}\\s{0,1}[1-9]{1}[0-9]{9}$";
		p = Pattern.compile(regex);
		if (phoneNumber== null) {
          return false;
        }
		m = p.matcher(phoneNumber);
		return m.matches();
	}

		protected boolean isValid_password(String password)
	{
    this.password=password;
		 regex="^[a-zA-Z]{8,}+$";
		p = Pattern.compile(regex);
		if (password== null) {
          return false;
        }
		m = p.matcher(password);
		return m.matches();
	}

}