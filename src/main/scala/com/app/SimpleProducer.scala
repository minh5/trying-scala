package com.app

import java.util.{Date, Properties}
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import scala.util.Random

class SimpleProducer(array: Array[String], top: String) {

  val topic = top
  val stringA = array
  val props = new Properties()
  props.put("bootstrap.servers", "localhost:9092") //I think this is right
  props.put("client.id", "KafkaProducerEx")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

  val producer = new KafkaProducer[String, String](props)
  val timeK = System.currentTimeMillis().toString
  for (e <- stringA) {
    val r = e.toUpperCase()
    val t = timeK
    val pRec = new ProducerRecord[String, String](topic, t, r)
    producer.send(pRec)
  }
}