
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
   
     
        System.out.println("Informe o tipo de figura que deseja criar: ");
        System.out.println("1 = Circulo");
        System.out.println("2 = Retangulo");
        Scanner entrada = new Scanner(System.in);       
        int resposta = entrada.nextInt();    
        
        if (resposta == 1) {
            
            System.out.println("Informe o raio, os valores x e y do centro do círculo, a velocidadeX e a velocidadeY de movimentação: ");
            Scanner raio = new Scanner(System.in);  
            Scanner xis = new Scanner(System.in);   
            Scanner ipslon = new Scanner(System.in); 
            Scanner velXis = new Scanner(System.in);  
            Scanner velIpslon = new Scanner(System.in);  
            int r = raio.nextInt();
            int x = xis.nextInt();
            int y = ipslon.nextInt();
            int velX = velXis.nextInt();
            int velY = velIpslon.nextInt();
           
            CirculoMovel c = new CirculoMovel(r, x, y, velX, velY);
            
            System.out.println("Criando um círculo.");
            System.out.println(c.toString());
            System.out.println("");
            System.out.println("Move para cima");
            c.centro.moverParaCima();
            System.out.println(c.toString());
            
            System.out.println("");
            System.out.println("Move para a direita");
            c.centro.moverParaDireita(); 
            System.out.println(c.toString());
            
            System.out.println("");
            System.out.println("Move para baixo");
            c.centro.moverParaBaixo();
            System.out.println(c.toString());
            
            System.out.println("");
            System.out.println("Move para a esquerda");
            c.centro.moverParaEsquerda();
            System.out.println(c.toString());
            
        }
        
        else if (resposta == 2) {
            System.out.println("Informe os valores dos pontos superiorEsquerda (x1, y1), inferiorDireita (x2, y2) e as velocidades de movimentação (velX e velY), nesta sequencia: ");
            Scanner xSE = new Scanner(System.in);  
            Scanner ySE = new Scanner(System.in);   
            Scanner xID = new Scanner(System.in); 
            Scanner yID = new Scanner(System.in); 
            Scanner velXis = new Scanner(System.in);  
            Scanner velIpslon = new Scanner(System.in);  
            int x1 = xSE.nextInt();
            int y1 = ySE.nextInt();
            int x2 = xID.nextInt();
            int y2 = yID.nextInt();
            int velX = velXis.nextInt();
            int velY = velIpslon.nextInt();
            
            RetanguloMovel r = new RetanguloMovel(x1, y1, x2, y2, velX, velY);
            System.out.println("Criando um retângulo.");
            System.out.println(r.toString());
            System.out.println("");
            System.out.println("Move para cima");
            r.moverParaCima();
            System.out.println(r.toString());
            
            System.out.println("");
            System.out.println("Move para a direita");
            r.moverParaDireita();
            System.out.println(r.toString());
            
            System.out.println("");
            System.out.println("Move para baixo");
            r.moverParaBaixo();
            System.out.println(r.toString());
            
            System.out.println("");
            System.out.println("Move para a esquerda");
            r.moverParaEsquerda();
            System.out.println(r.toString());
            
        }
           
  
        }
     
        
    }