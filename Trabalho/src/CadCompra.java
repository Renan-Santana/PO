import java.util.ArrayList;

public class CadCompra {
	private ArrayList<Compra> vetCompra;

	public CadCompra(ArrayList<Compra> vetCompra) {
		super();
		this.vetCompra = vetCompra;
	}

	public ArrayList<Compra> getVetCompra() {
		return vetCompra;
	}

	public void setVetCompra(ArrayList<Compra> vetCompra) {
		this.vetCompra = vetCompra;
	}

	@Override
	public String toString() {
		return "CadCompra [vetCompra=" + vetCompra + "]";
	}
	
	
}
