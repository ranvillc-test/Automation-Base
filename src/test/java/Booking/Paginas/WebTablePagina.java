package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.BotonesPagina;

public class WebTablePagina {
	
	private WebDriver driver;
	private BotonesPagina botonesPagina;
	
	
	public WebTablePagina(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
		this.botonesPagina=new BotonesPagina(driver);
	}
	
	public void webTableM() {
		botonesPagina.btnTable();
	}
	
	

}
