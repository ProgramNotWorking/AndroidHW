package com.example.androidhw.task2

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.androidhw.R

class ChargingNotificationWorker(
    context: Context, workerParams: WorkerParameters
) : Worker(context, workerParams) {

    private val notificationTitle = context.getString(R.string.device_on_charge)
    private val notificationContent = context.getString(R.string.charging_device)

    @RequiresApi(Build.VERSION_CODES.O)
    override fun doWork(): Result {
        val notificationManager =
            applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val channelId = WorkerChannelsConstants.CHARGING_CHANNEL_ID
        val channelName = WorkerChannelsConstants.CHARGING_CHANNEL_NAME
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(channelId, channelName, importance)
        notificationManager.createNotificationChannel(channel)

        val notification = NotificationCompat.Builder(applicationContext, channelId)
            .setContentTitle(notificationTitle)
            .setContentText(notificationContent)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()

        notificationManager.notify(1, notification)

        return Result.success()
    }

}