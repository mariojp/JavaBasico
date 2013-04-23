import java.util.Date;

public abstract class Produto {
	
	private Date dataCriado;
	private int id;

	public Produto() {
		this.dataCriado = new Date();
		this.id = 0;
	}

	public Produto(int id, Date dataCriacao) {
		this.dataCriado = dataCriacao;
		this.id = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataCriado() {
		return dataCriado;
	}

	public void setDataCriado(Date dataCriado) {
		this.dataCriado = dataCriado;
	}
	
	
	public abstract String Categoria();


}
