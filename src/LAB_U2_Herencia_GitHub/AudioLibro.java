
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class AudioLibro extends Material {
    private String Narrador;
    private int DuracionMinutos;
    
public AudioLibro (int id, String titulo, String Narrador, int DuracionMinutos){
    super (id,titulo);
    this.Narrador = Narrador;
    this.DuracionMinutos = DuracionMinutos;
}

@Override

public void mostrarInfo (){
    System.out.println("Audio Libro: "+ getTitulo() + "Narrador: "+ Narrador + "Duración:" +DuracionMinutos + "Disponible: " + (isDisponible()? "Sí" : "No"));
}
}


