package com.example.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class HelloWorldController {

//     @GetMapping("/")
//     public String home() {
//         return "<h1><b>Welcome to Telus Digital !!</b></h1>";
//     }
// }

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String home() {
        String poem = "<p><i>\"The woods are lovely, dark and deep,<br>" +
                      "But I have promises to keep,<br>" +
                      "And miles to go before I sleep,<br>" +
                      "And miles to go before I sleep.\"</i><br><br>" +
                      "- Robert Frost</p>";

        String welcomeMessage = "<h1><b>Welcome to Telus Digital !!</b></h1>";
        return poem + welcomeMessage;
    }
}
