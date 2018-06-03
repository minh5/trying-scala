package com.app

import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(path = Array("/"))
class GreetingController() {
  @PostMapping(path = Array("/users"))
  def greeting(@RequestBody inboundObject: InboundObject): ResponseEntity[String] = {
    // business logic -> persist to kafka topic
    // do try-except here
    new ResponseEntity(inboundObject.name, HttpStatus.OK)
  }
  @GetMapping(path = Array("/getmessages"))
  def getmessages() //response entity would be an outbound object


// GOALS
// get mapping -> getting records from consumers
// have producer api into scala
// post mapping into producer