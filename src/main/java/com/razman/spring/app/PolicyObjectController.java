package com.razman.spring.app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/commonPolicy")
public class PolicyObjectController {
	
	@PostMapping("/getPolicyData")
	
	public PolicyObjectBean savePolicyObject(@RequestBody PolicyObjectBean policyObject) {
		
		System.out.println("RAZMAN" + policyObject.getPolicyNo());
		return policyObject;
	}

}
