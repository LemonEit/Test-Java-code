package HomeWork.demo4;

/**
 * 自定义动态数组列表，实现 Touchable 接口
 */
public class MyArrayList implements Touchable {
    private Object[] all;
    private int total;
    
    /**
     * 无参构造方法，初始化容量为2的空列表
     */
    public MyArrayList() {
        all = new Object[2];
        total = 0;
    }
    
    /**
     * 向列表末尾添加元素，容量不足时自动扩容为原来的2倍
     *
     * @param element 要添加的元素
     */
    public void add(Object element) {
        if (total == all.length) {
            Object[] newAll = new Object[all.length * 2];
            for (int i = 0; i < total; i++) {
                newAll[i] = all[i];
            }
            all = newAll;
        }
        all[total++] = element;
    }
    
    /**
     * 删除指定索引位置的元素
     *
     * @param index 要删除元素的索引
     */
    public void remove(int index) {
        if (index < 0 || index >= total) {
            System.out.println("没有这个元素");
            return;
        }
        for (int i = index; i < total - 1; i++) {
            all[i] = all[i + 1];
        }
        total--;
    }
    
    /**
     * 修改指定索引位置的元素值
     *
     * @param index 要修改元素的索引
     * @param value 新的元素值
     */
    public void set(int index, Object value) {
        if (index < 0 || index >= total) {
            System.out.println("没有这个元素");
            return;
        }
        all[index] = value;
    }
    
    /**
     * 获取指定索引位置的元素
     *
     * @param index 要获取元素的索引
     * @return 指定位置的元素，索引无效时返回 null
     */
    public Object get(int index) {
        if (index < 0 || index >= total) {
            System.out.println("没有这个元素");
            return null;
        }
        return all[index];
    }
    
    /**
     * 创建并返回一个选择器对象，用于遍历列表
     *
     * @return 选择器对象
     */
    @Override
    public Selector select() {
        return new MySelector();
    }
    
    /**
     * 内部类：实现选择器接口，用于遍历列表元素
     */
    private class MySelector implements Selector {
        private int cursor;
        
        /**
         * 判断是否还有下一个元素
         *
         * @return 如果还有下一个元素返回 true，否则返回 false
         */
        @Override
        public boolean hasNext() {
            return cursor != total;
        }
        
        /**
         * 获取下一个元素并将游标后移
         *
         * @return 下一个元素
         */
        @Override
        public Object next() {
            return all[cursor++];
        }
    }
}