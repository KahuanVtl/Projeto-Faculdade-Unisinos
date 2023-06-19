public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    //MÉTODO CONSTRUTOR 
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    //GETTERS 
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    //SETTERS 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    //MÉTODOS
    public boolean estaVencido(Data dataAtual) {

        if (dataAtual.getAno() > dataValidade.getAno()){
            return true;
        } else if(dataAtual.getAno() < dataValidade.getAno()){
            return false;
        
        } else if (dataAtual.getMes() > dataValidade.getMes()){
            return true;
        } else if (dataAtual.getMes() < dataValidade.getMes()){
            return false;
        } 

        else if (dataAtual.getDia() > dataValidade.getDia()){
            return true;
        } else {
            return false;
        }
       
    }


    //ToString()
    @Override
    public String toString() {
        return "Nome do produto: " + this.nome+ " "+ "preço: "+this.preco;
    }

}
