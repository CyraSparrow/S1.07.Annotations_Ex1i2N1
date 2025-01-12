public class TreballadorOnline extends Treballador {

        private static final double tarifaPlana = 38.9;

        public TreballadorOnline(String name, String surName, double hourPrice) {
            super(name, surName, hourPrice);
        }

        @Override
        public double calcularSou(int totalHoresTreballades) {
            return super.calcularSou(totalHoresTreballades) + tarifaPlana;
        }
    @Deprecated //Ex2N1
    public void mostrarTarifaPlana() {
        System.out.println("La tarifa plana és de: " + tarifaPlana + "€");
    }




}
