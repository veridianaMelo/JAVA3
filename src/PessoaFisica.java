import java.util.regex.Pattern;

public class PessoaFisica {
	
	private String nome;
	private String cpf;
	private String endereco;
	private String bairro;
	private String cidade;
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	
	
	public String toString() {
		return "PessoaFisica [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", bairro=" + bairro
				+ ", cidade=" + cidade + "]";
	}
	
	
	public String getCpf(){
		return cpf;
	}
	
//	public static String formatando(String cpf1){
//		String cpf11 = "88888888888";
//		String bloco1 = cpf11.substring(0, 3);
//		String bloco2 = cpf11.substring(3, 6);
//		String bloco3 = cpf11.substring(6, 9);
//		String bloco4 = cpf11.substring(9, 11);
//		cpf11 = String.format("%s.%s.%s-%s", bloco1, bloco2, bloco3, bloco4);
//		System.out.println(cpf11);
//		return cpf11;		
//		
//	}
	
	
//	public static String formatCPF(String cpf) {
//		Pattern pattern = Pattern.compile("(\d{3})(\d{3})(\d{3})(\d{2})");
//		Matcher matcher = pattern.matcher(cpf);
//		if (matcher.matches()) 
//			cpf = matcher.replaceAll("$1.$2.$3-$4");
//		return cpf;		
//	}
	
	public String getDocumento(){
		return cpf;
	}
	
	public String formatarDocumento() {
		return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "." + cpf.substring(9, 11);
	}

}
