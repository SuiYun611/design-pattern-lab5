package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 实验五：原型模式 —— 课程模板
 *
 * 浅拷贝 clone() 只复制值类型字段，引用类型字段（chapters）仍共享；
 * 深拷贝 deepClone() 会额外复制引用类型字段，实现真正隔离。
 */
public class CourseTemplate implements Cloneable {

    private String title;           // 值类型字段
    private List<String> chapters;  // 引用类型字段：章节列表

    public CourseTemplate(String title, List<String> chapters) {
        this.title = title;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getChapters() {
        return chapters;
    }

    /** 浅拷贝：引用类型字段与原对象共享 */
    @Override
    public CourseTemplate clone() {
        try {
            return (CourseTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /** 深拷贝：复制引用类型字段，克隆体与原型隔离 */
    public CourseTemplate deepClone() {
        CourseTemplate copy = this.clone();
        copy.chapters = new ArrayList<>(this.chapters);
        return copy;
    }
}
