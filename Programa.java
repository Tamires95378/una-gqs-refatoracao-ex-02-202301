import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ValidacaoIdadeHomem validacaoIdadeHomem = new ValidacaoIdadeHomem();
		ValidacaoIdadeMulher validacaoIdadeMulher = new ValidacaoIdadeMulher();
		ValidacaoGenero validacaoGenero = new ValidacaoGenero();
    
    String genero,mensalidade;
    genero = validacao.genero();

    if (genero == H) {
      mensalidade = ValidacaoIdadeHomem.idadeValidacao();
    }

    else (genero == M) {
      mensalidade = validacaoIdadeMulher.IdadeValidacao();
    }
    
    else {
      mensalidade = "inválido";
    }
    }

    System.out.println("Valor da mensalidade: R$" + mensalidade);

    scanner.close();
}
