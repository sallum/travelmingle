package controllers

import play.api.mvc._

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits._

import utils.{PredictionUtility, SparkMLLibUtility}

object Application extends Controller {

  def index = Action {
    Future{PredictionUtility.prediction}
    Ok(views.html.index(""))
  }

}
