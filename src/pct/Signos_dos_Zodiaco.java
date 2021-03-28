
package pct;

import java.util.Scanner;

public class Signos_dos_Zodiaco {

    public static void main(String[] args) {

       //Declaração de variáveis
       int dia, mes;
       
       //Declaração de entrada
       Scanner entrada = new Scanner(System.in);
       
       //Apresentação ao sistema
        System.out.println("\n DESCUBRA SEU SIGNO DO ZODÍACO :D\n");
        
        //Entradas
        System.out.print("Informe Seu Dia de Nascimento:");
        dia = entrada.nextInt();
        System.out.print("Informe Seu Mês de Nascimento:");
        mes = entrada.nextInt();
        
        //Processamento
        if((mes == 1) && ((dia >= 20) && (dia <= 31)) || (mes == 2) && ((dia >= 1) && (dia <= 18)))
        {
            System.out.println("\nSeu Signo é de Aquário!");
        }
        else if((mes == 2) && ((dia >= 19) && (dia <= 28)) || (mes == 3) && ((dia >= 1) && (dia <= 20)))
        {
            System.out.println("\nSeu Sugno é de Peixes!\n"); 
        }
        else if((mes == 3) && ((dia >= 21) && (dia <=31)) || (mes ==4) && ((dia >= 1) && (dia <=19)))
        {
            System.out.println("\nSeu Signo é de Áries!");
        }
        else if((mes == 4) && ((dia >= 20) && (dia <=30)) || (mes == 5) && ((dia >= 1) && (dia <= 20)))
        {
            System.out.println("\nSeu Signo é de Touro!");
        }
        else if((mes == 5) && ((dia >= 21) && (dia <= 31)) || (mes == 6) && ((dia >= 1) && (dia <= 21)))
        {
            System.out.println("\nSeu Signo é de Gêmeos!");
        }
        else if((mes == 6) && ((dia >= 22) && (dia <= 30)) || (mes == 7) && ((dia >= 1) && (dia <= 22)))
        {
            System.out.println("\nSeu Signo é de Câncer!");
        }
        else if((mes == 7) && ((dia >= 23) && (dia <= 31)) || (mes == 8) && ((dia >= 1) && (dia <= 22)))
        {
            System.out.println("\nSeu Signo é de Leão!");
        }
        else if((mes == 8) && ((dia >= 23) && (dia <= 31)) || (mes == 9) && ((dia >= 1) && (dia <= 22)))
        {
            System.out.println("\nSeu Signo é de Virgem!");
        }
        else if((mes == 9) && ((dia >= 23) && (dia <= 30)) || (mes == 10) && ((dia >= 1) && (dia <= 22)))
        {
            System.out.println("\nSeu Signo é de Libra!");
        }
        else if((mes == 10) && ((dia >= 23) && (dia <= 31)) || (mes == 11) && ((dia >= 1) && (dia <= 21)))
        {
            System.out.println("\nSeu Signo é de Escorpião!");
        }
        else if((mes == 11) && ((dia >= 22) && (dia <= 30)) || (mes == 12) && ((dia >= 1) && (dia <= 21)))
        {
            System.out.println("\nSeu Signo é de Sagitário!");
        }
        else if((mes == 12) && ((dia >= 22) && (dia <= 31)) || (mes == 1) && ((dia >= 1) && (dia <= 19)))
        {
            System.out.println("\nSeu Signo é de Capricórnio!");
        }
        
        //ANO BISSEXTO
        else if((mes == 2) && (dia == 29))
        {
            System.out.println("\n\tNÃO ACEITAMOS ANOS BISSEXTOS >:(");
        }
        
        //DIA OU MÊS INVÁLIDO
        else
        {
            System.out.println("\n\tDIGITE UM DIA OU MÊS VÁLIDO!");
        }
    }
}


