package Auto.Model;


import java.util.*;

import AutoMobile.AutoController;







public class Archivio {
	private List <Auto> ArchivioAuto;
	private List <Auto> srcAuto=new  ArrayList<Auto>();
	private List <Auto> autoCanc=new  ArrayList<Auto>();

	private List <String> words = new ArrayList<String>();
	public Archivio() {
		
		ArchivioAuto=new  ArrayList<Auto>();
	}
	public void addAuto(String targa, String km, String anno, String prezzo) {
		ArchivioAuto.add(new Auto(targa,km,anno,prezzo));
		
		
	}
	public List <Auto> getArchivio(){
		return ArchivioAuto;
	}
	public List <Auto> getArchivio2(){
		return autoCanc;
	}
	public List <String> getOrdine(){
		return words;
	}
	public String searchAuto(String targa) {
		srcAuto.clear();
		for(int i = 0;i<ArchivioAuto.size();i++) {
			if(ArchivioAuto.get(i).getTarga().equalsIgnoreCase(targa)) {
				Auto a = ArchivioAuto.get(i);
				String result = a.toString();
				return result;
				
			}
		}
		return null;	
	}
	public void modificaAuto(String targa) {
		for(int i = 0;i<ArchivioAuto.size();i++) {
			if(ArchivioAuto.get(i).getTarga().equalsIgnoreCase(targa)) {
				Auto a = ArchivioAuto.get(i);
			}
		}
		
	}
	public void deleteAuto(String targa) {
		for (int i =0;i<ArchivioAuto.size();i++) {
			if (targa.equalsIgnoreCase(ArchivioAuto.get(i).getTarga())) {
				autoCanc.add(ArchivioAuto.get(i));
				ArchivioAuto.remove(i);
			}
		}
		/*Iterator<Auto> i=ArchivioAuto.iterator();
		
	    while (i.hasNext()) {
	    	
	    	if (targa.equalsIgnoreCase(i.next().getTarga())) {
	    		
	    		i.remove();
	    	}
	    }*/
	}
	public void ordineAuto() {
		Collections.sort(ArchivioAuto);
		/*for(int i = 0 ; i<ArchivioAuto.size();i++) {
			words.add(ArchivioAuto.get(i).toString());
			
			
			
		}
		Collections.sort(words);
		Iterator<String> i=words.iterator();
	    while (i.hasNext()) {
	    	System.out.println(i.next());
	    }*/
	}
		
	public void stampa( ) {
		Iterator<Auto> i=ArchivioAuto.iterator();
	    while (i.hasNext()) {
	    	System.out.println(i.next());
	    }
	}
	public void stampaCanc( ) {
		Iterator<Auto> i=autoCanc.iterator();
	    while (i.hasNext()) {
	    	System.out.println(i.next());
	    }
	}
	public void clear() {
		autoCanc.clear();
	}
	
	
}


