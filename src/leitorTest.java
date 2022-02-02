import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class leitorTest {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("names.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            leitorNomeLido dadosPessoas = new leitorNomeLido();


            while((line = br.readLine()) != null) {
                String[] dados = line.split("#");
                dadosPessoas.addDadosPessoas(dados[0], Integer.valueOf(dados[1]));
            }


            System.out.println("Média de idades: " + dadosPessoas.getMediaIdade());
            System.out.println("Nome com mais ocorrencias: " + dadosPessoas.getNomeMaiorOcorrencia() +
                               " \nOcorrencias: " + dadosPessoas.getQtdMaiorOcorrencia());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
