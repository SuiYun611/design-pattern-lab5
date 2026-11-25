package singleton;

/**
 * 实验五：单例模式 —— 全局配置管理器
 *
 * 按老师要求，将单例对象的名称由示例中的 instance
 * 修改为 keXianInstance（柯娴），其余结构保持不变。
 */
public class AppConfig {

    /** 修改后的单例对象名称（volatile 保证可见性、禁止指令重排） */
    private static volatile AppConfig keXianInstance;

    private String platformName;
    private String version;

    /** 私有构造器，禁止外部 new */
    private AppConfig() {
        this.platformName = "智学平台";
        this.version = "1.0.0";
    }

    /** 双重检查锁：懒加载 + 线程安全 */
    public static AppConfig getInstance() {
        if (keXianInstance == null) {
            synchronized (AppConfig.class) {
                if (keXianInstance == null) {
                    keXianInstance = new AppConfig();
                }
            }
        }
        return keXianInstance;
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getVersion() {
        return version;
    }
}
