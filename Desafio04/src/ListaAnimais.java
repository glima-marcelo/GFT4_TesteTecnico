public class ListaAnimais {

    public static void main(String[] args) {

        Repteis r = new Repteis();
        r.setClasse("repteis");
        r.setAlimentacao("herbívoro");
        r.setHabitat("terrestres");

        Mamifero m = new Mamifero();
        m.setClasse("mamiferos");
        r.setAlimentacao("carnívoro");
        r.setHabitat("multi habitat");

        Aves a = new Aves();
        a.setClasse("aves");
        a.setAlimentacao("onívoro");
        a.setHabitat("aéreo");

        Anfibios p = new Anfibios();
        p.setClasse("anfíbio");
        p.setAlimentacao("onívoro");
        p.setHabitat("aquático");

        System.out.println("----------------------------------------------");
        System.out.println(r.getClasse());
        r.alimentar();
        r.locomover();
        System.out.println("----------------------------------------------");
        System.out.println(m.getClasse());
        m.alimentar();
        m.locomover();
        System.out.println("----------------------------------------------");
        System.out.println(a.getClasse());
        a.alimentar();
        a.locomover();
        System.out.println("----------------------------------------------");
        System.out.println(p.getClasse());
        p.alimentar();
        p.locomover();
    }
}
