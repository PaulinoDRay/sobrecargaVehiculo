package colecciones;
import java.util.ArrayList;
import java.util.Scanner;
	public class usoClientes {
	public static void main(String[] args) {
		// Declaracion de variables
		String Id;
		Scanner tecla = new Scanner(System.in);
		boolean estado;
		// Difinir e inicializar los elementos de la colección
		ArrayList<Clientes> miLista = new ArrayList<Clientes>();
		// Añadir 5 clientes
		miLista.add(new Clientes("CLI001", "ROJAS", "SANTIAGO", 25,true));
		miLista.add(new Clientes("CLI002", "ZAVALA", "URSULA", 24,false));
		miLista.add(new Clientes("CLI003", "GARCIA", "MATHIAS", 23,true));
		miLista.add(new Clientes("CLI004", "URBANO", "LORENA", 22,false));
		miLista.add(new Clientes("CLI005", "BALLON", "MARIO", 21,true));
		
		// Listar los clientes
		for (Clientes ObjC : miLista) 
			System.out.println(ObjC.toString());
		System.out.println("\nTOTAL DE CLIENTES :" + miLista.size());
		
		// Busqueda
		do {
			estado = false;
			System.out.println("\nINGRESE IDCLIENTES BUSCAR:");
			Id = tecla.nextLine();
			for (Clientes ObjC : miLista)
				if(ObjC.getIdCliente().equalsIgnoreCase(Id)) {
					estado = true;
					System.out.println("\n*** ID ENCONTRADO :" + ObjC.toString());
					break;
				}
			
			if(!estado) System.out.println("\n*** ERROR: ID NO EXISTE");			
		}while(Id != "");
	
	}
	}
