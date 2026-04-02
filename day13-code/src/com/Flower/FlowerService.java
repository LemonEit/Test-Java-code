package com.Flower;

import java.util.List;

/**
 * 鲜花订单服务接口
 */
public interface FlowerService {

    /**
     * 查询所有订单
     *
     * @return 订单列表
     */
    List<FlowerMgr> getAllOrders();

    /**
     * 根据 ID 查询订单
     *
     * @param id 订单编号
     * @return 订单信息
     */
    FlowerMgr getOrderById(int id);

    /**
     * 添加订单
     *
     * @param order 订单信息
     * @return 是否成功
     */
    boolean addOrder(FlowerMgr order);

    /**
     * 更新订单
     *
     * @param order 订单信息
     * @return 是否成功
     */
    boolean updateOrder(FlowerMgr order);

    /**
     * 删除订单
     *
     * @param id 订单编号
     * @return 是否成功
     */
    boolean deleteOrder(int id);
}
