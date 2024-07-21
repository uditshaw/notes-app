package com.example.notesapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Creating object for retrofit.
 * It will be a singleton object throughout the application, and will be defined
 * in the application class. So, hilt will be used here.
 */

@HiltAndroidApp
class NoteApplication: Application() {

}