package com.app

import java.util.{Date, Properties}
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import scala.util.Random

object SimpleProducer(events: String, topics: String, brokers: String) {
  var events = events
  var topics = topics
  var brokers = brokers
  val props = new Properties()
  props.put("bootstrap.servers", "localhost:9092") //I think this is right
  props.put("client.id", "KafkaProducer")
  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

  val data = new ProducerRecord[String, String](topic, ip, msg)
  producer.send(data)

  /* I do something here but I'm not sure what
  for (nEvents <- Range(0, events)) {
    val runtime = new Date().getTime()
    val ip = "localhost:8080"
    val msg = runtime + "," + nEvents + ",www.example.com," + ip
    val data = new ProducerRecord[String, String](topic, ip, msg)
    producer.send(data)
  }
  */
  producer.close()
}
