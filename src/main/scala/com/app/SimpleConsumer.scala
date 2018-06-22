package com.app //what is this

import java.util.concurrent._
import java.util.{Collections, Properties}

import kafka.consumer.KafkaStream
import kafka.utils.Logging
import org.apache.kafka.clients.consumer.{ConsumerConfig, KafkaConsumer}



object SimpleConsumer extends App {

  import java.util.Properties

  val TOPIC="test"

  val  props = new Properties()
  props.put("bootstrap.servers", "localhost:9092")

  props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  props.put("group.id", "something")

  val consumer = new KafkaConsumer[String, String](props)

  consumer.subscribe(util.Collections.singletonList(TOPIC))

  while(true){
    val records=consumer.poll(100)
    for (record<-records.asScala){
      println(record)
    }
  }
}