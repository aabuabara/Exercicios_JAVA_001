

public class CirculoMovel implements Movel {
    
    private int raio;
    PontoMovel centro;
    private int x, y, velX, velY;

    public CirculoMovel(int raio, int x, int y, int velX, int velY) {
        this.raio = raio;
        
        this.centro = new PontoMovel(this.x = x, this.y = y, this.velX = velX, this.velY = velY);
    }
    
     public CirculoMovel() {
       
    }

    @Override
    public String toString() {
        return "CirculoMovel{" + "raio=" + this.raio + ", Ponto Móvel: x=" + this.centro.getX() + ", y=" + this.centro.getY() + ", velX=" + this.centro.getVelX() + ", velY=" + this.centro.getVelY() + '}';
    }

    public void moverParaCima() {
       //this.centro.setY(this.y + this.velY);
       //this.moverParaCima();
       this.centro.moverParaCima();
       
    }
    
    public void moverParaBaixo() {
       //this.centro.setY(this.y - this.velY);
       //this.moverParaBaixo();
       this.centro.moverParaBaixo();
    }
    
    public void moverParaEsquerda() {
        //this.centro.setX(this.x - this.velX);
        //this.moverParaEsquerda();
        this.centro.moverParaEsquerda();
    }
    
    public void moverParaDireita() {
       // this.centro.setX(this.x + this.velX);
       //this.moverParaDireita();
       this.centro.moverParaDireita();
} 
}