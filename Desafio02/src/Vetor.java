import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Vetor {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos valores terá o vetor?: ");
        int tamanho = leitura.nextInt();

        System.out.println("Digite os números inteiros do vetor");
        Integer[] vetor = new Integer[tamanho];

        int par = 0;
        int impar = 0;

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = leitura.nextInt();

            if (vetor[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        SortedMap<Integer, Integer> qtd = new TreeMap<>();
        vetor.forEach(id -> qtd.compute(id, (key , qtda ) -> (qtda == null ? 1 : qtda + 1)));

        qtd.entrySet().forEach(entry->{
        System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());





        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
        //System.out.println("Quantidade de números repetidos: " + par);
        //System.out.println("Quais são os números repetidos: " + par);

    }
}
