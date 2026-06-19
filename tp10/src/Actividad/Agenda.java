package Actividad;

	import java.util.HashMap;

	public class Agenda {

	    private HashMap<String, Contacto> contactos;

	    public Agenda() {
	        contactos = new HashMap<>();
	    }

	   
	    public boolean agregarContacto(Contacto c) {
	        if (contactos.containsKey(c.getNombre())) {
	            return false; 
	        }

	        contactos.put(c.getNombre(), c);
	        return true;
	    }
	    public void eliminarContacto(String nombre) {
	        contactos.remove(nombre);
	    }

	    public void modificarContacto(String nombre, Contacto nuevo) {
	        contactos.put(nombre, nuevo);
	    }

	    public Contacto buscarContacto(String nombre) {
	        return contactos.get(nombre);
	    }

	    
	    public void mostrarContactos() {
	        for (Contacto c : contactos.values()) {
	            System.out.println(c);
	            System.out.println("------------------");
	        }
	    }
	}
