package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

   private List<Figura> figuras;

    public Imagem(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public Imagem() {}

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double somaAreas = 0.0;
      for (Figura figura : figuras){
          somaAreas += figura.calcularArea();
      }
      return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasMaioresQue20 = new ArrayList<>();
        for (Figura figura : figuras){
            if (figura.calcularArea() > 20){
                figurasMaioresQue20.add(figura);
            }
        }
        return figurasMaioresQue20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> figurasQuadradas = new ArrayList<>();
        Quadrado quadrado = new Quadrado();
        for (Figura figura : figuras){
                if (figura instanceof Quadrado){
                figurasQuadradas.add(figura);
            }
        }
        return figurasQuadradas;
    }
}
