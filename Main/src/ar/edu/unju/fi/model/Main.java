package ar.edu.unju.fi.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);

		System.out.println(alumno.toString());
		
		int numMaterias = 1;
		while(numMaterias <= 4) {
			//Cargar materia
			System.out.println("Ingese codigo de la materia: ");
			String codigoMateria= scanner.next();
			System.out.println("Ingese nombre de materia: ");
			String nombreMateria= scanner.next();
			Materia materia = new Materia(codigoMateria, nombreMateria);
			System.out.println("Ingese nota de la materia: ");
			String notaCodigo= scanner.next();
			System.out.println("Ingese nombre de materia: ");
			float notaMateria= scanner.nextFloat();
			RegistroNota registroNota = new RegistroNota(notaCodigo, alumno, materia, notaMateria); 
			System.out.println(registroNota.toString());
			numMaterias ++;
		}
			
		

	}

}
