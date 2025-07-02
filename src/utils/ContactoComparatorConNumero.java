package utils;

import models.Contacto;
import java.util.Comparator;

public class ContactoComparatorConNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        // 1. Comparar por apellido
        int cmpApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (cmpApellido != 0) return cmpApellido;

        // 2. Si los apellidos son iguales, comparar por nombre
        int cmpNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if (cmpNombre != 0) return cmpNombre;

        // 3. Si nombre y apellido son iguales, comparar por número
        return c1.getTelefono().compareTo(c2.getTelefono());
    }
}
