package edu.knoldus

import org.apache.log4j.Logger

object Operations extends App {


  val log = Logger.getLogger(this.getClass)
  val operation1 = new Listoperation
  log.info(operation1.concatenationOfList(Constant.list1, Constant.list2))
  log.info(operation1.computingOfLength(Constant.list1))
  log.info(operation1.subsequence(Constant.list1,Constant.list4))

}
