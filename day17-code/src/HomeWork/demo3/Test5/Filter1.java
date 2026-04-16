package HomeWork.demo3.Test5;

/**
 * V1版本的用户过滤器
 * 将用户名称设置为"V1"
 */
public class Filter1 {

    Filter V1Filter = new Filter() {
        /**
         * 过滤用户，将用户名称设置为"V1"
         *
         * @param u 待过滤的用户对象
         */
        @Override
        public void filterUser(User u) {
            u.setName("V1");
        }
    };

    /**
     * V2版本的用户过滤器
     * 将用户名称设置为"V2"
     */
    Filter V2Filter = new Filter() {
        /**
         * 过滤用户，将用户名称设置为"V2"
         *
         * @param u 待过滤的用户对象
         */
        @Override
        public void filterUser(User u) {
            u.setName("V2");
        }
    };

    /**
     * A版本的用户过滤器
     * 将用户名称设置为"A"
     */
    Filter AFilter = new Filter() {
        /**
         * 过滤用户，将用户名称设置为"A"
         *
         * @param u 待过滤的用户对象
         */
        @Override
        public void filterUser(User u) {
            u.setName("A");
        }
    };
}