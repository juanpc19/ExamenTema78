package gestion;

public class AComision extends Empleado {

	private double ventas = 0.0;

	private double porcentaje = 0.0;

	public AComision(String nombre, String apellidos) {
		super(nombre, apellidos);
	}

	public AComision(String nombre, String apellidos, String sexo, double ventas, double porcentaje) {
		super(nombre, apellidos, sexo);
		if (ventas > 0.1 && porcentaje > 0.1) {
			this.ventas = ventas;
			this.porcentaje = porcentaje;
		}

	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		if (ventas > 0.1) {
			this.ventas = ventas;
		}
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		if (porcentaje > 0.1) {
			this.porcentaje = porcentaje;
		}
	}

	@Override
	public double calculaSalario() {
		double resultado = 0.0;

		resultado = ventas * porcentaje;

		return resultado;
	}

	public String toString() {
		String resultado = super.toString();

		resultado += "\n " + "Salario: " + calculaSalario();

		return resultado;
	}

}
