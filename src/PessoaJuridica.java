
public class PessoaJuridica {

	
	private String nome;
	private String cnpj;
	private String ie;
	private String endereco;
	private String bairro;
	private String cidade;
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
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

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [nome=" + nome + ", cnpj=" + cnpj + ", ie=" + ie + ", endereco=" + endereco + ", bairro="
				+ bairro + ", cidade=" + cidade + "]";
	}
	
	public String getCnpj(){
		return cnpj;
	}
	
	public String formatarDocumento() {
		return cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 9) + "/" + cnpj.substring(9, 11);
	}

	
	
	
}
