//# ADS_POO_forum
//Exercício FORUM da atividade de POO do curso ADS.
package ads.poo;

import java.util.Scanner;

public class Forum1 {

String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

int dias=0, ano=0, escolha=0;

Scanner leia;

public static boolean bissexto(int ano) {

if (ano % 400 == 0 ) {

return true;

}

else if ((ano % 4 == 0) && (ano % 100 != 0)) {

return true;

}

else {

return false;

}

}

public static int qualMes(int opcao, int ano) {

if (opcao == 2) {

if (bissexto(ano)) {

return 29;

} else {

return 28;

}

} else if (opcao == 1 || opcao == 3 ||opcao == 5 ||opcao == 7 ||opcao == 8 ||opcao == 10 || opcao == 12) {

return 31;

} else {

return 30;

}

}

public static void main(String[] args) {

Forum1 clas = new Forum1();

clas.leia = new Scanner(System.in);

System.out.println("-- Programa Quantos Dias Têm o Mês --");

System.out.println("-------------------------------------");

for (int i = 0; i<12; i++) {

System.out.println((i+1)+" - "+clas.mes[i]);

}

System.out.println("-------------------------------------");

System.out.println("Escolha um número referente a um mês: ");

clas.escolha = clas.leia.nextInt();

if (clas.escolha == 2) {

System.out.println("Qual o ano?: ");

clas.ano = clas.leia.nextInt();

}

clas.dias = qualMes(clas.escolha, clas.ano);

String result = (clas.escolha == 2) ? "No ano de "+clas.ano+" o mês de "+clas.mes[clas.escolha-1]+" teve "+clas.dias+" dias." : "O mês escolhido foi "+clas.mes[clas.escolha-1]+" e ele têm "+clas.dias+" dias.";

System.out.println(result);

}

}
