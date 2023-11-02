package clase1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombreAlumno = sc.nextLine();

        Alumno alumno1 = new Alumno(nombreAlumno);
        Materia materia = new Materia();
        
        
        
        System.out.println("Hola, " + alumno1.getNombre() + ". BIENVENIDO ¡¡¡");
        System.out.println("Quieres empezar con la Programacion¡¡ Inscribete a \"Algoritmos y Estructura de Datos\"");
        System.out.println("Si ya formas parte del instituto inscribete a nuevas materias");
        System.out.println("1) Quiero empezar \n2) Quiero inscribirme a nuevas materias");
        int respuesta = sc.nextInt();
        if(respuesta==1) {
        	System.out.println("Gracias por ser parte de nosotros!!!");
        	System.out.println("Inscripción a Algoritmo y Estructura de Datos exitosa.");
            alumno1.inscribirseAMaterias(materia.getAlgoritmoYEstructuraDeDatos());
        }else if(respuesta==2) {
        	System.out.println("Materias disponibles: [Paradigmas de Programacion] y [Diseño de Sistemas]");
        	System.out.println("Hola, " + alumno1.getNombre() + " RECUERDA QUE:");
        	System.out.println("Para la inscripcion a \"Paradigmas de Programacion\" debes tener aprobado \"Algoritmos y Estructura de Datos\"");
        	System.out.println("Para la inscripcion a \"Diseño de Sistemas\" debes tener aprobados \"Algoritmos y Estructura de Datos\" y \"Paradigma de Programacion\"");
        	System.out.println("Por favor, indícame qué materias ya tienes aprobadas.");
        	
        	String respuestaSeguir;
            
            do {
            	
                System.out.println("1) Algoritmo y Estructura de Datos \n2) Paradigma de Programación");
                
                int respuestaMateriasAprobadas = sc.nextInt();
                
                if(respuestaMateriasAprobadas == 1) {
                	alumno1.ingresarMateriaAprobada(materia.getAlgoritmoYEstructuraDeDatos());
                }else if(respuestaMateriasAprobadas == 2) {
                	alumno1.ingresarMateriaAprobada(materia.getParadigmaDeProgramacion());
                	
                }else {
                	System.out.println("Opcion incorrecta");
                }
                System.out.print("Tienes otro materia aprobada?(si/no): ");
            	respuestaSeguir = sc.next().toLowerCase();
            }while(respuestaSeguir.equals("si"));
            
            System.out.println("Muy bien, " + alumno1.getNombre() + ". ¿En qué materia deseas inscribirte?");

            System.out.println("1) Paradigma de Programación\n2) Diseño de Sistemas");
            
            int respuestaMateriaAInscribir = sc.nextInt();

            switch (respuestaMateriaAInscribir) {
                case 1:
                    if (alumno1.aprobadas(materia.getAlgoritmoYEstructuraDeDatos())) {
                    	System.out.println("Inscripción a Paradigma de Programación exitosa.");
                        alumno1.inscribirseAMaterias(materia.getParadigmaDeProgramacion());
                    } else {
                        System.out.println("No cumples con los requisitos mínimos.");
                    }
                    break;
                case 2:
                    if (alumno1.aprobadas(materia.getAlgoritmoYEstructuraDeDatos()) && alumno1.aprobadas(materia.getParadigmaDeProgramacion())) {
                    	System.out.println("Inscripción a Diseño de Sistemas exitosa.");
                        alumno1.inscribirseAMaterias(materia.getDisenoDeSistemas());
                    } else {
                        System.out.println("No cumples con los requisitos mínimos.");
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        	
        }
        
        System.out.print("¿Quiero ver tu inscripcion y tus materias aprobadas?(si/no): ");
        String respuestaVerInscripcionVerAprobadas = sc.next().toLowerCase();
        if(respuestaVerInscripcionVerAprobadas.equals("si")) {
        	System.out.println("--------------------------------------------");
        	System.out.println("Materia inscrita");
        	alumno1.verMateriasInscritas();
        	System.out.println("--------------------------------------------");
        	System.out.println("Materias aprobadas");
        	alumno1.verMateriasAprobadas();
        	System.out.println("--------------------------------------------");
        }else {
        	System.out.println("Fin del Programa");
        	System.exit(0);
        }
        sc.close();

	}

}
