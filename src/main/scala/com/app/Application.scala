package com.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.SpringApplication._
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(Array("com.app"))
class Application
object Application extends App {
  run(classOf[Application]);
}