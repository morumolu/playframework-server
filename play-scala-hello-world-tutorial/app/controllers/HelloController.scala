package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HelloController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index(message: String) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.hello(message))
  }
}
