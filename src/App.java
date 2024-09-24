import exercicio.Carro;
import exercicio.Cinema;
import exercicio.Elevador;
import exercicio.Relogio;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Relogio r1 = new Relogio();

        //r1.acertarRelogio(00, 46);
        //r1.avancarMinutos();
        //System.out.println("Horas: " + r1.exibirHora());


        //Carro c1 = new Carro();

        //c1.setMarca("fiat");
        //c1.acelerar(220);
        //c1.frear(5);
        //System.out.println(c1.exibirVelocidade());


        //Elevador e1 = new Elevador();

        //e1.setAndarMaximo(10);
        //e1.setAndarMinimo(0);
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.subir();
        //e1.descer();
        //System.out.println("Andar atual: " + e1.mostrarAndar());


        Cinema cine1 = new Cinema(60, "Rango", 18);

        cine1.venderIngresso(60);
        cine1.venderIngresso(0);
        cine1.cancelarIngresso(59);
        cine1.cancelarIngresso(2);
        cine1.getAssentos();
        System.out.println(cine1.verificarDisponibilidade());
        System.out.println("Total de lucro: " + cine1.calcularFaturamento());
    }
}
