package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_game.*
import java.util.*

class game : AppCompatActivity() {
    var diceimage: ImageButton? = null;
    var counter1 = 0
    var counter2 =0
    var counter3 = 0
    var counter4 =0
    var counter5 =0
    var counter6 =0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val rolldice: ImageButton= findViewById(R.id.imageButton)
        rolldice.setOnClickListener{ rollbutton()}
        diceimage =findViewById(R.id.imageButton)



    }
     private fun rollbutton() {
        val randomInt = Random().nextInt(6)+1
         Toast.makeText(this,"Dice: $randomInt", Toast.LENGTH_SHORT).show()
         val amount = when(randomInt){
           1-> {
               counter1++
               die1TV.text = "1: " + counter1
           }
           2-> { counter2++
               die2TV.text = "2: " + counter2
           }
             3->{
                 counter3++
                 die3TV.text = "3: " + counter3
             }
             4->{
                 counter4++
                 die4TV.text ="4: " + counter4
             }
             5->{
                 counter5++
                 die5TV.text ="5: "+counter5
             }
             else -> {
                 counter6++
                 die6TV.text= "6: "+ counter6
             }

         }
             /**button.setOnClickListener {
                counter1 =0
                 die1TV.text = "1: " + counter1
                 counter2 =0
                 die2TV.text = "2: " + counter2
                 counter3 = 0
                 die3TV.text = "3: " + counter3
                 counter4 = 0
                 die4TV.text = "4: " + counter4
                 counter5=0
                 die5TV.text = "5: " + counter5
                 counter6 =0
                 die6TV.text = "6: " + counter6
            }**/
         val drawaleResource = when(randomInt){
             1 -> R.drawable.die1
             2-> R.drawable.die2
             3-> R.drawable.die3
             4-> R.drawable.die4
             5->  R.drawable.die5

             else-> R.drawable.die6
         }
         diceimage?.setImageResource(drawaleResource)

        }

     fun delv(view: View) {

         counter1 =0
         die1TV.text = "1: " + counter1
         counter2 =0
         die2TV.text = "2: " + counter2
         counter3 = 0
         die3TV.text = "3: " + counter3
         counter4 = 0
         die4TV.text = "4: " + counter4
         counter5=0
         die5TV.text = "5: " + counter5
         counter6 =0
         die6TV.text = "6: " + counter6
     }
     }

