import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Taxas implements Iterable<Double> {

	private List<Double> taxas = new ArrayList<Double>();

	public Taxas() {
		getTaxas().add(15.4);
		getTaxas().add(5.3);
		getTaxas().add(20.3);
	}

	public List<Double> getTaxas() {
		return taxas;
	}

	public void setTaxas(List<Double> taxas) {
		this.taxas = taxas;
	}

	@Override
	public Iterator<Double> iterator() {
		return taxas.iterator();
	}

}
