import java.util.Scanner;
public class metodos {
    Scanner sc=new Scanner(System.in);
    public objvehiculo[] llenarRegistro (objvehiculo[] r) {
         for (int i=0; i<r.length;i++){
            objvehiculo o=new objvehiculo();
            System.out.println("ingrese la marca");
            o.setMarca(sc.next());
            System.out.println("tipo de vehiculo");
            o.setTipo(sc.next());
            System.out.println("ingrese el cilindraje");
            o.setCilindraje(sc.nextInt());
            if(o.getCilindraje()<1700){
                o.setPagoAnt(150000);
            } else if(o.getCilindraje()>=1700 && o.getCilindraje()<2000){
                o.setPagoAnt(200000);

            } else {
             o.setPagoAnt(250000);
            };
             r[i]=o;

             o.setNumcelda(i+1);
         }
        return r;
    }

    public objvehiculo[] calcularNue(objvehiculo[] r){
        for (int i = 0; i < r.length; i++) {
            r[i].setPagoAct(r[i].getPagoAnt()*1.23);
            
        }
        return r;
    }
    
    public void mostrarReg(objvehiculo[] r){
        for (int i = 0; i < r.length; i++) {
            System.out.println("marca:" + r[i].getMarca());
            System.out.println("Tipo:" + r[i].getTipo());
            System.out.println("cilidraje:" + r[i].getCilindraje());
            System.out.println("pago actual:" + r[i].getPagoAct());
            System.out.println("pago anterior:" + r[i].getPagoAnt());
             System.out.println("numero de celda:" + r[i].getNumcelda());

       }
    }
}