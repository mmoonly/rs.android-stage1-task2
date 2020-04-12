package subtask1

import java.lang.IllegalArgumentException
import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val calendar = GregorianCalendar()
            calendar.isLenient = false
            calendar.set(Calendar.DAY_OF_MONTH, day.toInt())
            calendar.set(Calendar.MONTH, month.toInt()-1)
            calendar.set(Calendar.YEAR, year.toInt())

            val returnDateFormat = SimpleDateFormat("d MMMM, EEEE", Locale("ru"))
            returnDateFormat.format(calendar.time)

        } catch (i: IllegalArgumentException){
            "Такого дня не существует"
        }
    }
}
