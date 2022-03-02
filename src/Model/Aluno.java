package Model;

public class Aluno extends Pessoa {
	
	private EscolariadeDeAlunoEnum Escolaridade;
	private Matricula matricula;

        public Aluno(){
            
        }
        
        public Aluno(Matricula matricula) {
            this.matricula = matricula;
        }

	
	public EscolariadeDeAlunoEnum getEscolaridade() {
		return Escolaridade;
	}

	public void setEscolaridade(EscolariadeDeAlunoEnum escolaridade) {
		Escolaridade = escolaridade;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
	
}
