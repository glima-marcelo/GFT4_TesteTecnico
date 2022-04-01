import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Vetor {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Quantos valores terá o vetor?: ");
        int tamanho = leitura.nextInt();

        System.out.println("Digite os números inteiros do vetor");
        //Integer[] vetor = new Integer[tamanho];
        List<Integer> vetor = new ArrayList<>();

        int par = 0;
        int impar = 0;

        for (int i = 0; i < tamanho; i++) {
            vetor.add(leitura.nextInt());

            if (vetor.get(i) % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }


        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);

        SortedMap<Integer, Integer> qtd = new TreeMap<>();
        vetor.forEach(id -> qtd.compute(id, (key , qtda ) -> (qtda == null ? 1 : qtda + 1)));

        AtomicInteger cont = new AtomicInteger();

        List<Integer> repetidos = new ArrayList<>();

        qtd.entrySet().forEach(entry->{
            if (entry.getValue() > 1) {
                repetidos.add(entry.getKey());
                cont.getAndIncrement();
            }
        });
        System.out.println("Quantidade de números repetidos: " + cont);
        System.out.println("Números repetidos: " + repetidos);


    }
}
