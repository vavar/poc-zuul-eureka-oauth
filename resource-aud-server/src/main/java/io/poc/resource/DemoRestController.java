package io.poc.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoRestController {

    @GetMapping("/info")
    public String info() {
        return "this is resource-aud-server";
    }
}
