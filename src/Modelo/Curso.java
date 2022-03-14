package Modelo;

public class Curso {
    
        private Integer id;
	private String nome;
	private Integer cargaHoraria;
	private AreaCurso areacurso;

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
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public AreaCurso getAreacurso() {
		return areacurso;
	}
	public void setAreacursomodel(AreaCurso areacurso) {
		this.areacurso = areacurso;
	}
	
        
	
}
