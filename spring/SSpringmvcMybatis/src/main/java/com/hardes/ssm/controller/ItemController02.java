package com.hardes.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hardes.ssm.domain.Items;

public class ItemController02 implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        //获取商品列表（用静态数据模拟）
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("联想笔记本 Controller");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);

        //实现Controller接口的话，就必须使用MoldeAndView对象来将数据装载到对应的jsp视图上，然后返回该对象即可
        //所以需要两步，将数据给该对象，将指定的视图在交给该对象，最后返回该对象即可。
        ModelAndView mv = new ModelAndView();
        //类似于request.setAttribute("itemsList", itemsList);
        mv.addObject("itemsList", itemsList);

        //指定视图 如果springmvc.xml 没有配置prefix 和suffix 则需要全路径名  "/WEB-INF/jsp/items/itemsList.jsp"
        mv.setViewName("items/itemsList");

        return mv;

    }

}
