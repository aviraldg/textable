import com.aviraldg.textable.builders.cell
import com.aviraldg.textable.builders.row
import com.aviraldg.textable.builders.textable
import org.junit.Test
import kotlin.test.assertEquals

class TestBasic {
    @Test
    fun testBasic() {
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
        assertEquals(t.toString(), """Name Quantity Price Total
   1        B     1     B
   2        C     2     C
   3        D     3     D
   4        E     4     E
   5        F     5     F
   6        G     6     G
   7        H     7     H
   8        I     8     I
   9        J     9     J
  10        K    10     K""")
    }
}