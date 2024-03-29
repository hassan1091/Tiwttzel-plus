package com.tiwttzel.hassanplus.data;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.tiwttzel.hassanplus.Activity.DownloadActivity;
import com.tiwttzel.hassanplus.R;

import java.util.Objects;

public class WorkForNotify extends Worker {
    private final String mChannelName = "notification_Download";
    int i = 0;

    public WorkForNotify(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {

        Data data = getInputData();
        displayNotification(data.getString(DownloadActivity.KEY_TWT_ID));
        Data dataOut = new Data.Builder()
                .putInt("asd", i + 1)
                .build();
        return Result.success(dataOut);
    }

    private void displayNotification(String id) {
        Context context = getApplicationContext();
        NotificationManager manager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel =
                    new NotificationChannel(mChannelName, mChannelName, NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, mChannelName);
        builder.setContentTitle(id)
                .setSmallIcon(R.mipmap.ic_twittzel_three);
        Objects.requireNonNull(manager).notify(1, builder.build());
    }
}
