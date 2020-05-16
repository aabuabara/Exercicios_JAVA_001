public class RetanguloMovel implements Movel { 

private PontoMovel superiorEsquerda;
private PontoMovel inferiorDireita;
private int x1, y1, x2, y2, velX, velY;

public RetanguloMovel(int x1, int y1, int x2, int y2, int velX, int velY) {
    superiorEsquerda = new PontoMovel (this.x1 = x1, this.y1 = y1, this.velX = velX, this.velY = velY);
    inferiorDireita = new PontoMovel (this.x2 = x2, this.y2 = y2, this.velX = velX, this.velY = velY);

}
    
@Override
public void moverParaCima() {
    this.inferiorDireita.moverParaCima();
    this.superiorEsquerda.moverParaCima();
    
}

@Override
public void moverParaBaixo() {
    this.inferiorDireita.moverParaBaixo();
    this.superiorEsquerda.moverParaBaixo();

}

@Override
public void moverParaEsquerda() {
    this.inferiorDireita.moverParaEsquerda();
    this.superiorEsquerda.moverParaEsquerda();
}

@Override
public void moverParaDireita() {
    this.inferiorDireita.moverParaDireita();
    this.superiorEsquerda.moverParaDireita();
    
}

@Override
public String toString() {
    return "Retangulo Movel{" + "superiorEsquerda = " + superiorEsquerda + ", inferiorDireita = " + inferiorDireita +'}';
}


}