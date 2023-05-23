package gestion;

public abstract class Empleado implements Comparable<Object> {

	protected String nombre = "";

	protected String apellidos = "";

	protected Sexo sexo = Sexo.valueOf("H");

	enum Sexo {
		H, M
	}

	public Empleado(String nombre, String apellidos) {
		if (nombre != null && !nombre.isEmpty() && apellidos != null && !apellidos.isEmpty()) {
			this.nombre = nombre;
			this.apellidos = apellidos;
		}
	}

	public Empleado(String nombre, String apellidos, String sexo) {
		if (nombre != null && !nombre.isEmpty() && apellidos != null && !apellidos.isEmpty() && sexo != null
				&& !sexo.isEmpty()) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.sexo = Sexo.valueOf(sexo);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isEmpty()) {
			this.apellidos = apellidos;
		}
	}

	public String getSexo() {
		String sexoCadena = "";
		sexoCadena = String.valueOf(sexo);
		return sexoCadena;
	}

	public void setSexo(String sexo) {
		if (sexo != null && !sexo.isEmpty()) {
			this.sexo = Sexo.valueOf(sexo);
		}
	}

	public String toString() {
		String resultado = "";

		resultado += "Nombre: " + getNombre() + " ";

		resultado += "Apellidos: " + getApellidos() + " \n";

		resultado += "Sexo: " + getSexo();

		return resultado;
	}

	public boolean equals(Object o) {
		boolean resultado = true;

		Empleado emp = (Empleado) o;

		if (this.nombre.equals(emp.nombre) && this.apellidos.equals(emp.apellidos)) {
			resultado = true;
		}
		return resultado;
	}

	public abstract double calculaSalario();

	@Override
	public int compareTo(Object o) {
		int resultado = 0;

		Empleado emp = (Empleado) o;

		if (!this.apellidos.equalsIgnoreCase(emp.apellidos)) {

			if (this.apellidos.compareTo(emp.apellidos) > 0) {
				resultado = -1;
			} else if (this.apellidos.compareTo(emp.apellidos) < 0) {
				resultado = 1;
			}

		} else if (this.nombre.compareTo(emp.nombre) > 0) {
			resultado = -1;
		} else if (this.nombre.compareTo(emp.nombre) < 0) {
			resultado = 1;
		}

		return resultado;
	}

}
