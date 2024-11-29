public class Main {
    public static void main(String[] args) {
        Helicoptero heli1 = new Helicoptero(5);
        Helicoptero heli2 = new Helicoptero(3);

        System.out.println("-----------------------");

        System.out.println("Estado do Helicóptero 1: " + heli1.StatusHelicóptero());
        System.out.println("Estado do Helicóptero 2: " + heli2.StatusHelicóptero());

        System.out.println("-----------------------");

        heli1.entrada();
        heli2.entrada();

        System.out.println("-----------------------");

        heli1.ligar();
        heli2.ligar();

        System.out.println("-----------------------");

        heli1.decolar(1000);
        heli2.decolar(1500);

        System.out.println("-----------------------");

        System.out.println("\nEstado do Helicóptero 1 após decolar: " + heli1.StatusHelicóptero());
        System.out.println("Estado do Helicóptero 2 após decolar: " + heli2.StatusHelicóptero());

        System.out.println("-----------------------");

        heli1.aterrissar();
        heli2.aterrissar();

        System.out.println("-----------------------");

        heli1.aterrissar();
        heli2.aterrissar();

        System.out.println("-----------------------");

        heli1.saida();
        heli2.saida();

        System.out.println("-----------------------");

        System.out.println("\nEstado final do Helicóptero 1: " + heli1.StatusHelicóptero());
        System.out.println("Estado final do Helicóptero 2: " + heli2.StatusHelicóptero());
    }
}
