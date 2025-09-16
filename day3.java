//package test;
//
//import org.testng.annotations.Test;
//
//public class day3 {
//
//	@Test
//	public void WebloginHomeLoan() {
//	    // selenium
//	    System.out.println("WebloginHomeLoan");
//	}
//
//	@Test
//	public void MobileloginHomeLoan() {
//	    // appium
//	    System.out.println("MobileloginHomeLoan");
//	}
//
//	@Test
//	public void LoginAPIHomeLoan() {
//	    // RestAPI
//	    System.out.println("LoginAPIHomeLoan");
//	}
//
//}

package test;

import org.testng.annotations.Test;

public class day3 {

    @Test(groups = "web")
    public void WebloginHomeLoan() {
        System.out.println("WebloginHomeLoan");
    }

    @Test(groups = "mobile")
    public void MobileloginHomeLoan() {
        System.out.println("MobileloginHomeLoan");
    }

    @Test(groups = "api")
    public void LoginAPIHomeLoan() {
        System.out.println("LoginAPIHomeLoan");
    }
}