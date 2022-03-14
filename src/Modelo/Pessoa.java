package Modelo;

import java.util.Date;

public abstract class Pessoa {
    
    private Integer id;
    private String nome;
    private String mae;
    private String sexo;
    private Date nascimento;
    private String email;
    private String rua;
    private String bairro;
    private Integer numero;
    private Cidade cidade;
    private EstadoCivilEnum estadocivilenum;
    private TelefonesPessoa telefonespessoa;
    

        public Integer getId() {
            return id;
        }
        public void setId(Integer id) {
            this.id = id;
        }
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

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public Cidade getCidade() {
            return cidade;
        }

        public void setCidade(Cidade cidade) {
            this.cidade = cidade;
        }

        public Integer getNumero() {
            return numero;
        }

        public void setNumero(Integer numero) {
            this.numero = numero;
        }
        
	public TelefonesPessoa getTelefonespessoa() {
		return telefonespessoa;
	}
	public void setTelefonespessoa(TelefonesPessoa telefonespessoa) {
		this.telefonespessoa = telefonespessoa;
	}
	public EstadoCivilEnum getEstadocivilenum() {
		return estadocivilenum;
	}
	public void setEstadocivilenum(EstadoCivilEnum estadocivilenum) {
		this.estadocivilenum = estadocivilenum;
	}
	  
}
