package aplication;
public class Booster extends Item {
    private int turno;
    
    public Booster(int x, int y, int turno) {
        super(x, y,100); 


        this.turno = turno;
    }

	public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

  

}