package Utilities;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class FakerUtility 
{
Faker faker=new Faker();
public  String getFirstName()
{
	return faker.name().fullName();
	
}
public String getPassword()
{
	return faker.internet().password();//for password 	
}
//create 5 methods , phonenumber, email etc
public String getemail()
{
	return faker.internet().emailAddress();
}
public PhoneNumber getPhonenumber()
{
	return faker.phoneNumber();
}
public Address getAddress()
{
	return faker.address();
}

}
