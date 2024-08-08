package marcelo.fiap.quadromedalhas

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class  QuadroMedalhas : Activity() {

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        Log.v("Quadro", "onCreate() executado")

        val btn = Button(this)
        btn.text = "Quadro Medalhas"
        setContentView(btn)
    }

    override fun onStart() {
        super.onStart()
        Log.v("Quadro", "onStart() executado")
    }

    override fun onResume() {
        super.onResume()
        Log.v("Quadro", "onResume() executado")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Quadro", "onPause() executado")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Quadro", "onStop() executado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Quadro", "onDestroy() executado")
    }
}