package com.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

import scala.com.app.util.SimpleConsumer

@SpringBootApplication
@ComponentScan(Array("com.app"))
class Application
object Application extends App {
  SpringApplication.run(classOf[Application])
  val array = Array("test1", "test2", "test3")
  val producer = new SimpleProducer(array,"testTopic")
  val consumer = new SimpleConsumer()
}