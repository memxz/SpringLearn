package com.hardes.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.hardes.ssm.domain.Items;
@Controller
public class ItemController03 {

    @RequestMapping("/queryItems03")
    public ModelAndView queryItems() throws Exception {
        //获取商品列表（用静态数据模拟）
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("联想笔记本 Controller");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
        items_1.setCreatetime(new Date());

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");
        items_2.setCreatetime(new Date());

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
