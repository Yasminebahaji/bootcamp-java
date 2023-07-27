package com.example.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ExampleController {

    @GetMapping("/data")
    @ResponseBody
    public MyData getData() {
        MyData data = new MyData("John", 30);
        return data;
    }

    // Clase de ejemplo para los datos
    private static class MyData {
        private String name;
        private int age;

        public MyData(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getters y setters (necesarios para la serialización JSON)
    }
}

