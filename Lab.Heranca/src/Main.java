import java.util.Date;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ProdutoEletronico pe = new ProdutoEletronico(3, "0349420");
		System.out.println(pe.getSerialKey());
		System.out.println(pe.getDataCriado());
		System.out.println(pe.getId());
		Produto p = new ProdutoEletronico(2, "84237498732498");
		System.out.println(p.getDataCriado());
		System.out.println(p.getId());

	}
}
