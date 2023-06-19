public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Produto importado: " + this.produtosImportados;
    }
}
