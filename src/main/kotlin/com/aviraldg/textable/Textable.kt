package com.aviraldg.textable

import com.aviraldg.textable.builders.row
import java.util.*

class Textable {
    var maxWidth: Int? = null
    var rows = arrayListOf<Row>()
    var rowSeparator = "\n"

    fun measure(): ArrayList<Int> {
        var columnWidthList = rows.map {
            it.measure()
        }

        var maxWidths = columnWidthList.first()

        columnWidthList.forEach {
            it.forEachIndexed { i, width ->
                maxWidths[i] = Math.max(maxWidths[i], width)
            }
        }

        return maxWidths
    }

    fun render(): String {
        var maxWidths = measure()
        return rows.map { it.render(maxWidths) }.joinToString(
                separator = rowSeparator
        )
    }

    override fun toString(): String {
        return render()
    }
}
