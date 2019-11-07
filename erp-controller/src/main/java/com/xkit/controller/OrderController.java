package com.xkit.controller;


import com.xkit.pojo.Emp;
import com.xkit.pojo.Menu;
import com.xkit.pojo.Orders;
import com.xkit.service.IMenuService;
import com.xkit.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Scope("prototype")
public class OrderController {

    @Autowired
    private IOrdersService ordersService;

    @RequestMapping("/toAddOrderPage")
    public String toAddOrderPage(){
        return "order_add";
    }

    @RequestMapping("/toOrdersPage")
    public String toOrdersPage(){
        return "orders";
    }


    @RequestMapping("/orders_listByPage.do")
    @ResponseBody
    public List<Orders> queryOrders(){
        List<Orders> ordersList = ordersService.queryOrders();
        return ordersList;
    }
}
