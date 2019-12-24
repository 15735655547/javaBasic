package Pre4.Pre2;

public class ChangFangTi extends JuXing{
    private int Gao;

    public int getGao() {
        return Gao;
    }

    public void setGao(int gao) {
        Gao = gao;
    }
    public void TiJi(){
        System.out.println("该长方体的体积是："+this.getHeight()*this.getWinth()*Gao);
    }
}
