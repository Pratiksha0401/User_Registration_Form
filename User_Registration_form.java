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
      if((form.isValid_firstName(first_Name))==true){
        System.out.println("Valid");
        break;
        }
      else
        System.out.println("Invalid...1st letter must be Capital");
    }

    while(true){
      System.out.println("Enter last Name");
      String last_Name=sc.nextLine();
      if((form.isValid_lastName(last_Name))==true){
        System.out.println("Valid");
        break;
        }
      else
        System.out.println("Invalid...1st letter must be Capital");
    }
  }
}

class User
{
	public String firstName;
	public String lastName;
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

	public String getfirstName()
  {
    return firstName;
  }
  public void lastName(String firstname) {
        this.firstName=firstname;
  }

  public String getlastName()
  {
    return firstName;
  }
  public void setlastName(String lastName) {
        this.lastName=lastName;
      }

}