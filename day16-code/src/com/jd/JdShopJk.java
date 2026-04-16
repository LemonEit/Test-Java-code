package com.jd;

/**
 * 京东商城商品管理接口
 */
public interface JdShopJk {
    /**
     * 添加商品
     */
    void add();

    /**
     * 查看所有商品
     */
    void showAll();

    /**
     * 查看指定编号商品
     *
     * @return 商品在数组中的索引，未找到返回-1
     */
    int showOne();
}

/**
 * 购物车管理接口
 */
interface JdCartJk {
    /**
     * 添加到购物车
     */
    void addToCart();

    /**
     * 显示购物车
     */
    void showCart();
}

