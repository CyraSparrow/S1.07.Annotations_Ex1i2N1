public class Main {
    @SuppressWarnings("deprecation")  //Ex2N1
    public static void main(String[] args) {
        Treballador treballador = new Treballador("Ana", "Alonso", 10);
        TreballadorOnline treballadorOnline = new TreballadorOnline("Antonio", "Oliván", 9.5);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Aloma", "Díaz", 12);

        System.out.println("Salari d'un treballador: " + treballador.calcularSou(160) + "€");
        System.out.println("Salari d'un treballador Online: " + treballadorOnline.calcularSou(160) + "€");
        System.out.println("Salari d'un treballador Presencial: " + treballadorPresencial.calcularSou(160) + "€");

        //Métodes Obsolets Ex2N1
        treballadorOnline.mostrarTarifaPlana();
        treballadorPresencial.mostrarDietes();

    }
}

