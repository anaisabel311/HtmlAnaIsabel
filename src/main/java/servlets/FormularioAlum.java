package servlets;

public class FormularioAlum {
	
	private String nomAlumno;
	private String apeAlumno;
	private String sexoAlumno;
	private String aFavorita;
	private String desAlumno;
	
// CONSTRUCTORES
	

public FormularioAlum(String nomAlumno, String apeAlumno, String sexoAlumno, String aFavorita, String desAlumno) {
	super();
	this.nomAlumno = nomAlumno;
	this.apeAlumno = apeAlumno;
	this.sexoAlumno = sexoAlumno;
	this.aFavorita = aFavorita;
	this.desAlumno = desAlumno;
}

// GETTERS AND SETTERS

public String getNomAlumno() {
	return nomAlumno;
}

public void setNomAlumno(String nomAlumno) {
	this.nomAlumno = nomAlumno;
}

public String getApeAlumno() {
	return apeAlumno;
}

public void setApeAlumno(String apeAlumno) {
	this.apeAlumno = apeAlumno;
}

public String getSexoAlumno() {
	return sexoAlumno;
}

public void setSexoAlumno(String sexoAlumno) {
	this.sexoAlumno = sexoAlumno;
}

public String getaFavorita() {
	return aFavorita;
}

public void setaFavorita(String aFavorita) {
	this.aFavorita = aFavorita;
}

public String getDesAlumno() {
	return desAlumno;
}

public void setDesAlumno(String desAlumno) {
	this.desAlumno = desAlumno;
}
	
	
	
	

}
