package subtask3

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {
        var indexA = 0

        for(charInB in b){
            indexA = a.indexOf(ignoreCase = true, char = charInB, startIndex = indexA + 1)
            if(indexA == -1) return "NO"
        }

        return "YES"
    }
}
