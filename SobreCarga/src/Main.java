public class Main {

    public static void main(String[] args) {
        Sobrecarga sc= new Sobrecarga();
        int sumaint;
        double sumadouble;
        //Llamando todas las versiones del metodo
        sc.demoSobrec();
        sc.demoSobrec(3);
        sc.demoSobrec(5,8);

    }
}