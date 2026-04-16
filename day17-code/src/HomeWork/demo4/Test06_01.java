package HomeWork.demo4;

/**
 * 测试类：演示 MyArrayList 的基本功能
 */
public class Test06_01 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        /*
        * 添加元素
        * */
        list.add("10");
        list.add("老王");
        list.add("仓库");
        list.add("张三");



        list.remove(1);//删除1号位置的元素
        
        list.set(1, "老李");//修改1号位置的元素
        
        Object obj = list.get(1);//获取1号位置的元素
        System.out.println("1号位置元素: " + obj);//输出: 1号位置元素: 老王
        
        Selector selector = list.select();//创建选择器对象
        System.out.println("全部对象:");//输出: 全部对象:
        while (selector.hasNext()) {//判断是否还有下一个元素
            System.out.println(selector.next());//获取下一个元素并输出
        }
    }
}