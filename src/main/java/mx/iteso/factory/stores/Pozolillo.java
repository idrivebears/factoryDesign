package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;


public class Pozolillo extends PozoleStore {

	@Override
	protected Pozole createPozole(String meat) {
		if (meat.equals("pollo"))
            return new PozolilloPollo();
		else
			return null;
	}

}