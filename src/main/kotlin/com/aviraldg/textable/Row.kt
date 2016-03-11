package com.aviraldg.textable

import java.util.*

class Row {
    var cells = arrayListOf<Cell>()
    var cellSeparator = ""
    var columnPadding = 1

    override fun toString(): String {
        return render()
    }

    fun render(widths: List<Int>? = null): String {
        return cells.mapIndexed { i, cell -> cell.render(maxWidth=widths?.get(i) ?: null) }.joinToString(
                separator = cellSeparator + " ".repeat(columnPadding)
        )
    }

    fun measure(): ArrayList<Int> {
        return cells.map { it.measure() }.toArrayList()
    }
}