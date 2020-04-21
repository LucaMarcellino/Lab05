package it.polito.tdp.anagrammi.model;

import java.util.*;



public class Ricerca {
	
	List<String> listaAnagrammiC;
	List<String> listaAnagrammiE;
	List<String> listaAnagrammi;
	List<Character> caratteriDisp=new LinkedList<Character>();
	
	public List<String> anagrammi(String parola){
		this.listaAnagrammi=new LinkedList<String>();
		caratteriDisp=this.getCaratteri(parola);
		int livello=0;
		String parziale="";
		this.ricorsiva(livello, caratteriDisp,parziale);
		
		
		return listaAnagrammi;
		
	}
	
	public List<Character> getCaratteri(String parola){
		for(int i=0;i<parola.length();i++) {
			char carattere = parola.charAt(i);
			caratteriDisp.add(carattere);
		}
		return caratteriDisp;
	}
	
	
	private void ricorsiva(int livello,List<Character> caratteriDisp,String parziale) {
		//caso terminale
		
			if(caratteriDisp.size()==0) {
					this.listaAnagrammi.add(parziale);
					
			}
					
			for(Character ch: caratteriDisp) {
						String tentativo=parziale+ch;
						
						List<Character> rimanenti=new LinkedList<Character>(caratteriDisp);
						rimanenti.remove(ch);
						this.ricorsiva(livello+1,rimanenti,tentativo);
						
						
		}

	}
}
				
		
	





