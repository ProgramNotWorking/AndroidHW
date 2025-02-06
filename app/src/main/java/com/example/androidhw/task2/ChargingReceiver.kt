package com.example.androidhw.task2

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver

@SuppressLint("RestrictedApi")
class ChargingReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_POWER_CONNECTED -> {
                val workRequest = OneTimeWorkRequest.Builder(
                    ChargingNotificationWorker::class.java
                ).build()
                WorkManager.getInstance(context).enqueue(workRequest)
            }
        }
    }

}