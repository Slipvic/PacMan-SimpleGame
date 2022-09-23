package aplication;
public class GameObject {

    private int elementoX;
    private int elementoY;
    private int tamanhoTela;
    private boolean visivel=true;
    private int direcao;
    
    public boolean isVisivel() {
        return visivel;
    }

    public GameObject(){
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    public GameObject(int x, int y, int tamanhoTela) {
        this.elementoX = x;
        this.elementoY = y;
        this.tamanhoTela = tamanhoTela;
    }

    public int getElementoX() {
        return elementoX;
    }

    public void setElementoX(int x) {
    	//posição negativa não existe
        if (elementoX<0) {
            System.out.println("Posicao Invalida");
            this.elementoX = 0;
        }
        else
        this.elementoX = x;
    }

    public int getElementoY() {
        return elementoY;
    }

    public void setElementoY(int y) {
       	//posição negativa não existe
        if (y < 0) {
            System.out.println("Posicao Invalida");
            this.elementoY = 0;
        }
        else
        this.elementoY = y;
        
    }

    public int getScreenSize() {
        return tamanhoTela;
    }

    public void setScreenSize(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }


    public boolean colisao(GameObject obj){
        if(getElementoX() >= obj.getElementoX() && getElementoX() <= obj.getElementoX() + 50 && getElementoY() >= obj.getElementoY() && getElementoY() <= obj.getElementoY() + 50){
            return true;
        }
        return false;
    }
    public int getDirecao() {
        return direcao;
    }

    public void setDirection(int direcao) {
    	//direção negativa não existe
        if (direcao<0) {
            System.out.println("direcao Invalida");
        }
        
        this.direcao = direcao;
    }
    public boolean mover(){

    int x=getElementoX(), y=getElementoY();

        if(direcao == 0) y -= 10;
        if(direcao == 180)y += 10;
        if(direcao == 90)x += 10;
        if(direcao == 270)x -= 10;

        if(x < getScreenSize() && x > 0){
            if(y < getScreenSize() && y > 0){
                //TODO: Mover o jogador caso verdadeiro
                setElementoX(x);
                setElementoY(y); 
                return true;
            }
        }
       
       return false;

      
            
    }


}
