package HomeWork.demo2;

public interface CompareAble {
   default void compare(Apple a1, Apple a2){//默认方法,传入两个苹果对象,输出尺寸最大的那个苹果
       System.out.println("默认挑大的：");
       System.out.println(a1.getSize()>a2.getSize()?a1:a2);
    };
}
