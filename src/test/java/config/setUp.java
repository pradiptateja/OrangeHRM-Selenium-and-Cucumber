package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setUp {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected static int duration = 30;
    protected static Boolean isHeadless = true;

    protected static String WebURL = "https://opensource-demo.orangehrmlive.com/";


    //Global Variable Directory
    protected static String fileFirstName = "src/test/resources/files/GlobalVariable/employeeFirstName.txt";
    protected static String fileMiddleName = "src/test/resources/files/GlobalVariable/employeeMiddleName.txt";
    protected static String fileLastName = "src/test/resources/files/GlobalVariable/employeeLastName.txt";

    protected static String fileEmployeeID = "src/test/resources/files/GlobalVariable/employeeID.txt";

    protected static String fileEmployeeUsername = "src/test/resources/files/GlobalVariable/employeeUsername.txt";
    protected static String fileEmployeePassword = "src/test/resources/files/GlobalVariable/employeePassword.txt";

    protected static String fileEmployee2FirstName = "src/test/resources/files/GlobalVariable/employee2FirstName.txt";
    protected static String fileEmployee2LastName = "src/test/resources/files/GlobalVariable/employee2LastName.txt";
    protected static String fileEmployee3FirstName = "src/test/resources/files/GlobalVariable/employee3FirstName.txt";
    protected static String fileEmployee3LastName = "src/test/resources/files/GlobalVariable/employee3LastName.txt";
    protected static String fileEmployee3Username = "src/test/resources/files/GlobalVariable/employee3Username.txt";
    protected static String fileEmployee3Password = "src/test/resources/files/GlobalVariable/employee3Password.txt";


}
