package Model;

public class Turma {
	
	private String horaInicio;
	private String horaFinal;
	private String dataInicio;
	private String dataFinal;
	private Curso curso;
	
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public Curso getCursomodel() {
		return curso;
	}
	public void setCursomodel(Curso curso) {
		this.curso = curso;
	}
	
	
	
}
