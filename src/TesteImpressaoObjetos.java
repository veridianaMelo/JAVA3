
public class TesteImpressaoObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Veridiana");
		pessoaFisica.setCpf("03324034400044");
		pessoaFisica.setBairro("Salgadinho");
		pessoaFisica.setCidade("Olinda");
		
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("Negocios online");
		pessoaJuridica.setCnpj("10789000101");
		pessoaJuridica.setBairro("Salgadinho");
		pessoaJuridica.setCidade("Olinda");
		
		
		System.out.println(pessoaFisica.formatarDocumento());
		System.out.println(pessoaJuridica.formatarDocumento());
	}

}
