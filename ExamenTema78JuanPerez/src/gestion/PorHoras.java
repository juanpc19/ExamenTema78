package gestion;

public class PorHoras extends Empleado {

	private int horas = 0;

	private double sueldoHora = 0.0;

	public PorHoras(String nombre, String apellidos) {
		super(nombre, apellidos);
	}

	public PorHoras(String nombre, String apellidos, String sexo, int horas, double sueldoHora) {
		super(nombre, apellidos, sexo);
		if (horas > 0 && sueldoHora > 0.1) {
			this.horas = horas;
			this.sueldoHora = sueldoHora;
		}
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if (horas > 0) {
			this.horas = horas;
		}
	}

	public double getSueldoHora() {
		return sueldoHora;
	}

	public void setSueldoHora(double sueldoHora) {
		if (sueldoHora > 0.1) {
			this.sueldoHora = sueldoHora;
		}
	}

	@Override
	public double calculaSalario() {
		double resultado = 0.0;

		resultado = horas * sueldoHora;

		return resultado;
	}

	@Override
	public String toString() {
		String resultado = super.toString();

		resultado += "\n " + "Salario: " + calculaSalario();

		return resultado;
	}

}
