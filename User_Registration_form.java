import java.util.regex.*;
import java.util.*;
class  User_Registration_form
{
	static private boolean isValid_firstName(User user)
	{
		String regex="^[A-Z]{1}[a-z]+";
		Pattern p = Pattern.compile(regex);
		if (user.firstName == null) {
          return false;
        }
		Matcher m = p.matcher(user.firstName);
		return m.matches();
	}
	public static void main(String[] args) 
	{
    Scanner sc=new Scanner(System.in); 
    User_Registration_form form=new User_Registration_form();
    
    while(true){
      System.out.println("Enter First Name");
      String first_Name=sc.nextLine();
      User user=new User(first_Name);
      if((form.isValid_firstName(user))==true){
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

  public User(String first_Name){
        this.firstName=first_Name;
  }

	public String getfirstName()
  {
    return firstName;
  }
}