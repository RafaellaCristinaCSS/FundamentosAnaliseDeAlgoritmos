import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class SomaSubConjuntos {
    public static void main(String[] args) {
        SomaSubConjuntos conjunto = new SomaSubConjuntos();
        List<Integer> conjuntoInicial = Arrays.asList(0, 2, 4, 6);
        int valorEsperado = 10;
        List<Integer> conjuntoEsperado = conjunto.encontrar_subconjunto(conjuntoInicial, valorEsperado);
        if (conjuntoEsperado == null) {
            System.out.println("Nao foi possivel encontrar um subconjunto que somado daria o valor esperado");
        } else {
            System.out.println(conjuntoEsperado);
        }
    }

    public List encontrar_subconjunto(List<Integer> conjuntoInicial, int valorEsperado) {

        for (Integer unidadeConjunto : conjuntoInicial) {
            List<Integer> conjuntoTemporario = new ArrayList();
            List<Integer> conjuntoEsperado = new ArrayList();
            int valorTemporario = 0;
            conjuntoInicial.remove(0);
            while (valorTemporario < valorEsperado) {
                if (valorTemporario + unidadeConjunto == valorEsperado) {
                    conjuntoTemporario.add(unidadeConjunto);
                    conjuntoEsperado = conjuntoTemporario;
                    return conjuntoEsperado;
                } else if (valorTemporario + unidadeConjunto < valorEsperado) {
                    conjuntoTemporario.add(unidadeConjunto);
                    valorTemporario += unidadeConjunto;
                }
            }
        }
        return null;
    }
}