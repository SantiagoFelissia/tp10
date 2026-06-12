package Actividad;

public class mostrar{

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contacto c1 = new Contacto("Juan", "223456789");
        c1.agregarCelular("2231111111");
        c1.agregarCelular("2232222222");

        Contacto c2 = new Contacto("María", "223987654");
        c2.agregarCelular("2233333333");

        agenda.agregarContacto(c1);
        agenda.agregarContacto(c2);
        

        System.out.println("Buscar Juan:");
        System.out.println(agenda.buscarContacto("Juan"));

        System.out.println("\nTodos los contactos:");
        agenda.mostrarContactos();
    
}