package br.aeso.java3.aula2;

public class ProgramaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GalinhaPintadinha gp = new GalinhaPintadinha();
		
		gp.dormir();
		gp.fazerBarulho();
		
		
		gp.setNome("Galinha Pintada");
		System.out.println(gp.toString());
	}

}
