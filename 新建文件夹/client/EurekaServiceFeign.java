package cn.tedu.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// ����ӿ��൱�ڰ�ԭ���ķ����ṩ����Ŀ����һ��Service��
@FeignClient(value="provider-user")
public interface EurekaServiceFeign {

	/*
	 * Feign��û��ԭ����@GetMapping/@PostMapping/@DeleteMapping/@PutMapping��Ҫָ����Ҫ��method����
	 */
	@RequestMapping(value="/hello/{name}",method=RequestMethod.GET)
	public String hello(@PathVariable("name") String name);
}
