package de.sadrab.Mp17TheThievesDen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeEndpoint {
    @GetMapping
    String message() {
        return "<br/><br/><br/><br/><br/><br/><center><h1>Hohaha Come in...</h1>";
    }
}
