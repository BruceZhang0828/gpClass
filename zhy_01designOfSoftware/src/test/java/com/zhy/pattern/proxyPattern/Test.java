package com.zhy.pattern.proxyPattern;

import java.util.*;

/**
 * @ClassName: Test
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/5/9 16:21
 * @Version: 1.0
 **/
public class Test {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setKey("key1");
        user1.setName("name1");
        User user2 = new User();
        user2.setKey("key2");
        user2.setName("name2");
        User user3 = new User();
        user3.setKey("key3");
        user3.setName("name3");
        User user4 = new User();
        user4.setKey("key1");
        user4.setName("name1");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        List<User> users1 = distinctList(users);
        System.out.println(users1.size());

    }


    public static List<User> distinctList(List<User> taskKeyAndTaskNameList) {

        if (taskKeyAndTaskNameList!=null&&!taskKeyAndTaskNameList.isEmpty()){
            Set<User> set = new TreeSet<User>(new Comparator<User>() {
                @Override
                public int compare(User p1, User p2) {
                    //字符串,则按照asicc码升序排列
                    return p1.getKey().compareTo(p2.getKey());
                }
            });
            set.addAll(taskKeyAndTaskNameList);

            return new ArrayList<User>(set);
        }

        return null;
    }


    static class User{
        private String key;
        private String name;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
