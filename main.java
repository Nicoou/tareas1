public class main{

    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setEdad("edad");

        persona.edad="edad";

        String edad = persona.getEdad();
        System.out.println(18);

        persona.setNombre("nombre");

        persona.nombre="nombre";

        String nombre = persona.getNombre();
        System.out.println("Juan");

        persona.setTelefono("telefono");

        persona.telefono="telefono";

        String telefono = persona.getTelefono();
        System.out.println( 12365414 );
    }
    public static class Persona {
        private String edad;
        private String nombre;
        private String telefono;

        public void setEdad(String edad) {
            this.edad = edad;
        }
        public String getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
        public String getTelefono(){
            return this.telefono;
        }
    }
}
