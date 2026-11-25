package prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {
        // —— 浅拷贝演示 ——
        List<String> chapters1 = new ArrayList<>(Arrays.asList("第1章 绪论", "第2章 基础"));
        CourseTemplate prototype1 = new CourseTemplate("设计模式", chapters1);

        CourseTemplate shallow = prototype1.clone();
        shallow.getChapters().add("被浅拷贝新增的章节");

        System.out.println("【浅拷贝】修改克隆体后：");
        System.out.println("  克隆体章节数 = " + shallow.getChapters().size());
        System.out.println("  原型章节数   = " + prototype1.getChapters().size() + "  （被串改！）");

        System.out.println();

        // —— 深拷贝演示 ——
        List<String> chapters2 = new ArrayList<>(Arrays.asList("第1章 绪论", "第2章 基础"));
        CourseTemplate prototype2 = new CourseTemplate("设计模式", chapters2);

        CourseTemplate deep = prototype2.deepClone();
        deep.getChapters().add("被深拷贝新增的章节");

        System.out.println("【深拷贝】修改克隆体后：");
        System.out.println("  克隆体章节数 = " + deep.getChapters().size());
        System.out.println("  原型章节数   = " + prototype2.getChapters().size() + "  （不受影响）");
    }
}
