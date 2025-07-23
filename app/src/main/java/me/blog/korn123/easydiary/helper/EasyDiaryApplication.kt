package me.blog.korn123.easydiary.helper

import android.content.Context
import androidx.multidex.MultiDexApplication
import com.instabug.library.Instabug
import com.instabug.library.invocation.InstabugInvocationEvent
import io.realm.Realm

/**
 * Created by CHO HANJOONG on 2017-03-16.
 */

class EasyDiaryApplication : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        context = this
        Instabug.Builder(this, "a6a199b9b3d88554152cd93a32f16034")
            .setInvocationEvents(
                InstabugInvocationEvent.FLOATING_BUTTON,
                InstabugInvocationEvent.SHAKE,
                InstabugInvocationEvent.SCREENSHOT
            )
            .build()
    }

    companion object {
        var context: Context? = null
    }
}
