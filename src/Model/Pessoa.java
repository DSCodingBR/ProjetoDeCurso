package Model;

import java.util.Date;

public class Pessoa {
	
    private String nome;
    private String mae;
    private String sexo;
    private Date nascimento;
    private String email;
    private EstadoCivilEnum estadocivilenum;
    private TelefonesPessoa telefonespessoa;
    private EnderecoPessoa enderecopessoa;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public TelefonesPessoa getTelefonespessoa() {
		return telefonespessoa;
	}
	public void setTelefonespessoa(TelefonesPessoa telefonespessoa) {
		this.telefonespessoa = telefonespessoa;
	}
	
	public EnderecoPessoa getEnderecopessoa() {
		return enderecopessoa;
	}
	public void setEnderecopessoa(EnderecoPessoa enderecopessoa) {
		this.enderecopessoa = enderecopessoa;
	}
	public EstadoCivilEnum getEstadocivilenum() {
		return estadocivilenum;
	}
	public void setEstadocivilenum(EstadoCivilEnum estadocivilenum) {
		this.estadocivilenum = estadocivilenum;
	}
	
	
	
    
}
