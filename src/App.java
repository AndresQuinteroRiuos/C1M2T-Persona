


public class App {
    public static void main(String[] args) {
        // Instanciar
        Persona personaDocente = new Persona("Darwin", 32);
        Persona personaEstudiante = new Persona("Cristian", 22);

        personaDocente.mostrarInformacion("Hola");
        String mensajeInformacion = personaDocente.DevolverInformacion();
        System.out.println(mensajeInformacion);

        personaEstudiante.mostrarInformacion("Hola");
        mensajeInformacion = personaEstudiante.DevolverInformacion();
        System.out.println(mensajeInformacion);
    }
}
