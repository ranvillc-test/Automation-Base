package Booking.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.BotonesPagina;
import Booking.Steps.Questions;
import net.thucydides.core.annotations.Step;




public class EnviarCorreoPagina {
	
	private WebDriver driver;
	private BotonesPagina botonesPaginas;
	private Questions questions;

	
	
	@FindBy(how = How.XPATH,using= "//input[@placeholder='Full Name']")
	private WebElement textName;
	
	@FindBy(how = How.ID ,using= "userEmail")
	private WebElement textemail;
	
	public EnviarCorreoPagina(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.botonesPaginas= new BotonesPagina(driver);
		this.questions=new Questions(driver);

	}
	
	@Step
	public void registroCorreo(String nombre,String correo) {
		textName.sendKeys(nombre);
		textemail.sendKeys(correo);
		botonesPaginas.scrollBajarSumit();
		botonesPaginas.btnEnviar();
		questions.assertDatos(nombre);
	
	}
	
	@Step
	public void validacionCampos(String nombreP) {
		questions.assertDatos(nombreP);
	}
	

}
