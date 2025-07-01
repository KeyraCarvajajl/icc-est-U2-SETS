package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Sets() {
    }

    public Set<String> ConstruirHashSet(){
        Set<String> palabras = new HashSet<>();
        // El set permite q no hayan elementos duplicados
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        return palabras;
    }

    public Set<String> ConstruirLinkedList(){
        Set<String> palabrasLinkeadas = new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");

        return palabrasLinkeadas;
    }

    public Set<String> ConstruirTreeSet(){
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConcomparador(){

        Comparator<String> comparadorLongitud = new Comparator<String>(){

            @Override
            public int compare(String s1, String s2){

                //Comparamos la longitud 
                int result = Integer.compare(s1.length(), s2.length());

                // Si tienen la misma longitud, comparamos alfabéticamente 
                if(result == 0){
                    return s1.compareTo(s2);
                }
                return result;
            }
        };
        
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");

        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparadorDescendente() {

    Comparator<String> comparadorDesc = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            
            // Comparamos longitud de mayor a menor
            int result = Integer.compare(s2.length(), s1.length());

            // Si la longitud es igual, ordenamos alfabéticamente de Z a A
            if (result == 0) {
                return s2.compareTo(s1); // Alfabético inverso
            }
            return result;
        }
    };

    Set<String> miTreeSet = new TreeSet<>(comparadorDesc);

    // Agregamos los datos
    miTreeSet.add("Laptop");
    miTreeSet.add("Manzana");
    miTreeSet.add("Pera");
    miTreeSet.add("Celular");
    miTreeSet.add("Laptop");
    miTreeSet.add("Pera");
    miTreeSet.add("Laptop");
    miTreeSet.add("Celulas");

    return miTreeSet;
}

}