package gestion;

import java.util.Arrays;
import java.util.Scanner;

public class ListadoEmpleados {

	static Empleado[] listaEmpleados = new Empleado[10];

	public static int posicionLibre() {
		int posicionLibre = 0;
		int posicion = 0;

		while (posicion < listaEmpleados.length) {
			if (listaEmpleados[posicion] == null) {
				posicionLibre = posicion;
				break;
			}
		}
		return posicionLibre;
	}

	public static int buscaEmpleado(Empleado e) {
		int posicionEmpleado = 0;
		int posicion = 0;

		while (posicion < listaEmpleados.length) {
			if (listaEmpleados[posicion].equals(e)) {
				posicionEmpleado = posicion;
				break;

			} else {
				posicionEmpleado = -1;
			}
		}
		return posicionEmpleado;
	}

	public static void listarEmpleados() {

		Arrays.sort(listaEmpleados);

		for (Empleado emp : listaEmpleados) {
			System.out.println(emp);
			System.out.println();
		}
	}

	public static void añadirEmpleado(Empleado emp, String tipoEmpleado) {
		String nombre = "";
		String apellidos = "";
		String sexo = "";
		double sueldo = 0;
		int horas = 0;
		double sueldoHora = 0;
		double ventas = 0;
		double porcentaje = 0;

		Scanner dogma = new Scanner(System.in);

		if (buscaEmpleado(emp) >= 0) {
			System.out.println("Ese empleado ya se encuentra en la lista.");

		} else {

			switch (tipoEmpleado) {

			case "gestion.Empleado" -> {
				System.out.println("Introduzca valor para nombre.");
				nombre = dogma.nextLine();

				System.out.println("Introduzca valor para apellidos.");
				apellidos = dogma.nextLine();

				System.out.println("Introduzca valor para sexo.");
				sexo = dogma.nextLine();

				// no puedo instanciar Empleado?
				// listaEmpleados [posicionLibre()] = new Empleado (nombre, apellidos, sexo);
				listaEmpleados[posicionLibre()].setNombre(sexo);
				listaEmpleados[posicionLibre()].setApellidos(sexo);
				listaEmpleados[posicionLibre()].setSexo(sexo);

			}

			case "gestion.Fijo" -> {

				System.out.println("Introduzca valor para sueldo. ");
				sueldo = dogma.nextDouble();
				dogma.nextLine();

				listaEmpleados[posicionLibre()] = new Fijo(nombre, apellidos, sexo, sueldo);
			}

			case "gestion.PorHoras" -> {
				System.out.println("Introduzca valor para horas. ");
				horas = dogma.nextInt();
				dogma.nextLine();

				System.out.println("Introduzca valor para sueldo por horas.");
				sueldoHora = dogma.nextDouble();
				dogma.nextLine();

				listaEmpleados[posicionLibre()] = new PorHoras(nombre, apellidos, sexo, horas, sueldoHora);
			}

			case "gestion.AComision" -> {
				System.out.println("Introduzca valor para ventas. ");
				ventas = dogma.nextDouble();
				dogma.nextLine();

				System.out.println("Introduzca valor para porcentaje. ");
				porcentaje = dogma.nextDouble();
				dogma.nextLine();

				listaEmpleados[posicionLibre()] = new AComision(nombre, apellidos, sexo, ventas, porcentaje);
			}

			default -> {
				System.out.println("Tipo de empleado no valido.");
			}

			}

		}
	}

	public static void modificarEmpleado(Empleado emp) {
		String tipoEmpleado = emp.getClass().getName();
		String sexo = "";
		double sueldo = 0;
		int horas = 0;
		double sueldoHora = 0;
		double ventas = 0;
		double porcentaje = 0;

		Scanner dogma = new Scanner(System.in);

		if (buscaEmpleado(emp) < 0) {
			System.out.println("Ese empleado no se encuentra en la lista.");

		} else {
			System.out.println("Que tipo de empleado quiere modificar en la lista?");

			tipoEmpleado = dogma.nextLine();

			switch (tipoEmpleado) {

			case "gestion.Empleado" -> {
				System.out.println("Introduzca valor para ");
				sexo = dogma.nextLine();

				listaEmpleados[posicionLibre()].setSexo(sexo);
			}

			case "gestion.Fijo" -> {

				System.out.println("Introduzca valor para sueldo. ");
				sueldo = dogma.nextDouble();
				dogma.nextLine();

				// machacar cmisma pos con cast no funciona
				// listaEmpleados [buscaEmpleado(emp)]= listaEmpleados [buscaEmpleado(emp)] =
				// (Fijo) emp;
				// cast no funciona
				// listaEmpleados [buscaEmpleado(emp)] = (Fijo) emp;

				// setter no funciona
				// listaEmpleados [buscaEmpleado(emp)].setSueldo(sueldo);
				// constructor no funciona
				// listaEmpleados[buscaEmpleado(emp)] = new Fijo(nombre, apellidos, sexo,
				// sueldo);
			}

			case "gestion.PorHoras" -> {
				System.out.println("Introduzca valor para horas. ");
				horas = dogma.nextInt();
				dogma.nextLine();

				System.out.println("Introduzca valor para sueldo por horas.");
				sueldoHora = dogma.nextDouble();
				dogma.nextLine();

				// listaEmpleados[buscaEmpleado(emp)] = new PorHoras(nombre, apellidos, sexo,
				// horas, sueldoHora);
			}

			case "gestion.AComision" -> {
				System.out.println("Introduzca valor para ventas. ");
				ventas = dogma.nextDouble();
				dogma.nextLine();

				System.out.println("Introduzca valor para porcentaje. ");
				porcentaje = dogma.nextDouble();
				dogma.nextLine();

				// listaEmpleados[buscaEmpleado(emp)] = new AComision(nombre, apellidos, sexo,
				// ventas, porcentaje);
			}

			default -> {
				System.out.println("Tipo de empleado no valido.");
			}

			}
		}

	}

	public static void eliminarEmpleado(Empleado emp) {

		if (buscaEmpleado(emp) < 0) {
			System.out.println("Ese empleado no se encuentra en la lista.");

		} else {
			listaEmpleados[buscaEmpleado(emp)].setNombre(null);
			listaEmpleados[buscaEmpleado(emp)].setApellidos(null);
		}

	}

}
