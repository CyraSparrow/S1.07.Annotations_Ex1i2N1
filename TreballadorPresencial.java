public class TreballadorPresencial extends Treballador {
    private static double benzina = 51.8;
    private static final double preuDietes = 50.0;

    public TreballadorPresencial(String name, String surName, double hourPrice) {
        super(name, surName, hourPrice);
    }

    public static void setGas(double benzina) {
        TreballadorPresencial.benzina = benzina;
    }

    @Override
    public double calcularSou(int totalHoresTreballades) {
        return super.calcularSou(totalHoresTreballades) + benzina;
    }
    @Deprecated //Ex2N1
    public void mostrarDietes() {
        System.out.println("El preu de les dietes és de: " + preuDietes + "€");
    }
}

