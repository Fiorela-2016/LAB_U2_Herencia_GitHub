
package LAB_U2_Herencia_GitHub;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Libro extends Material {
private String Autor;
private int CantidadPaginas;
private Genero genero;

public Libro (int id,String titulo, String Autor, int CantidadPaginas,Genero genero){
    super (id,titulo);
    this.Autor = Autor;
    this.CantidadPaginas = CantidadPaginas;
    this.genero = genero;
}
        
@Override
public void mostrarInfo (){
System.out.println("Libro: "+ getTitulo() + "Autor: "+ Autor + "Páginas:" +CantidadPaginas + "Género: "+ genero + "Disponible: " + (isDisponible()? "Sí" : "No"));
}
}

