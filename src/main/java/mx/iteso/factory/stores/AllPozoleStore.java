package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class AllPozoleStore {

    public static Pozole createPozole(String type, String meat) {
        if (type.equalsIgnoreCase("Blanco"))
            return (new PozoleBlancoStore().createPozole(meat));
        else if (type.equalsIgnoreCase("Rojo"))
            return (new PozoleRojoStore().createPozole(meat));
        else if (type.equalsIgnoreCase("Verde"))
            return (new PozoleVerdeStore().createPozole(meat));
        else if (type.equalsIgnoreCase("Pozolillo"))
            return (new Pozolillo().createPozole(meat));
        else if (type.equalsIgnoreCase("Menudo"))
            return (new MenudoStore().createPozole(meat));
        else return null;
    }
}
