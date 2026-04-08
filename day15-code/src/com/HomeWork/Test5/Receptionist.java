package com.HomeWork.Test5;

/**
 * 接待员类，负责使用过滤器对用户进行检查和处理
 */
public class Receptionist {
    private Filter filter;

    /**
     * 获取当前使用的过滤器
     *
     * @return 过滤器对象
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * 设置过滤器
     *
     * @param filter 要设置的过滤器对象
     */
    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * 构造方法，使用指定的过滤器创建接待员对象
     *
     * @param filter 过滤器对象
     */
    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    /**
     * 无参构造方法
     */
    public Receptionist() {
    }

    /**
     * 检查用户，如果已设置过滤器则对应用过滤器处理用户
     *
     * @param u 待检查的用户对象
     */
    public void checkUser(User u) {
        if (filter != null) {
            filter.filterUser(u);
        }
    }
}
