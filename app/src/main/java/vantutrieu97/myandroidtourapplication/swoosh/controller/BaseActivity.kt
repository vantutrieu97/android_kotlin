package vantutrieu97.myandroidtourapplication.swoosh.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "${javaClass.simpleName} onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "${javaClass.simpleName} onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "${javaClass.simpleName} onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "${javaClass.simpleName} onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "${javaClass.simpleName} onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "${javaClass.simpleName} onDestroy")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "${javaClass.simpleName} onRestart")
    }
}
