package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class FizzBuzzController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def calc(number: Int) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.FizzBuzz(toFizzBuzzString(number)))
  }

  def toFizzBuzzString(number: Int): String = {
    number match {
      case n if n % 3 == 0 && n % 5 == 0 => "fizz buzz"
      case n if n % 3 == 0  => "fizz"
      case n if n % 5 == 0 => "buzz"
      case _ => number.toString
    }
  }
//  def toFizzBuzzString(number: Int): String = {
//    if (number % 15 == 0) {
//      "fizz buzz"
//    } else if (number % 3 == 0) {
//      "fizz"
//    } else if (number % 5 == 0) {
//      "buzz"
//    } else {
//      number.toString
//    }
//  }
}