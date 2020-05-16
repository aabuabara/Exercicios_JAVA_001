public class PontoMovel implements Movel {
    
    private int x;
    private int y;
    private int velX;
    private int velY;

    public PontoMovel(int x, int y, int velX, int velY) {
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    public PontoMovel() {
    }
    

    @Override
    public String toString() {
        return "Ponto Movel{" + "x=" + this.x + ", y=" + this.y + ", velX=" + this.velX + ", velY=" + this.velY + '}';
    }
    
    
    public void moverParaCima() {
      this.y = this.y+this.velY;
    }
    
    public void moverParaBaixo() {
        this.y = this.y - this.velY;
    }
    
    public void moverParaEsquerda() {
        this.x = this.x - this.velX;
    }
    
    public void moverParaDireita() {
        this.x = this.x + this.velX;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelX() {
        return this.velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return this.velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    } 
}