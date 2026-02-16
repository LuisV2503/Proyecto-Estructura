import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m=new metodos();
        int n=0;
        System.out.println("ingrese la cantidad de celdas");
        n = sc.nextInt();
        ObjVehiculo[] r= new ObjVehiculo[n];
        r = m.llenarRegistro(r);
        r = m.calcularNue(r);
        m.mostrarReg(r);


    }
}