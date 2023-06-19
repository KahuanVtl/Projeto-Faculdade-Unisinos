// KAHUAN SILVA VITELLI GR96002-00607 PARTE 4 DO PROJETO!

import java.util.Scanner;

public class Principal{

    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);

        System.out.println("Gerenciador de lojas\n");

        Principal.crieMenu();

        System.out.println("Informe o valor desejado");
        int escolha = S.nextInt();

        while(escolha != 3){
            switch(escolha){
                case 1:
                    Loja loja = Principal.criaLoja();
                    loja.toString();
                    System.out.println("Loja Criada\n");
                    System.out.println(loja.toString());
                    break;
                case 2:
                    Produto p = Principal.criaProduto();
                    System.out.println("Produto adicionado ao inventário");
                    System.out.println("Data validade: "+ p.estaVencido(new Data(20,10, 2023)));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção Inexistente");
            }
            if (escolha == 3)
                break;

                Principal.crieMenu();
                escolha = S.nextInt();
            
        }
        
    }

    private static Loja criaLoja(){
        Scanner S = new Scanner(System.in);

        System.out.println("Crie sua loja:");
        System.out.println("Coloque o nome da sua loja:");
        String nome = S.nextLine();
        
        System.out.println("Coloque a quantidade de funcionários:");
        int quantidadeFuncionarios = S.nextInt();

        System.out.println("Coloque o salário base dos funcionários:");
        double salarioBaseFuncionario = S.nextDouble();

        System.out.println("Complemento:");
        String complemento = S.nextLine();

        System.out.println("Cidade:");
        String cidade = S.nextLine();

        System.out.println("Estado:");
        String estado = S.nextLine();

        System.out.println("Pais:");
        String pais = S.nextLine();

        System.out.println("Cep:");
        String cep = S.nextLine();

        System.out.println("Rua: ");
        String nomeDaRua = S.nextLine();

        System.out.println("Número: ");
        String numero = S.nextLine();

        Endereco endereco = new Endereco(complemento, cidade, estado, pais, cep, nomeDaRua, numero);

        System.out.println("Data de fundação:");
        System.out.println("Dia:");
        int dia = S.nextInt();

        System.out.println("Mês:");
        int mes = S.nextInt();
        
        System.out.println("Ano:");
        int ano = S.nextInt();

        Data dataFundacao = new Data(dia, mes, ano);

        System.out.println("Coloque o tamanho do Estoque: ");
        int quantidadeMaximaProdutos = S.nextInt();

        Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);

        return loja;
        

    }

    private static  Produto criaProduto(){

        Scanner S = new Scanner(System.in);

        System.out.println("Criando Produto");
        System.out.println("Coloque o nome do Produto:");
        String nome = S.nextLine();
        System.out.println("Coloque o valor do produto:");
        double valor = S.nextDouble();
        System.out.println("Coloque a data de validade do Produto:");
        System.out.println("Dia:");
        int dia = S.nextInt();
        System.out.println("Mês:");
        int mes = S.nextInt();
        System.out.println("Ano:");
        int ano = S.nextInt();
        Data dataValidade = new Data(dia, mes, ano);

        Produto produto = new Produto(nome, valor, dataValidade);

        return produto; 
    }

    private static void crieMenu(){
        System.out.println("~~~~~~~~~~MENU~~~~~~~~~~");
        System.out.println("[1] Crie uma loja");
        System.out.println("[2] Cadastre um produto");
        System.out.println("[3] Sair do menu");
    }
}