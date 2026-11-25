package singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        AppConfig first = AppConfig.getInstance();
        AppConfig second = AppConfig.getInstance();

        System.out.println("第一次获取：" + first);
        System.out.println("第二次获取：" + second);
        System.out.println("两次是否为同一对象：" + (first == second));
        System.out.println("平台名称：" + first.getPlatformName() + "，版本：" + first.getVersion());
    }
}
