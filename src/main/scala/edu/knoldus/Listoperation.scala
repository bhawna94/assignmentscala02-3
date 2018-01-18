package edu.knoldus

class Listoperation {

  def concatenationOfList[T](list1: List[T], list2: List[T]): List[T] = {
    list1 match {

      case element1 :: remainingelements => element1 :: concatenationOfList(remainingelements,list2)
      case _ => list2
    }
  }


  def subsequence(list: List[Int], sublist: List[Int]): Boolean = {

    val list2 = sublist

    def innersubsequence(list: List[Int], sublist: List[Int], count: Int): Boolean = {


      list match {

        case head :: tail if (sublist.head == list.head) => innersubsequence(list.tail, sublist.tail,count + 1)
        case head :: tail if (sublist.head != list.head) => innersubsequence(list.tail, list2 ,0)
        case Nil if(count == sublist.length) =>true
        case Nil if(count != sublist.length) => false
      }
    }
    innersubsequence(list,sublist,0)
  }

  def computingOfLength[T](list: List[T]): Int ={
    list.foldRight(0)((_,count)=> count + 1)

  }

}

