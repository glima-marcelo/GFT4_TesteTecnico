public class Equipamento {

    public static void main(String[] args) {

        CPU[] cpu = new CPU[2];
        cpu[0] = new CPU(3.1f, "Xingling");

        Memoria[] memoria = new Memoria[2];
        memoria[0] = new Memoria(2333f, 16, "Raid");

        DiscoRigido[] discoRigido = new DiscoRigido[2];
        discoRigido[0] = new DiscoRigido(2000, 7200, "SSD");

        Hardware[] hardware = new Hardware[2];
        hardware[0] = new Hardware(112, "PC", 5000, "HP", cpu[0], memoria[0], discoRigido[0]);

        System.out.println(cpu[0].toString());
        System.out.println("--------------------------------");
        System.out.println(memoria[0].toString());
        System.out.println("--------------------------------");
        System.out.println(discoRigido[0].toString());
        System.out.println("--------------------------------");
        System.out.println(hardware[0].toString());

    }
}
