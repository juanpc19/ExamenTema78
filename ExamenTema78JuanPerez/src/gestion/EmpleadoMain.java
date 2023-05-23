package gestion;

import java.util.Scanner;

public class EmpleadoMain {

	public static void main(String[] args) {

		String nombre = "";
		String apellidos = "";
		String sexo = "";
		double sueldo = 0;
		int horas = 0;
		double sueldoHora = 0;
		double ventas = 0;
		double porcentaje = 0;
		String tipoEmpleado = "";
		int seleccionUsuario = 5;

		Scanner dogma = new Scanner(System.in);

		while (seleccionUsuario != 0) {

			System.out.println(
					"1.Añadir empleado. \n2.Listar empleados. \n3. Modificar empleado.\nEliminar empleado.\0.Salir ");

			seleccionUsuario = dogma.nextInt();

			switch (seleccionUsuario) {

			case 1 -> {

				//ListadoEmpleados.añadirEmpleado();
			}
			case 2 -> {
				ListadoEmpleados.listarEmpleados();
			}

			case 3 -> {
				//ListadoEmpleados.modificarEmpleados();
			}

			case 4 -> {
				//ListadoEmpleados.eliminarEmpleados();
			}
			case 0 -> {

				System.out.println("Saliendo del sistema...");
			}
			default -> {

			}

			}
		}

		dogma.close();
	}

}
