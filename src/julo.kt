class julo{

    fun main(args: Array<String>) {
        write_down(arrayOf("Hello", "Candidate", "write", "it", "Vertically", "Down"))
    }
    fun write_down(words: Array<String>): Unit {

        var index = 0
        var isWhile = true

        while(isWhile){
            for (i in 0..words.size - 1) {
                val s = StringBuilder()
                if (i < words.get(index).length ){
                    s.append(words.get(index))
                }else{
                    s.append("")
                }

                if (!s.isEmpty()){
                    print(s.toString())
                }else{
                    isWhile = false
                }
            }

            println()
            index++
        }

    }
}