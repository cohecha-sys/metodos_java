public class ejercicio6 {

    private double nota;

    public ejercicio6(double nota) {
        this.nota = nota;
    }


    public void mostrarBoletin() {
        System.out.println("Boletín: La nota de este objeto estudiante es " + this.nota);
    }


    public static double compararNotas(double n1, double n2) {
        return (n1 > n2) ? n1 : n2;
    }


    public static void main(String[] args) {
        // Probando método de instancia (requiere crear objeto)
        ejercicio6 est = new ejercicio6(4.2);
        est.mostrarBoletin();


        double mejorNota = ejercicio6.compararNotas(3.5, 4.8);
        System.out.println("La nota más alta calculada por el método static es: " + mejorNota);
    }
}