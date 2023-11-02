package clase1;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Inscripciones{
	
	private String nombre;
	private List<String> inscribirse;
	private List<String> materiasAprobadas;
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		this.inscribirse = new ArrayList<>();
		this.materiasAprobadas = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public void inscribirseAMaterias(String materia) {
		inscribirse.add(materia);
	}
	
	@Override
	public boolean aprobadas(String materia) {
		if(materiasAprobadas.contains(materia)) {
			return true;
		}
		return false;
	}
	
	public void ingresarMateriaAprobada(String materia) {
		materiasAprobadas.add(materia);
	}
	
	@Override
	public void verMateriasAprobadas(){
		for(String materiasQueAprobo : materiasAprobadas) {
			System.out.println("Estas son las materias que ya aprobaste: ");
			System.out.println("• " + materiasQueAprobo);
		}
	}

	@Override
	void verMateriasInscritas() {
		for(String materiasQueSeInscribio : inscribirse) {
			System.out.println("Inscripcion a: " + materiasQueSeInscribio);
		}
		
	}
	
}
