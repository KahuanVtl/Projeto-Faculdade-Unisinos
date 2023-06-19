public class Alimentacao extends Loja{
     
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeMaximaProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Data alvara: "+this.dataAlvara;
    }

}
