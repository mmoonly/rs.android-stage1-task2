package subtask4

class Pangram {

    fun getResult(inputString: String): String {
        val vowels = arrayOf('A', 'E', 'I', 'O', 'U', "Y", 'a', 'e', 'i', 'o', 'u', 'y')
        val str = inputString.split(" ").filter { it.isNotEmpty() && it[0] !='\n' }.sortedBy {
            if(isPangram(inputString)) numberOfVowels(it, vowels)
            else notVowels(it, vowels)
        }

        val result = ArrayList<String>()
        if (isPangram(inputString)) {
            str.forEach {
                val temp = StringBuilder()
                var counter = 0
                for (c in it) {
                    if (vowels.contains(c)) {
                        counter++
                        temp.append(c.toUpperCase())
                    } else temp.append(c)
                }

                temp.insert(0, counter.toString())
                result.add(temp.toString())
            }
        } else {
            str.forEach {
                val temp = StringBuilder()
                var counter = 0
                for (c in it) {
                    if (c.isLetter() && !vowels.contains(c)) {
                        counter++
                        temp.append(c.toUpperCase())
                    } else temp.append(c)
                }

                temp.insert(0, counter.toString())
                result.add(temp.toString())
            }
        }
        return result.joinToString(" ")
    }

    private fun notVowels(s: String, vowels: Array<*>): Int {
        var counter = 0
        for(i in s.indices){
            if(s[i].isLetter() && !vowels.contains(s[i])){
                counter++
            }
        }
        return counter
    }

    private fun numberOfVowels(s: String, vowels: Array<*>):Int{
        var counter = 0
        for(i in s.indices){
            if(vowels.contains(s[i])){
                counter++
            }
        }
        return counter
    }

    private fun isPangram(s: String): Boolean {
        val check = Array(26) { false }
        for (i in s.indices) {
            if (s[i].isLetter()) {
                check[s[i].toLowerCase() - 'a'] = true
            }
        }
        return !check.contains(false)
    }
}