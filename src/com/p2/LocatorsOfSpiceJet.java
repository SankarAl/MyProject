package com.p2;

import org.openqa.selenium.By;

public class LocatorsOfSpiceJet {

	static By roundTripbuton=By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']");//round trip button
	static By dropDown=By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']");//drop down 1
	static By From=By.xpath("(//*[contains(text(),'Hyd')])[2]");//selecting hyd
	static By To=By.xpath("(//li/a[contains(text(),'Guw')])[2]");//selecting guw
	static By departureDate=By.xpath("(//*[text()='7'])[3]");//date selection 7
	static By passengerDropDown=By.xpath("//*[@class='paxinfo']");//drop down 3
	static By adultCount=By.xpath("//*[@id='hrefIncAdt']");//adult number
	static By clickOnDone=By.xpath("//*[@id='btnclosepaxoption']");//done
	static By currenctDropDown =By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']");//currency
	static By searchFlights=By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']");//search flights
	
}
