package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class ContactoController {

    public ContactoController() {
    }

    public void runTreeContacto() {
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));  
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));  

        System.out.println("\n------- CONTACTOS --------");
        System.out.println("Orden: Apellido - Nombre");
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }

    public void runTreeContactoComparator() {
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparatorConNumero());

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789")); 
        contactos.add(new Contacto("Pedro", "Lopez", "222222222")); 

        System.out.println("\n------- CONTACTOS --------");
        System.out.println("Orden: Apellido - Nombre - Teléfono");
        for (Contacto c : contactos) {
            System.out.println(c);
        }
    }
}
