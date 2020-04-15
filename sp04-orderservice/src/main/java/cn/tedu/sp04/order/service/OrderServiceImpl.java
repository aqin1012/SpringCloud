package cn.tedu.sp04.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.sp01.pojo.Order;
import cn.tedu.sp01.pojo.User;
import cn.tedu.sp01.service.OrderService;
import cn.tedu.sp04.order.feignclient.ItemFeignClient;
import cn.tedu.sp04.order.feignclient.UserFeignClient;
import cn.tedu.web.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

	@Autowired
	private ItemFeignClient itemService;
	@Autowired
	private UserFeignClient userService;
	@Override
	public Order getOrder(String orderId) {
		//TODO: 调用后台 item-service 服务,获取商品列表
		JsonResult<User> user=userService.getUser(7);
		//TODO: 调用后台 user-service 服务,获取用户信息
		JsonResult<List<Item>> items=itemService.getItems(orderId);
		
		Order order = new Order();
		order.setId(orderId);
		order.setUser(user.getData());
		order.setItems(items.getData());
		return order;
	}

	@Override
	public void addOrder(Order order) {
		//TODO: 调用后台 item-service 服务,减少商品库存
		itemService.decreaseNumber(order.getItems());
		
		//TODO: 调用后台 user-service 服务,增加用户集分
		userService.addScore(7, 100);
		
		log.info("保存订单: "+order);
	}

}
