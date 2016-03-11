package com.aviraldg.textable

class Cell(var content: String = "",
           var alignment: Alignment = Alignment.LEFT,
           var maxWidth: Int? = null) {

    fun render(maxWidth: Int? = null): String {
        val width = maxWidth ?: this.maxWidth ?: 0
        return "%${width}s".format(content)
    }

    override fun toString(): String {
        return render()
    }

    fun measure(): Int {
        return content.length
    }
}
