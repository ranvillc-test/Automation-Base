package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.BotonesPagina;
import net.thucydides.core.annotations.Step;

public class CargarArchivoPagina {
	
	private WebDriver driver;
	private BotonesPagina botonesPaginas;
	
	public CargarArchivoPagina(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		botonesPaginas= new BotonesPagina(driver);
	}
	
	@Step
	public void llegarUpload() {
		botonesPaginas.scrollBajarSumit();
		botonesPaginas.btnDowload();
		botonesPaginas.CargarArchivo();
	}

}
