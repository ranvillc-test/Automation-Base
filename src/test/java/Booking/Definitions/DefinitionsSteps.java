package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Paginas.CargarArchivoPagina;
import Booking.Paginas.EnviarCorreoPagina;
import Booking.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class DefinitionsSteps { // parte de interpretacion cucumber

	private WebDriver driver;
	private Conexion conexion;
	private EnviarCorreoPagina enviarCorreoPagina;
	private CargarArchivoPagina cargarArchivoPagina;
	
	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	
	@And("^seleccionar el campo nombre (.*) y correo(.*)$")
	public void envioCorreos(String nombre, String correo) {
		this.enviarCorreoPagina = new EnviarCorreoPagina(driver);
		this.enviarCorreoPagina.registroCorreo(nombre,correo);
		
	}
	
	@Then("Se valida que los campos cumplen (.*)")
	public void validacion(String nombreP) {
		this.enviarCorreoPagina.validacionCampos(nombreP);
	}
	
	@And("^llegar a cargar$")
	public void llegar() {
		this.cargarArchivoPagina = new CargarArchivoPagina(driver);
		this.cargarArchivoPagina.llegarUpload();
	}
	
}