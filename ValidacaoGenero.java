import java.util.Scanner;

public class ValidacaoGenero {

    Scanner scanner= new Scanner (System.in);

    public String genero() {

        System.out.print("Informe o gênero (M = Mulher H = Homem):" );
        String sexo= scanner.next();

        if(sexo.equalsIgnore.case("M")){
            return = "M";

        } else if(sexo.equalsIgnore.case("H")){
            return ="H";

        }
        return = "Inválido";
    }
    
}
