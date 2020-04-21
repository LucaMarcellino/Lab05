package it.polito.tdp.anagrammi.model;

import java.util.*;

import it.polito.tdp.anagrammi.DAO.AnagrammaDAO;

public class Model {
	
	Map<String,Boolean> mappaParole= new LinkedHashMap<String,Boolean>();
	Ricerca ris= new Ricerca();
	AnagrammaDAO ado= new AnagrammaDAO();
	List<String> listaAnagrammi=new LinkedList<String>();
	boolean trovato=false;
	
	public Map<String,Boolean> getMap(String parola){
		
		
		listaAnagrammi=ris.anagrammi(parola);
		
		
		for(int i=0;i<listaAnagrammi.size();i++) {
			String anagramma= listaAnagrammi.get(i);
			trovato = ado.isCorrect(anagramma);
			mappaParole.put(anagramma, trovato);
		}
		
		
		
		return mappaParole;
	}

	public boolean isCorrect(String parola) {
		return ado.isCorrect(parola);
	}
	
}
