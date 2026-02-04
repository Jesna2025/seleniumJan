package Constants;

public class Constant {
	
	//Accessing excel file from TestData EXCEL Login page ,creating constant
	
	//The name of constant is usually written in all uppercase letters ie,TESTDATAFILE
	//user.dir gives the currentDirectory 
	
	public static final String TESTDATAFILE=System.getProperty("user.dir")+"//src//main//resources//TestData.xlsx";
	public static final String IMGPATH=System.getProperty("user.dir")+"//src//test//resources//download.jpeg";
    public static final String IMPATH_MANAGEPRODUCT=System.getProperty("user.dir")+"//src//test//resources//Scissor_Product(1).jpeg";
    public static final String CONFIGFILE=System.getProperty("user.dir")+"//src//test//resources//Config.properties";
    public static final String ERRORMESSAGEFORLOGIN="Warning:Dasboard is not displayed and login not successful";
    public static final String ERRORMESSAGEFORADDADMINUSER="Username already exist and Add Admin User is not successful";
    public static final String ERRORMESSAGEFORHOMEPAGE="Titile not displayed and Logout not successful";
    
    public static final String ERRORLOGININCORECTCREDENTIALS="Wrong credentials are entered and dashboard displayed TCFail and need to check login with wrong passwords";
}
