package factorymethod;

public class CQUPTvFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("重邮电视机工厂生产重邮电视机。");
    	return new CQUPTv();
    }
}
