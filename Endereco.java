public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;


    //Método Construtor
    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String cep, String numero, String complemento){
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.pais = pais;
    }

    //GETTERS 

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public String getNumero() {
        return numero;
    }  

    public String getPais() {
        return pais;
    }

    //SETTERS 

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //ToString

    @Override
    public String toString() {
        return "Pais: "+this.pais+ "\n"+"Estado: "+this.estado+"\n"+"Cidade:"+this.cidade+"\n"+"Nome da rua: "+
        this.nomeDaRua+"\n"+"Numero: "+this.numero+"\n"+"Complemento: "+this.complemento+"\n"+"CEP: "+this.cep;
    }

}
