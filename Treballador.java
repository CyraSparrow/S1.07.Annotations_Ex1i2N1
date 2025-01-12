public class Treballador {

        private String name;
        private String surName;
        private double hourPrice;

        public Treballador(String name, String surName, double hourPrice) {
            this.name = name;
            this.surName = surName;
            this.hourPrice = hourPrice;
        }

        public String getName() {
            return name;
        }

        public String getsurName() {
            return surName;
        }

        public double getHourPrice() {
            return hourPrice;
        }

        public double calcularSou(int totalHoresTreballades) {
            return totalHoresTreballades * hourPrice;
        }

        @Override
        public String toString() {
            return "Treballador [nom=" + name + ", cognom=" + surName + ", Preu per hora =" + hourPrice + "]";
        }
}
