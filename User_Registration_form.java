import java.util.regex.*;
import java.util.*;
class  User_Registration_form
{
	Pattern p;
	Matcher m;
	String regex;

	protected boolean isValid_firstName(User user){
		regex="^[A-Z]{1}[a-z]+";
		p = Pattern.compile(regex);
		if (user.getFirstName() == null) {
          return false;
        }
		 m= p.matcher(user.getFirstName());
		return m.matches();
	}

  protected boolean isValid_lastName(User user){
		regex="^[A-Z]{1}[a-z]+";
		p = Pattern.compile(regex);
		if (user.getLastName()== null) {
          return false;
        }
		m = p.matcher(user.getLastName());
		return m.matches();
	}

	protected boolean isValid_emailId(User user){
		regex="^[A-Z a-z 0-9]+([._+-][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]+.[a-z A-Z]{2,3}([.][a-z A-Z]{2})*$";
		p = Pattern.compile(regex);
		if (user.getEmailId() == null) {
          return false;
        }
		m = p.matcher(user.getEmailId());
		return m.matches();
	}

	protected boolean isValid_MobileNumber(User user){
		regex="^[1-9]{2}\\s{0,1}[1-9]{1}[0-9]{9}$";
		p = Pattern.compile(regex);
		if (user.getMobileNumber()== null) {
          return false;
        }
		m = p.matcher(user.getMobileNumber());
		return m.matches();
	}

	protected boolean isValid_Password(User user){
		regex="^(?=[0-9 A-Z a-z !@#$%^&*();:]{8,}$)(?=.*?[A-Z]{1,})(?=.*?[0-9]{1,})(?=.*?[!@#$%^&*();:]{1,}).*$";
		p = Pattern.compile(regex);
		if (user.getPassword()== null) {
          return false;
        }
		m = p.matcher(user.getPassword());
		return m.matches();
	}

	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in); 
    User_Registration_form form=new User_Registration_form();
    User user=new User();
	
	while(true){
      System.out.println("Enter First Name");
      user.setFirstName(sc.nextLine());
      if((form.isValid_firstName(user))==true)
        break;
      else
        System.out.println("Invalid...1st letter must be Capital");
	  }

    while(true){
      System.out.println("Enter last Name");
      user.setLastName(sc.nextLine());
      if((form.isValid_lastName(user))==true)   
        break;
      else
        System.out.println("Invalid...1st letter must be Capital");
	 }

	  while(true){
      System.out.println("Enter Email Id");
      user.setEmailId(sc.nextLine());
      if((form.isValid_emailId(user))==true)
        break;
      else
        System.out.println("Invalid.. enter valid email Id");
	}

	while(true){
      System.out.println("Enter Mobile Number");
      user.setMobileNumber(sc.nextLine());
      if((form.isValid_MobileNumber(user))==true)
        break;
      else
        System.out.println("Invalid.. enter 10 digit mobile number with 2 digit code");
	}

	while(true){
      System.out.println("Enter Password");
      user.setPassword(sc.nextLine());
      if((form.isValid_Password(user))==true)
        break;
      else
        System.out.println("Invalid.. enter 8 char min with 1 capital letter and at 1 digit");
	}
  }
}

class User
{
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String password;

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