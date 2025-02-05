package com.example.androidhw.task3

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import kotlin.random.Random

class TouchFilledView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var fillPercentage = 0f
    private var fillColor = Color.RED
    private val paint = Paint().apply {
        style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.color = Color.LTGRAY
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)

        paint.color = fillColor
        val fillWidth = width * fillPercentage
        canvas.drawRect(0f, 0f, fillWidth, height.toFloat(), paint)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_DOWN) {
            updateFill()
            return true
        }
        return super.onTouchEvent(event)
    }

    private fun updateFill() {
        fillPercentage += 0.1f
        if (fillPercentage > 1f) {
            fillPercentage = 0f
        }
        fillColor = Color.rgb(
            Random.nextInt(256),
            Random.nextInt(256),
            Random.nextInt(256)
        )
        invalidate()
    }
}