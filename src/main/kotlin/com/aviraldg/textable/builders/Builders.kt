package com.aviraldg.textable.builders

import com.aviraldg.textable.Alignment
import com.aviraldg.textable.Cell
import com.aviraldg.textable.Row
import com.aviraldg.textable.Textable

fun textable(
        rowSeparator: String = "\n",
        maxWidth: Int? = null,
        contents: Textable.() -> Unit): Textable {
    val t = Textable()
    t.rowSeparator = rowSeparator
    t.maxWidth = maxWidth
    t.contents()
    return t
}

fun Textable.row(contents: Row.() -> Unit): Row {
    var r = Row()
    rows.add(r)
    r.contents()
    return r
}

fun Row.cell(content: String = "",
             maxWidth: Int? = null,
             alignment: Alignment = Alignment.LEFT): Cell {
    var c = Cell(content)
    c.maxWidth = maxWidth
    c.alignment = alignment
    cells.add(c)
    return c
}