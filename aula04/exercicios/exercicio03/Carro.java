package exercicios.exercicio03;

public class Carro {

      // caracteristicas = ATRIBUTOS
      private String modelo;
      private String marca;
      private double consumo;

      
      // construtor

      public Carro(String modelo, String marca, double consumo) {
    

          this.modelo = modelo; // this se refere ao objeto (atributo)
          this.marca = marca;
          setConsumo(consumo);
          
            
          }  
  
      

      public void apresentar() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
      }

      public double getConsumo() {
        return consumo;
      }

      public void setConsumo(double consumo) {
        if (consumo > 0) {
            this.consumo = consumo;
            
        }
      }
  
    
}
