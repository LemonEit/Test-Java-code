package com.deno;
/**
 * @Description: 数组增删改查
 *
 * */

public abstract class ArrayCRUD {
    /**
     * @Description: 数组增删改查类
     *
     * */
    public abstract void add(int index, Object obj);// 添加
    public abstract void delete(int index);// 删除
    public abstract void update(int index, Object obj);// 修改
    public abstract Object query(int index);// 查询
}
class ArrayCRUDImpl extends ArrayCRUD {
    @Override
    public void add(int index, Object obj) {

        System.out.println("添加成功");

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void update(int index, Object obj) {

    }

    @Override
    public Object query(int index) {
        return null;
    }
}
