package com.example.lab2

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startbtn.setOnClickListener {
        val intent = Intent(this, com.example.lab2.game::class.java)
        startActivity(intent)
        }
        quitbtn.setOnClickListener{
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setMessage("Are you sure you would like to quit?")
                .setCancelable(false)

                .setPositiveButton("proceed", DialogInterface.OnClickListener{
                    dialog, id -> finish()
                })

                .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                dialog, id -> dialog.cancel()
                })

                val alert = dialogBuilder.create()
            // set title for alert dialog box
            alert.setTitle("AlertDialog")
            // show alert dialog
            alert.show()

        }

    }



}
