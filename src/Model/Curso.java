package Model;

public class Curso {
	private String nome;
	private String cargaHoraria;
	private AreaCurso areacurso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public AreaCurso getAreacurso() {
		return areacurso;
	}
	public void setAreacursomodel(AreaCurso areacurso) {
		this.areacurso = areacurso;
	}
	
	
}
