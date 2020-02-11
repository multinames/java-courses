package app.controller;

import app.entity.Stub;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StubController {
    @PostMapping("/req")
    public String answer (@RequestBody Stub stub) {

        String str="\"statusCode\":1";

     return str;
    }
}
