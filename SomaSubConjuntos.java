import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Arrays;

class SomaSubConjuntos {
    /*
     * O problema a ser tratado é da soma de subconjuntos: dado um conjunto C de
     * números inteiros c1, c2,
     * c3, c4... cn, existe um subconjunto de C cuja soma dos elementos atinge
     * exatamente um valor V
     */
    /*
     * Projetar e implementar iuma solução para o problema da soma de subconjuntos
     * utilizando força bruta.
     */
    public static void main(String[] args) {
        SomaSubConjuntos conjunto = new SomaSubConjuntos();
        List<Integer> conjuntoInicial = Arrays.asList(0, 2, 4, 6);
        int valorEsperado = 10;
        List<Integer> conjuntoEsperado = conjunto.encontrar_subconjunto(conjuntoInicial, valorEsperado);
        if(conjuntoEsperado == null){
            System.out.println("Nao foi possivel encontrar um subconjunto que somado daria o valor esperado");
        }else{
            System.out.println(conjuntoEsperado);
        }
    }

    public List encontrar_subconjunto(List<Integer> conjuntoInicial, int valorEsperado) {
        List<Integer> conjuntoTemporario = new ArrayList();
        List<Integer> conjuntoEsperado = new ArrayList();
        int valorTemporario = 0;

        for (Integer unidadeConjunto : conjuntoInicial) {
            if (valorTemporario + unidadeConjunto == valorEsperado) {
                conjuntoTemporario.add(unidadeConjunto);
                conjuntoEsperado = conjuntoTemporario;
                return conjuntoEsperado;
            } else if (valorTemporario + unidadeConjunto < valorEsperado) {
                conjuntoTemporario.add(unidadeConjunto);
                valorTemporario += unidadeConjunto;
            }else 
                return null;
        }
        return null;
    }
}