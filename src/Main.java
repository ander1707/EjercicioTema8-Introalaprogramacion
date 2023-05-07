     /*
        1.Crear clase Persona.
        2.Crear variables las privadas edad, nombre y telefono de la clase Persona.
        3.Crear gets y sets de cada propiedad.
        4.Crear un objeto persona en el main.
        5.Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
*/
public class Main {
    public static void main(String[] args) {
        persona Persona = new persona();
        Persona.setNombre("Anderson Moreno");
        System.out.println("Mi Nombre es: "+ Persona.getNombre());
        Persona.setEdad(39);
        System.out.println("Tengo " + Persona.getEdad()+" Años");
        Persona.setTelefono("300567890");
        System.out.println("Mi telefono es: "+Persona.getTelefono());
        }
    }




