package com.hardes.ssm.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import com.hardes.ssm.domain.Items;


public class ItemController implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //获取商品列表（用静态数据模拟）
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("联想笔记本 HttpRequestHandler");
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
        //把商品数据放到request域中
        request.setAttribute("itemsList", itemsList);
        //指定视图 需要全路径名
        request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);

    }

}