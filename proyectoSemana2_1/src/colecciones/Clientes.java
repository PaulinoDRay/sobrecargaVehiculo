package colecciones;

public class Clientes {

	// Campos o atributos

		private String IdCliente;

		private String Apellidos;

		private String Nombres;

		private int Edad;

		private boolean Sexo;

		

		// Métodos Constructores

		public Clientes() {

			

		}

		

		public Clientes(String IdCliente,String Apellidos,String Nombres,int Edad,boolean Sexo) {

			this.IdCliente = IdCliente;

			this.Apellidos = Apellidos;

			this.Nombres = Nombres;

			this.Edad = Edad;

			this.Sexo = Sexo;

		}



		// Propiedades de Lectura y Escritura

		public String getIdCliente() {

			return IdCliente;

		}



		public void setIdCliente(String idCliente) {

			IdCliente = idCliente;

		}



		public String getApellidos() {

			return Apellidos;

		}



		public void setApellidos(String apellidos) {

			Apellidos = apellidos;

		}



		public String getNombres() {

			return Nombres;

		}



		public void setNombres(String nombres) {

			Nombres = nombres;

		}



		public int getEdad() {

			return Edad;

		}



		public void setEdad(int edad) {

			Edad = edad;

		}



		public boolean getSexo() {

			return Sexo;

		}



		public void setSexo(boolean sexo) {

			Sexo = sexo;

		}



		// Método toString()

		@Override

		public String toString() {

			return "Clientes [\nIdCliente=" + IdCliente + 

					"\nApellidos=" + Apellidos + 

					"\nNombres=" + Nombres + 

					"\nEdad=" + Edad + 

					"\nSexo=" + (Sexo ? "Masculino" : "Femenino");

		}
}
