/*
Exercícios:
1. Construir e exbir uma lista com 5 funcionários 
2. Pesquisar um funcionário pelo nome. Apresentar os dados do funcionario.
3. Ordenar pelo nome a lista de funcionários a partir do exercício 1.
*/

package sistemacadastro;

import java.util.Scanner;

public class SistemaCadastro {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int nf = 3; // número de funcionários

    //declaração do vetor de funcionários
    Funcionario[] f;
    f = new Funcionario[nf];

    //laço para cadastrar os funcionários
    for (int i = 0; i < nf; i++) {
      System.out.println("Digite nome do " + (i + 1) + "o funcionario: ");
      String n = s.nextLine();
      System.out.println("Digite salario do " + (i + 1) + "o funcionario: ");
      double sal = s.nextDouble();
      f[i] = new Funcionario();
      f[i].nome = n;
      f[i].salario = sal;
      s.nextLine();
    }

    //exibe a lista de funcionários
    System.out.println("\nLista de Funcionarios");
    exibeFuncionario(f);
    //pesquisa por um funcionário na lista
    pesquisaNome(s, f);
    //ordena a lista de funcionários
    ordemAlfabética(f);
    }

  //função que exibe o conteúdo da lista de funcionários
  public static void exibeFuncionario(Funcionario[] f){
    for (int i=0; i<f.length; i++){
        System.out.println((i+1)+" - "+f[i].getNome()+"\tSalario: R$"+f[i].getSalario());
    }
}
//função que realiza a busca de um funcionário pela sua matrícula
public static void pesquisaNome(Scanner s, Funcionario[] f){
    boolean achou = false;
    while (!achou && !s.hasNextInt()) {
        System.out.print("Digite o nome do funcionário ou digite 'x' para sair: ");
        String n = s.nextLine().toLowerCase();
        if (n.equalsIgnoreCase("x")){
            break;
        } else {
            for (int j=0; j<f.length;j++){
                if (f[j].getNome().contains(n)){
                    System.out.println("O funcionário encontrado é: \n"+f[j]);
                    achou = true;
                    break;
                }
            }
        }
    }
}
//função que ordena a lista de funcionários em ordem alfabética
public static void ordemAlfabética(Funcionario[] f){
    boolean trocou;
    do {
        trocou = false;
        for (int i=0; i < f.length-1; i++) {
            if ((f[i].getNome()).compareToIgnoreCase(f[i+1].getNome()) > 0 )
            {
                Funcionario temp = f[i];
                f[i]=f[i+1];
                f[i+1] = temp;
                trocou = true;
            }
        }
        }while (trocou == true);
        System.out.println("\nA lista de funcionários após ser organizada em ordem alfabética:");
        for (int i=0; i<f.length; i++){
            System.out.println((i+1) + " - " + f[i].getNome() + "\t Salario:"+
           " R$" + f[i].getSalario());
        }
    }
    }






  