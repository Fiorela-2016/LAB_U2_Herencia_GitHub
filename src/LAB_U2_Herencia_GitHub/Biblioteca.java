/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_U2_Herencia_GitHub;

import java.util.ArrayList;

/**
 *
 * @author Geirel
 */
public class Biblioteca {
        private ArrayList <Material> ArrayList;
    
    //Constructor
    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    //Agregar materiales
    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    //Listar todos los materiales
    public void listarMateriales() {
        for (Material material : materiales) {
            System.out.println(material);
        }

    }

    //Buscar por ID
    public Material buscarPorId(int id) {
        for (Material material : materiales) {
            if (material.getId() == id) {
                return material;
            }
        }
        return null;
    }
    
    //Poder buscar por título
    public Material buscarPorTitulo(String titulo) {

        for (Material material : materiales) {

            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }
    
    // Prestar material
    public void prestarMaterial(int id) {
        Material material = buscarPorId(id);
        if (material != null) {
            material.prestar();
        } else {
            System.out.println("Material no encontrado.");
        }
    }

    //Devolver material
    public void devolverMaterial(int id) {
        Material material = buscarPorId(id);
        if (material != null) {
            material.devolver();
        } else {
            System.out.println("Material no encontrado.");
        }
    }

    //Mostrar cantidad total de materiales
    public void mostrarTotalMateriales() {
        System.out.println("Total de materiales: " + Material.getTotalMateriales());
    }
}
