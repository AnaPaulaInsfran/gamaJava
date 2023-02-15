package exercicios.exercicio03;

public class Placar {

    private String time1, time2;
    private int pontoT1, pontoT2;

    public Placar(){
        

    }

    public String exibir(){
        return time1 + " " + pontoT1 + " X " + pontoT2 + " " + time2;
    }

    public Placar (String time1, int pontoT1, String time2, int pontoT2) {
        this.time1 = time1;
        this.time2 = time2;
        this.pontoT1 = pontoT1;
        this.pontoT2 = pontoT2;
    }





    public void getDados() {

        System.out.println("Placar: " + time1 + ":" + pontoT1 + "X" + pontoT2 + time2);

    }



      
}
