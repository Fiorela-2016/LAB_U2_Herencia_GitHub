
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Tesis extends Material {
    private String Autor;
    private String Universidad;
    private int AnioPublicacion;
    
    public Tesis (int id, String titulo, String Autor,String Universidad, int AnioPublicacion){
    super(id,titulo);
    this.Autor =Autor;
    this.Universidad =Universidad;
    this.AnioPublicacion = AnioPublicacion;

}
@Override
public void mostrarInfo(){
    System.out.println("Tesis: "+ getTitulo() + "Autor: "+ Autor + "Universidad:" +Universidad + "Año: "+ AnioPublicacion + "Disponible: " + (isDisponible()? "Sí" : "No"));
}
}