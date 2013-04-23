import java.util.Date;

public class ProdutoEletronico extends Produto {

	private String serialKey;

	public ProdutoEletronico() {
	}

	public ProdutoEletronico(int id, String serial) {
		super(id, new Date());
		this.serialKey = serial;
	}

	@Override
	public int getId() {
		return -super.getId();
	}

	public String getSerialKey() {
		return serialKey;
	}

	public void setSerialKey(String serialKey) {
		this.serialKey = serialKey;
	}

	@Override
	public String Categoria() {
		return "Produto Eletronico";
	}

}
