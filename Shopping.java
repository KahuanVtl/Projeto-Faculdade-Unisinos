import java.text.Normalizer;

public class Shopping {
     
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
        this.nome = nome;
    }

    //GETTERS

    public Endereco getEndereco() {
        return endereco;
    }
    
    public Loja[] getLojas() {
        return lojas;
    }

    public String getNome() {
        return nome;
    }

    //SETTERS

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //MÉTODOS

    public boolean insereLoja(Loja loja){
        for(int i = 0; i < lojas.length; i++){
            if (lojas[i] == null){
                lojas[i] = loja;
                System.out.println("Loja inserida!");
                return true;
        }}
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                System.out.println("Loja Excluida!");
                return true;
            }} 
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;
        String tipoNormalizado = Normalizer.normalize(tipoLoja, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
   
        for (Loja loja : lojas) {
            if (loja != null) {
                String tipoLojaAtual = loja.getClass().getSimpleName();
                String tipoLojaAtualNormalizado = Normalizer.normalize(tipoLojaAtual, Normalizer.Form.NFD)
                        .replaceAll("\\p{M}", "");
   
                if (tipoLojaAtualNormalizado.equalsIgnoreCase(tipoNormalizado)) {
                    quantidade++;
                }
            }
        }
   
        return quantidade;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorValorSeguro = 0.0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                double valorSeguro = informatica.getSeguroEletronicos();
                if (valorSeguro > maiorValorSeguro) {
                    maiorValorSeguro = valorSeguro;
                    lojaMaisCara = informatica;
                }
            }
        }
        return lojaMaisCara;
    }
    
    

    @Override
    public String toString() {
        return "Nome: "+getNome()+"\n"+"Endereço: "+getEndereco();
    }
}
