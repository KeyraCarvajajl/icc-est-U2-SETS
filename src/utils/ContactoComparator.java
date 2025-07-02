package utils;

import models.Contacto;
import java.util.Comparator;

public class ContactoComparator implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Primero el apellido en orden alfabético
        int apellidoCompare = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (apellidoCompare != 0) {
            return apellidoCompare;
        }

        // Si los apellidos son iguales, comparar por nombre
        return c1.getNombre().compareToIgnoreCase(c2.getNombre());
    }
}
