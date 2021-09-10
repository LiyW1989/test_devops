package com.lemon.day08_mapSet.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

/**
 * @Project: java31_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-21 21:03
 * @Desc：
 **/
public class HashMapLoop {
    public static void main(String[] args) {
        //Map遍历
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id",1);
        map.put("age",1);
        map.put("score",90);

//        System.out.println(map.get("id"));
//        System.out.println(map.get("age"));
//        System.out.println(map.get("score"));
        //1、键找值 keySet + get
        //keySet 获取所有的key  keySet() 返回 Set接口的实现类（HashSet）
//        Set<String> keySet = map.keySet();
//        for(String key : keySet) {
//            //通过key 找 value
//            Integer value = map.get(key);
//            System.out.println(key + "=" + value);
//        }
//        System.out.println(map.size() + "====================");
        //2、去除所有的键值对（3），键值对里面就包含了key和value
        /*
        *map.put("id",1);-> new Entry("id",1); -> set.add(entry1)set.add(entry2)set.add(entry3)
        * class Entry {
        *    String key;
        *    Integer value;
        * }
        * entrySet() --> set<Entry<String,Integer>>
        *
        * */
        //Set 集合中 存储了 Entry 对象， Entry对象 Key String 类型 value是Integer
        Set<Entry<String, Integer>> entries = map.entrySet();
        for(Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        //3、lambda 表达式 了解
        System.out.println("==========");
        map.forEach((key,value) -> {
            System.out.println(key+ "=" + value);
        });
    }
}
