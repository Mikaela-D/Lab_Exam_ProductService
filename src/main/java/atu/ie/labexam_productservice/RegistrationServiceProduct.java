package atu.ie.labexam_productservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(product = "confirmation-service", url = "http://localhost:8082")
public interface RegistrationServiceProduct {
    @PostMapping("/confirm")
    String addProduct(@RequestBody ProductDetails productDetails);

}
