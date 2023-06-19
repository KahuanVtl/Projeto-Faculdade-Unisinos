public class Data{
    private int dia;
    private int mes;
    private int ano;

    //Método Construtor Data + Verificador Bissexto + Data válida
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if(!validaData()){
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

    }

    //Método Valida Data

    private boolean validaData(){
        if (ano < 1){
            return false;

        } else if (mes < 1 || mes > 12){
            return false;

        } else if (mes == 2){
            if(verificaAnoBissexto()){
                if (dia < 1 || dia > 29) return false;
            } else {
                if (dia < 1 || dia > 28) return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if (dia < 1 || dia > 30) return false;

        } else {
            if (dia < 1 || dia > 31) return false;
        }

        return true;
    }
 
    //GETTERS
    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    //SETTERS 

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    //ToString()
    @Override
    public String toString() {
        return this.dia+"/"+this.mes+"/"+this.ano;
    }

    //Método Bissexto()
    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0)|| ano % 400 == 0){
            return true;
        } else {
            return false;
        }
    }

}
