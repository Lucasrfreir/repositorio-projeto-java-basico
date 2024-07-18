package brComDioDesafioDominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate Data;
	
	public double calcularXp() {
		return XP_PADRAO + 20;
	}
	
	public Mentoria() {
	}
	
	public LocalDate getData() {
		return Data;
	}
	public void setData(LocalDate data) {
		Data = data;
	}
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() 
				+ ", descricao=" + getDescricao()
				+ "]";
	}

	
	
}
