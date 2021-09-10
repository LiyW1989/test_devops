package com.lemon.day08_mapSet.map;

import java.util.HashMap;

/**
 * @Project: java31_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-21 20:36
 * @Desc：
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id",1);
        map.put("age",1);
        map.put("score",90);
//        System.out.println(map);
//        //get
//        System.out.println(map.get("id"));
//        System.out.println(map.get("age"));
        //key 不能重复   put 会覆盖原来的值
//        map.put("score",99);
//        System.out.println(map);
//        //containsKey 判断是否包含某个键  掌握！！！！！！！！！！！！！！！
//        //如果score不存在 ，存入 score 80 。如果score存在，存入 分数+1
//        if(!map.containsKey("score")) {
//            map.put("score",80);
//        }else {
//            Integer score = map.get("score");
//            map.put("score",score + 1);
//        }
//        System.out.println(map.size());
        //replace 替换值，前提key必须存在
//        map.replace("score1",100);
//        System.out.println(map);
        //如果key存在返回对应的值，如果key不存在返回默认值
//        System.out.println(map.getOrDefault("id123123123",0));
        //如果key存在也不存储，如果key不存在则存储。
//        map.putIfAbsent("id1",100);
//        System.out.println(map);
//        System.out.println(map);
//        System.out.println(map.values());
    }
}
