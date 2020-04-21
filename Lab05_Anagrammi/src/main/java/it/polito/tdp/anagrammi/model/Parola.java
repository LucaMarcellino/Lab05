package it.polito.tdp.anagrammi.model;

import java.util.*;

public class Parola {
	
	List<Character> listaCaratteri=new LinkedList<Character>();
	
	public List<Character> getCaratteri(String parola){
		for(int i=0;i<parola.length();i++) {
			char carattere = parola.charAt(i);
			listaCaratteri.add(carattere);
		}
		return listaCaratteri;
	}
	
	public int getSize(List<Character> listaCaratteri) {
		return this.listaCaratteri.size();
	}

}
