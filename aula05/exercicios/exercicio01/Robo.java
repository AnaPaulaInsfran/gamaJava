package exercicios.exercicio01;


public class Robo {

    // atributos
    // private final int MAX_DEFAULT = 100; pertence a area
    private int posX, posY;
   // private int max;
   // private int limiteX, limiteY;
   private Area area;




    // construtor
    public Robo (int max) {
        if (max > 0) {
            this.max = max;           
        } else {
            this.max = MAX_DEFAULT;
        }
        
    }

    public void moverNorte() {
        if (posY < max) {
            posY++;    
        }
      
    }

    public void moverSul() {
        if (posY >-max) {
            posY--;    
        }
      
    }

    public void moverLeste() {
        if (posX < max) {
            posX++;    
        }
      
    }

    public void moverOeste() {
        if (posX >- max) {
            posX++;    
        }
      
    }

    public String posicaoAtual() {
        return "x: " + posX + "y: " + posY;
    }

    
}