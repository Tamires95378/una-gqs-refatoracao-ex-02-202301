import java.util.Scanner;

public class ValidacaoGenero {

    Scanner scanner= new Scanner (System.in);

    public String genero() {

        System.out.print("Informe o gênero (M = Mulher H = Homem):" );
        String sexo= scanner.next();

        if(sexo.equalsIgnore.Case("M")){
            return "M";

        } else if(sexo.equalsIgnore.Case("H")){
            return "H";

        }
        return  "Inválido";
    }
    
}
