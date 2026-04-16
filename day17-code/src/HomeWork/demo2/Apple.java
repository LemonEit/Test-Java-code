package HomeWork.demo2;

/**
 * 苹果类
 */
public class Apple {
    private double size;
    private String color;

    /**
     * 构造方法，初始化苹果的尺寸和颜色
     *
     * @param size  尺寸
     * @param color 颜色
     */
    public Apple(double size, String color) {
        this.size = size;
        this.color = color;
    }

    /**
     * 无参构造方法
     */
    public Apple() {
    }

    /**
     * 获取苹果尺寸
     *
     * @return 尺寸
     */
    public double getSize() {
        return size;
    }

    /**
     * 设置苹果尺寸
     *
     * @param size 尺寸
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * 获取苹果颜色
     *
     * @return 颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置苹果颜色
     *
     * @param color 颜色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 返回苹果的字符串表示
     *
     * @return 格式为 "尺寸-颜色" 的字符串
     */
    @Override
    public String toString() {
        return size + "-" + color;
    }
}
