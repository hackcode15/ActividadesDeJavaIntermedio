package clase1;

public class Materia {
	
	private String algoritmoYEstructuraDeDatos, paradigmaDeProgramacion, disenoDeSistemas;
    
    public Materia() {
    	algoritmoYEstructuraDeDatos = "Algoritmos y Estructura de Datos";
    	paradigmaDeProgramacion = "Paradigma de Programacion";
    	disenoDeSistemas = "Diseño de Sistemas";
    }

	public String getAlgoritmoYEstructuraDeDatos() {
		return algoritmoYEstructuraDeDatos;
	}

	public String getParadigmaDeProgramacion() {
		return paradigmaDeProgramacion;
	}

	public String getDisenoDeSistemas() {
		return disenoDeSistemas;
	}
	
}
