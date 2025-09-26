package Secao_8;
import java.util.ArrayList;
public class Aula_002 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println(nomes);

        nomes.add("Eduardo");
        nomes.add("Alice");
        nomes.add("José");
        nomes.add("Fernando");
        nomes.add(2, "Carlos");

        System.out.println(nomes);

        String str = nomes.getFirst();
        String str2 = nomes.get(1);
        String str3 = nomes.getLast();

        System.out.println(str + ", " + str2 + ", " + str3);

        nomes.removeFirst();
        nomes.remove(1);
        nomes.removeLast();
        nomes.remove("José");

        System.out.println(nomes);
    }
}
