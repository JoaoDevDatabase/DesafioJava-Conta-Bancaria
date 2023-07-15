
public class ContaTerminal {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        // PRIMEIRO CONTATO COM O USUÁRIO MANDANDO MENSAGEM DE BEM-VINDO
        System.out.println(("\n**********OLÁ SEJA BEM VINDO**********\n"));

        // REQUERINDO INFORMAÇÕES PARA PODER VERIFICAR SE HÁ TAL NOME NO BANCO DE DADOS;
        System.out.println("Olá! qual seu nome ? \n");

        // ENTRADA DO MEU USUÁRIO COLOCANDO SEU NOME;
        System.out.println("DIGITE SEU NOME : ");
        contaBancaria.Nomecliente();
        System.out.println("\n");

        System.out.println("DIGITE NÚMERO DA AGÊNCIA : ");
        contaBancaria.AgenciaConta();
        System.out.println("\n");

        System.out.println("DIGITE O NÚMERO DA CONTA : ");
        contaBancaria.Numeroconta();
        System.out.println("\n");

        contaBancaria.OutputSaldoConta();
        System.out.println("\n");

        System.out.println("\n**********OBRIGADO PELA PREFERENCIA**********\n");

    }
}
