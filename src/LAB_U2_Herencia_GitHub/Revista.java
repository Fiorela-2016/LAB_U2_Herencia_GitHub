
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Revista extends Material{
    private int numeroEdicion;
    private String mesPublicacion;
    
    public Revista (int id,String titulo, int numeroEdicion, String mesPublicacion){
        super (id,titulo);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

@Override
public void mostrarInfo (){
    System.out.println("Revista: "+ getTitulo() +        "Edición:" +numeroEdicion + "Mes: "+               mesPublicacion + "Disponible: " +                (isDisponible()? "Sí" : "No"));
}
}
