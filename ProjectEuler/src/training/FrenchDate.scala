package training
import java.util.{Date,Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {
	def main(args: Array[String]){
	  val now = new Date
	  val df = getDateInstance(LONG,Locale.FRENCH)
	  println(df format now)
	}
}