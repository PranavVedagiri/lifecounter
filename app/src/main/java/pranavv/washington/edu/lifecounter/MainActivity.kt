package pranavv.washington.edu.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loser : TextView = findViewById<View>(R.id.textView) as TextView

        //player 1
        val playerOne : TextView = findViewById<View>(R.id.Player1) as TextView
        val p1score : TextView = findViewById<View>(R.id.p1score) as TextView

        val p1PlusOne = findViewById<View>(R.id.p1plus1) as Button
        update(p1PlusOne, 1, p1score, playerOne, loser)

        val p1PlusFive = findViewById<View>(R.id.p1plus5) as Button
        update(p1PlusFive, 5, p1score, playerOne, loser)

        val p1MinusOne = findViewById<View>(R.id.p1minus1) as Button
        update(p1MinusOne, -1, p1score, playerOne, loser)

        val p1MinusFive = findViewById<View>(R.id.p1minus5) as Button
        update(p1MinusFive, -5, p1score, playerOne, loser)

        //player 2
        val playerTwo : TextView = findViewById<View>(R.id.Player2) as TextView
        val p2score : TextView = findViewById<View>(R.id.P2Score) as TextView

        val p2PlusOne = findViewById<View>(R.id.P2plus1) as Button
        update(p2PlusOne, 1, p2score, playerTwo, loser)

        val p2PlusFive = findViewById<View>(R.id.P2plus5) as Button
        update(p2PlusFive, 5, p2score, playerTwo, loser)

        val p2MinusOne = findViewById<View>(R.id.P2minus1) as Button
        update(p2MinusOne, -1, p2score, playerTwo, loser)

        val p2MinusFive = findViewById<View>(R.id.P2minus5) as Button
        update(p2MinusFive, -5, p2score, playerTwo, loser)

        //player 3
        val playerThree : TextView = findViewById<View>(R.id.Player3) as TextView
        val p3score : TextView = findViewById<View>(R.id.P3Score) as TextView

        val p3PlusOne = findViewById<View>(R.id.P3plus1) as Button
        update(p3PlusOne, 1, p3score, playerThree, loser)

        val p3PlusFive = findViewById<View>(R.id.P3Plus5) as Button
        update(p3PlusFive, 5, p3score, playerThree, loser)

        val p3MinusOne = findViewById<View>(R.id.P3minus1) as Button
        update(p3MinusOne, -1, p3score, playerThree, loser)

        val p3MinusFive = findViewById<View>(R.id.P3minus5) as Button
        update(p3MinusFive, -5, p3score, playerThree, loser)

        //player 4
        val playerFour : TextView = findViewById<View>(R.id.Player4) as TextView
        val p4score : TextView = findViewById<View>(R.id.P4Score) as TextView

        val p4PlusOne = findViewById<View>(R.id.P4plus1) as Button
        update(p4PlusOne, 1, p4score, playerFour, loser)

        val p4PlusFive = findViewById<View>(R.id.P4plus5) as Button
        update(p4PlusFive, 5, p4score, playerFour, loser)

        val p4MinusOne = findViewById<View>(R.id.P4negative1) as Button
        update(p4MinusOne, -1, p4score, playerFour, loser)

        val p4Minus5 = findViewById<View>(R.id.P4negative5) as Button
        update(p4Minus5, -5, p4score, playerFour, loser)


    }

    fun update(button: Button, score: Int, playerScore: TextView, player: TextView, loser: TextView){
        button.setOnClickListener{
            val finalScore = playerScore.getText().toString().toInt() + score
            playerScore.setText(finalScore.toString())
            if(finalScore <= 0){
                loser.setText(player.getText().toString() + " LOSES")
            }
        }
    }
}
