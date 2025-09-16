//package test;
//
//import org.testng.annotations.Test;
//public class day2{
//	@Test
//	public void WebloginCarLoan() {
//		//selenium
//		System.out.println("Weblogincarloan");
//	}
//	public void MobilelogincarLoan() {
//		//appium
//		System.out.println("MobileLoginCarLoan");
//	}
//	@Test
//	public void  LoginAPIcarLoan() {
//		//RestAPI
//		System.out.println("LoginAPICarLoan");
//	}
//	
//}

package test;

import org.testng.annotations.Test;

public class day2 {

    @Test(groups = "web")
    public void WebloginCarLoan() {
        System.out.println("WebloginCarLoan");
    }

    @Test(groups = "mobile")
    public void MobileloginCarLoan() {
        System.out.println("MobileLoginCarLoan");
    }

    @Test(groups = "api")
    public void LoginAPIcarLoan() {
        System.out.println("LoginAPICarLoan");
    }
}
