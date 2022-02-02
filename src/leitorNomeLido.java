import java.util.HashMap;

public class leitorNomeLido {

    private int mediaIdade;
    private int qtdMaiorOcorrencia = 0;
    private String nomeMaiorOcorrencia;
    private HashMap<String, Integer> ocorrenciaNomes = new HashMap<String, Integer>();

    public leitorNomeLido() {}

    public void addDadosPessoas(String nome, Integer idade) {

        setNomeContador(retornaPrimeiroNome((nome)));
        setMediaIdade(idade);

    }

    public void setMediaIdade(int idade){
        this.mediaIdade = (this.mediaIdade + idade) / 2;
    }

    public int getMediaIdade() {
        return mediaIdade;
    }

    public void setNomeContador(String primeiroNome){

        if (ocorrenciaNomes.containsKey(primeiroNome)) {
            ocorrenciaNomes.put(primeiroNome, addCont(ocorrenciaNomes.get(primeiroNome)));
        } else {
            ocorrenciaNomes.put(primeiroNome, 1);
        }

        setDadosMaiorOcorrencia(primeiroNome, ocorrenciaNomes.get(primeiroNome));
    }

    public void setDadosMaiorOcorrencia(String nomeOcorrencia, int nroOcorrencia) {
        if (this.qtdMaiorOcorrencia < nroOcorrencia) {
            setQtdMaiorOcorrencia(nroOcorrencia);
            setNomeMaiorOcorrencia(nomeOcorrencia);
        }
    }

    public void setNomeMaiorOcorrencia(String nomeMaiorOcorrencia) {
        this.nomeMaiorOcorrencia = nomeMaiorOcorrencia;
    }

    public String getNomeMaiorOcorrencia() {
        return nomeMaiorOcorrencia;
    }

    public void setQtdMaiorOcorrencia(int qtdMaiorOcorrencia) {
        this.qtdMaiorOcorrencia = qtdMaiorOcorrencia;
    }

    public int getQtdMaiorOcorrencia() {
        return qtdMaiorOcorrencia;
    }

    public String retornaPrimeiroNome(String nomeInteiro) {
        String[] primeiroNome = nomeInteiro.split(" ");
        return primeiroNome[0];
    }

    public int addCont(Integer contador) {
        return ++contador;
    }
}
