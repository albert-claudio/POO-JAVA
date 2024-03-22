public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está Tampada "+ this.tampada);
        System.out.println("Carga " + this.carga);
        System.out.println("Modelo " + this.modelo);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabicar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    void destampar(){
        this.tampada = false;
    }

    void tampar(){
        this.tampada = true;
    }


}
