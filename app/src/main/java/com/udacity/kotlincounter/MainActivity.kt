package com.udacity.kotlinfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.udemy.kotlincounter.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Increases the counter by 1 */
    fun increaseCounter(view: View) {
        counter++
        counter_text_view.text = counter.toString()
    }

    /** Decreases the counter by 1, until 0 is reached */
    fun decreaseCounter(view: View) {
        if (counter > 0) {
            counter--
        } else {
            Toast.makeText(
                baseContext, getString(R.string.toast_counter_below_one),
                Toast.LENGTH_SHORT
            ).show()
        }
        counter_text_view.text = counter.toString()
    }

    /** Resets the counter to 0 */
    fun resetCounter(view: View) {
        counter = 0
        counter_text_view.text = counter.toString()
        Toast.makeText(
            baseContext, getString(R.string.toast_reset),
            Toast.LENGTH_SHORT
        ).show()
    }
}