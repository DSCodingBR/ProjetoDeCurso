package Modelo;

public class Matricula {
	private Integer id_matricula;
        private Aluno aluno;

        public Integer getId_matricula() {
            return id_matricula;
        }
        public void setId_matricula(Integer id_matricula) {
            this.id_matricula = id_matricula;
        }

        public Aluno getAluno() {
        return aluno;
        }
        public void setAluno(Aluno aluno) {
        this.aluno = aluno;
        }
	
}
