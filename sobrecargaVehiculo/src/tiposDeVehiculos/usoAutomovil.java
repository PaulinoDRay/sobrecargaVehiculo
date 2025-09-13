package tiposDeVehiculos;
import java.util.ArrayList;

public class usoAutomovil {
	public static void main(String[] args) {
	// En esta sección se Inicializan los elementos de la lista de automoviles.
	ArrayList<Automovil> listaAutomoviles = new ArrayList<Automovil>();
	// A continuación se añaden 5 Vehiculos.
	listaAutomoviles.add(new Automovil("Auto 001","HONDA     ","ACCORD    ","ROJO", 2010));
	listaAutomoviles.add(new Automovil("Auto 002","VOLKSWAGEM","ESCARABAJO","NEGRO", 1990));
	listaAutomoviles.add(new Automovil("Auto 003","TOYOTA    ","RAV 4     ","NEGRO", 2018));
	listaAutomoviles.add(new Automovil("Auto 004","HYUNDAI   ","ELANTRA   ","GRIS", 2003));
	listaAutomoviles.add(new Automovil("Auto 005","FORD      ","PICKU UP  ","AZUL", 2015));
	// Listar los automoviles
	for(Automovil ObjAT:listaAutomoviles)
		System.out.print(ObjAT.toString());	
	}	
}
