package aplication;
public class Ghost extends GameObject
{
    


    public Ghost(int posicaoX, int posicaoY, int tamanhoTela) {
        super(posicaoX, posicaoY, tamanhoTela);
    }
 
    public void Movimentacao() {
    	int posRandom = (int)(Math.random()*3)+0;
    	switch(posRandom) {
    	case 0: setDirection(0);
    	break;
    	case 1: setDirection(90);
    	break;
    	case 2: setDirection(180);
    	break;
    	case 3: setDirection(270);
    	break;
    	}
    	mover();
    }
}
