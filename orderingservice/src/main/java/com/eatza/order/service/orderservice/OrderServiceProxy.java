package com.eatza.order.service.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eatza.order.dto.ItemFetchDto;


@FeignClient(name = "restaurantsearchservice")
public interface OrderServiceProxy {
	@GetMapping("/item/id/{id}")
	public ItemFetchDto getItemById(@PathVariable(name="id") Long id);


}
