public class Sobrecarga extends SobreCargap {
    void demoSobrec(){
        //sobrescribiendo metodo en la clase hija
        System.out.println("Sin parámetros\n");
    }
    //Sobrecargando  para un parámetro int
    void demoSobrec(int a){
        //sobrescribiendo metodo en la clase hija
        System.out.println("parámetros ingresados: " +a+"\n");
    }
    //Sobrecargando  para dos parámetros int
    void demoSobrec(int a, int b){
        //sobrescribiendo metodo en la clase hija
        System.out.println("parámetros ingresados: "+a+", "+b);
    }
}
