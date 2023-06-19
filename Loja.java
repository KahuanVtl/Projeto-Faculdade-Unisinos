public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Data dataFundacao;
    private Endereco endereco;
    private Produto[] EstoqueProdutos;
    private int quantidadeMaximaProdutos;
    

    // Construtores 
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
        this.quantidadeMaximaProdutos = quantidadeMaximaProdutos;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.EstoqueProdutos = new Produto[quantidadeMaximaProdutos];
        this.quantidadeMaximaProdutos = quantidadeMaximaProdutos;
    }


    // GET MÉTODOS 
    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario -1;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Produto[] getEstoqueProdutos() {
        return EstoqueProdutos;
    }

    public int getQuantidadeMaximaLojas() {
        return quantidadeMaximaProdutos;
    }

    // SET MÉTODOS 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.EstoqueProdutos = estoqueProdutos;
    }

    public void setQuantidadeMaximaLojas(int quantidadeMaximaProdutos) {
        this.quantidadeMaximaProdutos = quantidadeMaximaProdutos;
    }


    //MÉTODOS 
    
    public void imprimeProdutos() {
        System.out.println("Produtos em estoque:");
        if (EstoqueProdutos.length == 0) {
            System.out.println("Não há produtos no estoque!");
        } else {
            for (Produto produto : EstoqueProdutos) {
                if (produto != null) {
                    System.out.println(produto.toString());
                }
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < EstoqueProdutos.length; i++) {
            if (EstoqueProdutos[i] == null) {
                EstoqueProdutos[i] = produto;
                return true;
            }
        }
        System.out.println("Estoque Cheio!");
        return false;
    }
    

    public boolean removeProduto(String produto){
        for(int i = 0; i < EstoqueProdutos.length; i++ ){
            if (EstoqueProdutos[i] != null && EstoqueProdutos[i].getNome().equals(produto)){
                EstoqueProdutos[i] = null;
                System.out.println("Produto excluído com sucesso!");
                return true;
            }
        }
        System.out.println("Produto não encontrado!");
        return false;
    }

    public double gastosComSalario(){
       
        if (salarioBaseFuncionario >= 1){
            return quantidadeFuncionarios * salarioBaseFuncionario;
        } else {
            System.out.println("Salário invalido");
            return salarioBaseFuncionario -1;
        }
    }

    public char tamanhoDaLoja(){

        if (quantidadeFuncionarios < 10){
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';
        } else if (quantidadeFuncionarios > 30){
            return 'G';
        } else {
            return 'N';
        }
    }

    //ToString()
    @Override
    public String toString() {
        return "Nome: "+this.nome+"\n"+"Quantidade De Funcionarios: "+this.quantidadeFuncionarios+"\n"+"Salario Base dos Funcionarios: "+this.salarioBaseFuncionario+"\n"+this.endereco+"\n"+"Data de Fundação: "+this.dataFundacao+"\n"+"Quantidade Estoque: "+this.quantidadeMaximaProdutos;

}
}
