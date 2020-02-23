/*
 Desenvolva, usando a UML (diagrama de classe), uma classe que modele um objeto esfera
em conformidade com o paradigma orientado a objeto. Posteriormente implemente esta
classe. A classe deverá conter as seguintes características: raio e o cálculo da área e do
volume da esfera. Obs.: o valor do raio não pode ser negativo. A área total = (4*3.1415*raio2) e
volume =((4.0/3.0)*3.1415*raio3).
 */
package classes;
import java.*;

public class Formas {

    // declarando os atributos para a classe Forma
    private int raio = 0;
    private double pi = 3.1415;
   
    // declarando os métodos setters e getters
    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }

    public double calculaArea() {

        return (4 * pi * (raio * raio));
    }

    public double calculaVolume() {
        return ((4.0 / 3.0) * pi * (raio * raio * raio));
    }
    @Override
    public String toString(){
        return String.format("%s: %.2f\n%s: %.2f\n","Area",calculaArea(),"Volume:",calculaVolume());
        
    }

}
