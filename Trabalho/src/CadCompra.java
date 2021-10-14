import java.util.ArrayList;
import java.util.Calendar;

public class CadCompra implements Ordenacao, vetor {
	private ArrayList<Compra> vetCompra;

	public CadCompra(ArrayList<Compra> vetCompra) {
		super();
		this.vetCompra = vetCompra;
	}

//	public ArrayList<Compra> getVetCompra() {
//		return vetCompra;
//	}

//	public void setVetCompra(ArrayList<Compra> vetCompra) {
//		this.vetCompra = vetCompra;
//	}

//	@Override
//	public String toString() {
//		return "CadCompra [vetCompra=" + vetCompra + "]";
//	}

	@Override
	public Compra get(Integer pos) {
		// TODO Auto-generated method stub
		if (!this.vetCompra.isEmpty()) {
			if (this.vetCompra.size() > pos) {
				return this.vetCompra.get(pos);

			}
		}
		return null;
	}

	@Override
	public void insere(Compra compra) {
		// TODO Auto-generated method stub
		this.vetCompra.add(compra);
	}

	@Override
	public void remove(String cpf, Calendar data) {
		// TODO Auto-generated method stub
		if (!this.vetCompra.isEmpty()) {
			Integer cont = this.vetCompra.size();
			for (Compra compra : this.vetCompra) {
				if (compra.getCliente().getCpf() == cpf && compra.getData() == data) {
					this.vetCompra.remove(cont);
				}
				cont--;
			}
		}
	}

	@Override
	public void insercaoDireta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quickSort() {
		// TODO Auto-generated method stub

	}

	@Override
	public void quickComInsercao() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shellSort() {
		// TODO Auto-generated method stub

	}

}
