package main;

import java.util.*;

import main.Mesa.*;

public class SistemaDeTurnos {
	private String _nombre;
	private Map<Integer, Persona> padron; //Almacena las personas que estan en el padron, Integer dni, Persona p
	private Set<Mesa> mesas;	//Almacena las mesas
	private Map<Turno, Boolean> registro; //almacena los turnos y si se presento o no a votar 
	
	public SistemaDeTurnos(String nombreSistema){
		_nombre = nombreSistema;
	}
	
	public void registrarVotante(Integer dni, String nombre, Integer edad, Boolean enfPrevia, Boolean trabaja) {
	//se encarga de registrar las personas en el padron
		Persona p = new Persona(dni, nombre, edad, enfPrevia, trabaja);
		padron.put(dni, p);
	}

	public Integer agregarMesa(String tipoMesa, Integer dni) {
		//registra la mesa segun su tipo junto con el dni del presidente y devuelve el numero de mesa
		Mesa mesa = new Mesa(tipoMesa, dni);
		if(mesa instanceof Mesa) {
			return mesa.get_numeroMesa();
		}
		/*
		if(tipoMesa.equals("Enf_Preex")) {
			Mesa mesa = new MesaEnfPreexistentes(dni);
			return mesa.get_numeroMesa();
		}
		if(tipoMesa.equals("Mayor65")) {
			Mesa mesa2 = new MesaMayores(dni);
			return mesa2.get_numeroMesa();
		}
		*/
		return 0;
	}

	public void asignarTurno() {
	//revisa las condiciones de la persona y llama a su respectiva mesa para darle el turno,controla la logica de si es mayor de 65 (inclusive) y tiene una enfermedad preexistente, etc.
	}

	public void asignarTurno(Persona p) { 	//sobrecarga del metodo asignarTurno()
		//revisa las condiciones de la persona y llama a su respectiva mesa para darle el turno,controla la logica de si es mayor de 65 (inclusive) y tiene una enfermedad preexistente, etc.
	}

	public void asignarENfPreexistentes(Persona p) {
		//limita el cupo a 20 por franja horario (19 contando al presidente)
		//asigna el turno a las personas con enfermedades preexistentes
	}
	
	public void asignarTrabajadores(Persona p) {
		//pide el certificado de trabajo
		
	}
	
	public void asignarMayores(Persona p) {
		//limita el cupo a 10 por franja horario (9 contando al presidente)
		//asigna el turno a las personas mayores de 65
	}
	
	public void asignarMesaNormal(Persona p) {
		//limita el cupo a 30 por franja horario (29 contando al presidente)
	}
	
	public void registroDeVotantes() {
		//se encarga de almacenar los votantes, con su turno y si se present� o no
	}
	
	public int votanteSinTurno(Mesa m){
		//returna la cantidad de turnos restantes en una mesa
	}
	//consulta el turno para una persona
	public Boolean tieneTurno(Persona p) {
	}
}
