#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco

@curso
Feature: envio correo Text box
Scenario Outline: envio correo 
	Given abrir el navegador
	And seleccionar el campo nombre <nombre> y correo <correo>
	Then Se valida que los campos cumplen <nombre>
	
	Examples:
	|nombre|correo|
	|Rafael|ranvillc@gmail.com|	
	