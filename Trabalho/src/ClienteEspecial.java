public class ClienteEspecial extends Cliente {
    private Double valeCompra;

    public ClienteEspecial(String nome, String cpf, Double valeCompra) {
        super(nome, cpf);
        this.valeCompra = valeCompra;
    }

    public Double getValeCompra() {
        return valeCompra;
    }

    public void setValeCompra(Double valeCompra) {
        this.valeCompra = valeCompra;
    }

    @Override
    public String toString() {
        return "ClienteEspecial [valeCompra=" + valeCompra + "]";
    }

}
