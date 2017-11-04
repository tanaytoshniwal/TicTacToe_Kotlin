package com.example.alphabat69.tic_tac_toekt

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ImageButton

class Activity2 : AppCompatActivity(), View.OnClickListener {
    private var zero: ImageButton? = null
    private var one: ImageButton? = null
    private var two: ImageButton? = null
    private var three: ImageButton? = null
    private var four: ImageButton? = null
    private var five: ImageButton? = null
    private var six: ImageButton? = null
    private var seven: ImageButton? = null
    private var eight: ImageButton? = null
    private var layout = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0)
    private var chance = 9
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        zero = findViewById<ImageButton>(R.id.zero)
        one = findViewById<ImageButton>(R.id.one)
        two = findViewById<ImageButton>(R.id.two)
        three = findViewById<ImageButton>(R.id.three)
        four = findViewById<ImageButton>(R.id.four)
        five = findViewById<ImageButton>(R.id.five)
        six = findViewById<ImageButton>(R.id.six)
        seven = findViewById<ImageButton>(R.id.seven)
        eight = findViewById<ImageButton>(R.id.eight)

        zero?.setOnClickListener(this)
        one?.setOnClickListener(this)
        two?.setOnClickListener(this)
        three?.setOnClickListener(this)
        four?.setOnClickListener(this)
        five?.setOnClickListener(this)
        six?.setOnClickListener(this)
        seven?.setOnClickListener(this)
        eight?.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var b = false
        if (chance % 2 == 1)
            b = true
        when (v.id) {
            R.id.zero -> {
                if (b) {
                    //zero.setBackgroundColor(Color.BLUE);
                    zero?.setBackgroundResource(R.drawable.o)
                    layout[0]++
                } else {
                    zero?.setBackgroundResource(R.drawable.x)
                    layout[0] += 2
                }
                zero?.isClickable = false
            }
            R.id.one -> {
                if (b) {
                    one?.setBackgroundResource(R.drawable.o)
                    layout[1]++
                } else {
                    one?.setBackgroundResource(R.drawable.x)
                    layout[1] += 2
                }
                one?.isClickable = false
            }
            R.id.two -> {
                if (b) {
                    two?.setBackgroundResource(R.drawable.o)
                    layout[2]++
                } else {
                    two?.setBackgroundResource(R.drawable.x)
                    layout[2] += 2
                }
                two?.isClickable = false
            }
            R.id.three -> {
                if (b) {
                    three?.setBackgroundResource(R.drawable.o)
                    layout[3]++
                } else {
                    three?.setBackgroundResource(R.drawable.x)
                    layout[3] += 2
                }
                three?.isClickable = false
            }
            R.id.four -> {
                if (b) {
                    four?.setBackgroundResource(R.drawable.o)
                    layout[4]++
                } else {
                    four?.setBackgroundResource(R.drawable.x)
                    layout[4] += 2
                }
                four?.isClickable = false
            }
            R.id.five -> {
                if (b) {
                    five?.setBackgroundResource(R.drawable.o)
                    layout[5]++
                } else {
                    five?.setBackgroundResource(R.drawable.x)
                    layout[5] += 2
                }
                five?.isClickable = false
            }
            R.id.six -> {
                if (b) {
                    six?.setBackgroundResource(R.drawable.o)
                    layout[6]++
                } else {
                    six?.setBackgroundResource(R.drawable.x)
                    layout[6] += 2
                }
                six?.isClickable = false
            }
            R.id.seven -> {
                if (b) {
                    seven?.setBackgroundResource(R.drawable.o)
                    layout[7]++
                } else {
                    seven?.setBackgroundResource(R.drawable.x)
                    layout[7] += 2
                }
                seven?.isClickable = false
            }
            R.id.eight -> {
                if (b) {
                    eight?.setBackgroundResource(R.drawable.o)
                    layout[8]++
                } else {
                    eight?.setBackgroundResource(R.drawable.x)
                    layout[8] += 2
                }
                eight?.isClickable = false
            }
        }
        chance--
        result()
    }

    fun pass(b: Boolean) {
        var str = ""
        if (b)
            str = "Player One(OctoCat) Wins!"
        else
            str = "Player Two(Cross) Wins!"
        val builder: AlertDialog.Builder
        builder = AlertDialog.Builder(this@Activity2).setTitle("Congratulations!").setMessage(str)
                .setPositiveButton("OK") { dialog, which ->
                    startActivity(Intent(this@Activity2, Activity2::class.java))
                    finish()
                }
        val dialog = builder.create()
        dialog.setCanceledOnTouchOutside(false)
        dialog.setCancelable(false)
        dialog.show()
    }

    fun tie() {
        val builder: AlertDialog.Builder
        builder = AlertDialog.Builder(this@Activity2).setTitle("Oh bhai bhai bhai bhai!").setMessage("It's a tie!")
                .setPositiveButton("OK") { dialog, which ->
                    startActivity(Intent(this@Activity2, Activity2::class.java))
                    finish()
                }
        val dialog = builder.create()
        dialog.setCanceledOnTouchOutside(false)
        dialog.setCancelable(false)
        dialog.show()
    }

    fun result() {
        val ret = check()
        if (ret == 0 && chance == 0)
            tie()
    }

    fun check(): Int {
        var res = 0
        if (layout[0] == 1 && layout[1] == 1 && layout[2] == 1) {
            pass(true)
            res++
        } else if (layout[3] == 1 && layout[4] == 1 && layout[5] == 1) {
            pass(true)
            res++
        } else if (layout[6] == 1 && layout[7] == 1 && layout[8] == 1) {
            pass(true)
            res++
        } else if (layout[0] == 1 && layout[3] == 1 && layout[6] == 1) {
            pass(true)
            res++
        } else if (layout[1] == 1 && layout[4] == 1 && layout[7] == 1) {
            pass(true)
            res++
        } else if (layout[2] == 1 && layout[5] == 1 && layout[8] == 1) {
            pass(true)
            res++
        } else if (layout[0] == 1 && layout[4] == 1 && layout[8] == 1) {
            pass(true)
            res++
        } else if (layout[2] == 1 && layout[4] == 1 && layout[6] == 1) {
            pass(true)
            res++
        } else if (layout[0] == 2 && layout[1] == 2 && layout[2] == 2) {
            pass(false)
            res++
        } else if (layout[3] == 2 && layout[4] == 2 && layout[5] == 2) {
            pass(false)
            res++
        } else if (layout[6] == 2 && layout[7] == 2 && layout[8] == 2) {
            pass(false)
            res++
        } else if (layout[0] == 2 && layout[3] == 2 && layout[6] == 2) {
            pass(false)
            res++
        } else if (layout[1] == 2 && layout[4] == 2 && layout[7] == 2) {
            pass(false)
            res++
        } else if (layout[2] == 2 && layout[5] == 2 && layout[8] == 2) {
            pass(false)
            res++
        } else if (layout[0] == 2 && layout[4] == 2 && layout[8] == 2) {
            pass(false)
            res++
        } else if (layout[2] == 2 && layout[4] == 2 && layout[6] == 2) {
            pass(false)
            res++
        }
        return res
    }
}
