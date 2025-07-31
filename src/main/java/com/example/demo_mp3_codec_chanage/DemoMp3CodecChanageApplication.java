/*
package com.example.demo_mp3_codec_chanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoMp3CodecChanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMp3CodecChanageApplication.class, args);
    }

}
*/
package com.example.demo_mp3_codec_chanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})


public class DemoMp3CodecChanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMp3CodecChanageApplication.class, args);
    }

}
