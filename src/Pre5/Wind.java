package Pre5;

public class Wind implements Instrument{
    @Override
    public void play() {
        System.out.println("弹奏Wind");
    }
    public void playWind(){
        System.out.println("调用wind的play2方法");
    }

}
