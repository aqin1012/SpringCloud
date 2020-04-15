package cn.tedu.sp04.order.feignclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import cn.tedu.sp01.pojo.Item;
import cn.tedu.web.util.JsonResult;

@Component
public class ItemFeignServiceFB implements ItemFeignClient{

	@Override
	public JsonResult<List<Item>> getItems(String orderId) {
		//模拟服务不通，从缓存中获取数据
		if(Math.random()<0.5) {
			return JsonResult.ok().data(
					Arrays.asList(new Item[] {
							new Item(1,"缓存111",2),
							new Item(2,"缓存222",1),
							new Item(3,"缓存333",5),
					})
					);
		}
		return JsonResult.err("无法获取订单商品列表");
	}

	@Override
	public JsonResult decreaseNumber(List<Item> items) {
		return JsonResult.err("无法修改商品库存");
	}
	
}
