package HomeWork.demo3.Test5;

public class Test5 {
    public static void main(String[] args) {
        Filter V1Filter = new Filter() {
            @Override
            public void filterUser(User u) {
                u.setName("V1");
            }
        };
        
        Filter V2Filter = new Filter() {
            @Override
            public void filterUser(User u) {
                u.setName("V2");
            }
        };

        Filter AFilter = new Filter() {
            @Override
            public void filterUser(User u) {
                u.setName("A");
            }
        };
        
        User []user = new User[15];
        for (int i = 0; i < user.length; i++) {
            user[i]=new User(null, i+1);
        }

        //1号接待前5个用户,数组索引从0开始,所以5号的索引为4
        for (int i = 0; i <5; i++) {
            V1Filter.filterUser(user[i]);
        }

        // 2号第6到第10个用户
        for (int i = 5; i <10; i++) {
            V2Filter.filterUser(user[i]);
        }

        // 3号接待11-15用户
        for (int i = 10; i < 15; i++) {
            AFilter.filterUser(user[i]);
        }

        // 输出所有用户信息
        for (int i = 0; i < user.length; i++) {
            System.out.println(user[i]);
        }


    }
}
