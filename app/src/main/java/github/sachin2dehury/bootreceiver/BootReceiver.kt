package github.sachin2dehury.bootreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_BOOT_COMPLETED) {
            Log.e("Preeti", "Booted")
            Intent(context, MainActivity::class.java).also {
                context?.startActivity(it)
            }
        }
    }
}