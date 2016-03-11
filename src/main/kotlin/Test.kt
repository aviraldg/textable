import com.aviraldg.textable.builders.cell
import com.aviraldg.textable.builders.row
import com.aviraldg.textable.builders.textable

public fun main(args: Array<String>) {
    var t = textable {
        row {
            arrayOf("Name", "Quantity", "Price", "Total")
                .map {
                    cell(it)
                }
        }
        (1..10).forEach {
            row {
                cell("$it")
                cell("${'A'+it}")
                cell("$it")
                cell("${'A'+it}")
            }
        }
    }

    println(t)
}