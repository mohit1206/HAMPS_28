package com.ctli.it.mobiletestcase;

import org.testng.annotations.Test;

import com.ctli.it.lib.TestNgInitialization;
import com.ctli.it.mobilepage.BookingFilterPage;
import com.ctli.it.mobilepage.bookingPage;


public class BookingTestCase extends TestNgInitialization{
	
	@Test
	public void test() throws InterruptedException{
		bookingPage bp = new bookingPage(mobiledriver, testReport);
		BookingFilterPage bfp = new BookingFilterPage(mobiledriver, testReport);
		bp.homePageFill();
		bfp.applyFilter();
	}

}
