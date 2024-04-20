package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Saucedemopage;
import utility.Excelutilities;

public class Saucedemotest extends Baseclass {
	@Test
	public void verifiyLoginWithValidCred() throws Exception
	{
	Saucedemopage obj=new Saucedemopage(driver);
	String x1="C:\\Users\\hp\\Desktop\\book2.xlsx";
	String Sheet="Sheet1";
	int rowCount=Excelutilities.getRowCount(x1, Sheet);
	for(int i=1;i<=rowCount;i++)
	{
	String userName=Excelutilities.getCellValue(x1, Sheet, i, 
	0);
	System.out.println("username: "+userName);
	String passWord=Excelutilities.getCellValue(x1, Sheet, i, 
	1);
	System.out.println("Password : "+passWord);
	obj.sauceDemoLogin(userName, passWord);
	obj.login();
	String actualUrl=driver.getCurrentUrl();
	String expUrl="https://www.saucedemo.com/inventory.html";
	if(actualUrl.equals(expUrl))
	{
	System.out.println("Successful");
	}
	else
	{
	System.out.println("Unsuccessful");
	}
	}
	obj.addItemToCart();
	obj.clickCart();
	obj.data("varsha", "ramesh", "683567");
	obj.end();
	obj.logout();
	}

	

	
}
