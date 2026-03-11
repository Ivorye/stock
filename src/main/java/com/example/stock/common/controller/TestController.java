package com.example.stock.common.controller;


import com.example.stock.common.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController
@Slf4j
public class TestController {
    @Autowired
    private Person person;

    @RequestMapping("/getinfo")
    public Person getinfo(){
        return person;
    }

    @PostMapping("/callingPython")
    public void callPython(){
        try {
            // 构建命令
            String command = "stock/src/main/resources/python/stockApplication.py";

            // 使用ProcessBuilder（推荐）
            ProcessBuilder pb = new ProcessBuilder("python", command);
            pb.redirectErrorStream(true);
            Process process = pb.start();

            // 读取脚本输出
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("Python脚本返回码: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
