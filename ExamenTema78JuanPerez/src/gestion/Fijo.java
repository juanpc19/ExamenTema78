package gestion;

public class Fijo extends Empleado {

	private double sueldo = 0;

	public Fijo(String nombre, String apellidos) {
		super(nombre, apellidos);

	}

	public Fijo(String nombre, String apellidos, String sexo, double sueldo) {
		super(nombre, apellidos, sexo);
		if (sueldo >= 0.1) {
			this.sueldo = sueldo;
		}
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		if (sueldo >= 0.1) {
			this.sueldo = sueldo;
		}
	}

	@Override
	public double calculaSalario() {
		return sueldo;
	}

	@Override
	public String toString() {
		String resultado = super.toString();

		resultado += "\n " + "Sueldo: " + sueldo;

		return resultado;
	}

}
