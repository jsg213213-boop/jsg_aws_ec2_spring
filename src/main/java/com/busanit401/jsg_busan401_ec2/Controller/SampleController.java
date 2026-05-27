package com.busanit401.jsg_busan401_ec2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping("/getArr")
    public String[] getArr() {
        return new String[]{"1", "2", "3"};
    }


}
