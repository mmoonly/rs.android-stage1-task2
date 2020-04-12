package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val hArray = arrayOf("zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve")
        val mArray = arrayOf(
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine",
            "thirty")
        return when (minute.toInt()) {
            0 -> "${hArray[hour.toInt()]} o' clock"
            15 -> "quarter past ${hArray[hour.toInt()]}"
            30 -> "half past ${hArray[hour.toInt()]}"
            45 -> "quarter to ${hArray[hour.toInt() + 1]}"
            1 -> "one minute past ${hArray[hour.toInt()]}"
            in 1..30 -> "${mArray[minute.toInt() - 1]} minutes past ${hArray[hour.toInt()]}"
            in 31..60 -> "${mArray[60 - minute.toInt() - 1]} minutes to ${hArray[hour.toInt() + 1]}"
            else -> ""
        }
    }
}
