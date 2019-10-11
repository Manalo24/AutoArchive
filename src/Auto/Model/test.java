package Auto.Model;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivio arc = new Archivio();
		arc.addAuto("aaaerrari", "2", "100", "damn");
		arc.addAuto("fiat", "3", "321", "dadada");
		arc.addAuto("alfa", "3", "321", "dadada");
	
		arc.stampa();
		System.out.println("cerca auto Fiat");
		arc.searchAuto("fiat");
		System.out.println("ORDINARE");
		arc.ordineAuto();
		System.out.println("DELETE");
		arc.deleteAuto("alfa");
		arc.stampa();
	}

}
