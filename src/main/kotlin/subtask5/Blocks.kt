package subtask5
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass


class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        when(blockB){
            Int::class -> {
                var res = 0
                for (i in blockA){
                    if (i is Int){
                        res+=i
                    }
                }
                return res
            }
            String::class -> {
                var res = ""
                for (i in blockA){
                    if (i is String){
                        res+=i
                    }
                }
                return res
            }
            else -> {
                var res = LocalDate.now()
                var check = false
                for (i in blockA) {
                    if (i is LocalDate) {
                        if ((!check) || (i > res)) {
                            check = true
                            res = i
                        }
                    }
                }
                return res.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }
        }
    }
}
