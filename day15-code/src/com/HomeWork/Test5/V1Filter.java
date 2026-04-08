package com.HomeWork.Test5;

/**
 * V1版本的用户过滤器
 * 将用户名称设置为"V1"
 */
public class V1Filter implements Filter {
    /**
     * 过滤用户，将用户名称设置为"V1"
     *
     * @param u 待过滤的用户对象
     */
    @Override
    public void filterUser(User u) {
        u.setName("V1");
    }
}

/**
 * V2版本的用户过滤器
 * 将用户名称设置为"V2"
 */
class V2Filter implements Filter {
    /**
     * 过滤用户，将用户名称设置为"V2"
     *
     * @param u 待过滤的用户对象
     */
    @Override
    public void filterUser(User u) {
        u.setName("V2");
    }
}

/**
 * A版本的用户过滤器
 * 将用户名称设置为"A"
 */
class AFilter implements Filter {
    /**
     * 过滤用户，将用户名称设置为"A"
     *
     * @param u 待过滤的用户对象
     */
    @Override
    public void filterUser(User u) {
        u.setName("A");
    }
}