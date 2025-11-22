package com.example.interfaces

import android.annotation.SuppressLint
import android.hardware.Sensor
import android.hardware.SensorManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.interfaces.Navigation.Navigation
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.database
//configruarion para acceder a la base de datos
val PATH_USERS = "users/"
val firebaseAuth = FirebaseAuth.getInstance()
val database = Firebase.database
class MainActivity : ComponentActivity() {
    //configuracion de sensor de luz y tambian empiza la aplicacion y los llega a la seccion de navegacion que los llevaria al login
    @SuppressLint("ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        val sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        val lightSensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Navigation()
        }
    }

}
