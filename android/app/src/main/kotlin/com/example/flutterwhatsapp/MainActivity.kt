package com.example.flutterwhatsapp

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
    fun doNothing() {
        if (b == 0) {  // Noncompliant
            doOneMoreThing()
        } else {
            doOneMoreThing()
        }
    }
}
