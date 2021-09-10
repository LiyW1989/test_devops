package com.lemon.day08_mapSet.map;

import java.util.*;

/**
 * @Project: java31_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 湖南省零檬信息技术有限公司
 * @Author: luojie
 * @Create: 2021-07-21 21:38
 * @Desc：
 **/
public class CollectionPolymorphism {

    int a ;
    String b;
    //如果成员尽量使用多态。
    List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        //多态的方式创建集合
//        ArrayList<String> list = new ArrayList<>();
        //多态 扩展性
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String,String> map = new HashMap<>();

//        list = new LinkedList<>();
    }
}
