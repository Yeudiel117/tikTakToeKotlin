package com.example.gato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var btnArribaIzquierda: Button? = null
    var btnArribaMedio: Button? = null
    var btnArribaDerecha: Button? = null
    var btnMedioIzquierda: Button? = null
    var btnMedioMedio: Button? = null
    var btnMedioDerecha: Button? = null
    var btnAbajoIzquierda: Button? = null
    var btnAbajoMedio: Button? = null
    var btnAbajoDerecha: Button? = null
    var barraProgreso: ProgressBar? = null
    var txtLabel: TextView? = null
    var txtVictoriasX: TextView? = null
    var txtDerrotas: TextView? = null
    var txtEmpates: TextView? = null

    var mContador: CountDownTimer? = null

    var primerPresionado: Boolean = false
    var finTurno: Boolean = false
    var turnoX: Boolean = false
    var turnoO: Boolean = false
    var turnoXSaltado: Boolean = false

    var btn1Presionado: Boolean = false
    var btn2Presionado: Boolean = false
    var btn3Presionado: Boolean = false
    var btn4Presionado: Boolean = false
    var btn5Presionado: Boolean = false
    var btn6Presionado: Boolean = false
    var btn7Presionado: Boolean = false
    var btn8Presionado: Boolean = false
    var btn9Presionado: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnArribaIzquierda = findViewById(R.id.btnArribaIzquierda)
        btnArribaMedio = findViewById(R.id.btnArribaMedio)
        btnArribaDerecha = findViewById(R.id.btnArribaDerecha)
        btnMedioIzquierda = findViewById(R.id.btnMedioIzquierda)
        btnMedioMedio = findViewById(R.id.btnMedioMedio)
        btnMedioDerecha = findViewById(R.id.btnMedioDerecha)
        btnAbajoIzquierda = findViewById(R.id.btnAbajoIzquierda)
        btnAbajoMedio = findViewById(R.id.btnAbajoMedio)
        btnAbajoDerecha = findViewById(R.id.btnAbajoDerecha)
        barraProgreso = findViewById(R.id.progressBar)
        txtLabel = findViewById(R.id.textView2)
        txtVictoriasX = findViewById(R.id.txtVictoriasX)
        txtDerrotas = findViewById(R.id.txtDerrotas)
        txtEmpates = findViewById(R.id.txtEmpates)

        var contador = 0
        var victorias = 0
        var derrotas = 0
        var mensaje = ""
        var empates = 0

        barraProgreso!!.progress = contador
        mContador = object : CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilfFinished: Long) {
                barraProgreso!!.progress = (contador * 100 / (5000 / 1000))
                txtLabel!!.text = "Tiempo ${5 - contador} segundos"+mensaje
                contador++
            }

            override fun onFinish() {
                barraProgreso!!.progress = (100)
                contador = 0
                mContador!!.cancel()
                mContador!!.start()


                if(btnArribaIzquierda!!.text == "X" && btnMedioIzquierda!!.text == "X" && btnAbajoIzquierda!!.text == "X"){
                    victorias++
                    txtVictoriasX!!.text = victorias.toString()
                    Toast.makeText(applicationContext,"Gano el jugador X", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaMedio!!.text == "X" && btnMedioMedio!!.text == "X" && btnAbajoMedio!!.text == "X"){
                    victorias++
                    txtVictoriasX!!.text = victorias.toString()
                    Toast.makeText(applicationContext,"Gano el jugador X", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaDerecha!!.text == "X" && btnMedioDerecha!!.text == "X" && btnAbajoDerecha!!.text == "X"){
                    victorias++
                    txtVictoriasX!!.text = victorias.toString()
                    Toast.makeText(applicationContext,"Gano el jugador X", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaIzquierda!!.text == "X" && btnMedioMedio!!.text == "X" && btnAbajoDerecha!!.text == "X"){
                    victorias++
                    txtVictoriasX!!.text = victorias.toString()
                    Toast.makeText(applicationContext,"Gano el jugador X", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaDerecha!!.text == "X" && btnMedioMedio!!.text == "X" && btnAbajoIzquierda!!.text == "X"){
                    victorias++
                    txtVictoriasX!!.text = victorias.toString()
                    Toast.makeText(applicationContext,"Gano el jugador X", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaIzquierda!!.text == "X" && btnArribaMedio!!.text == "X" && btnArribaDerecha!!.text == "X"){
                    victorias++
                    txtVictoriasX!!.text = victorias.toString()
                    Toast.makeText(applicationContext,"Gano el jugador X", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnMedioIzquierda!!.text == "X" && btnMedioMedio!!.text == "X" && btnMedioDerecha!!.text == "X"){
                    victorias++
                    txtVictoriasX!!.text = victorias.toString()
                    Toast.makeText(applicationContext,"Gano el jugador X", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnAbajoIzquierda!!.text == "X" && btnAbajoMedio!!.text == "X" && btnAbajoDerecha!!.text == "X"){
                    victorias++
                    txtVictoriasX!!.text = victorias.toString()
                    Toast.makeText(applicationContext,"Gano el jugador X", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaIzquierda!!.text == "0" && btnMedioIzquierda!!.text == "0" && btnAbajoIzquierda!!.text == "0"){
                    derrotas++
                    txtDerrotas!!.text = derrotas.toString()
                    Toast.makeText(applicationContext,"Gano el jugador O", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaMedio!!.text == "0" && btnMedioMedio!!.text == "0" && btnAbajoMedio!!.text == "0"){
                    derrotas++
                    txtDerrotas!!.text = derrotas.toString()
                    Toast.makeText(applicationContext,"Gano el jugador O", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaDerecha!!.text == "0" && btnMedioDerecha!!.text == "0" && btnAbajoDerecha!!.text == "0"){
                    derrotas++
                    txtDerrotas!!.text = derrotas.toString()
                    Toast.makeText(applicationContext,"Gano el jugador O", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaIzquierda!!.text == "0" && btnMedioMedio!!.text == "0" && btnAbajoDerecha!!.text == "0"){
                    derrotas++
                    txtDerrotas!!.text = derrotas.toString()
                    Toast.makeText(applicationContext,"Gano el jugador O", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaDerecha!!.text == "0" && btnMedioMedio!!.text == "0" && btnAbajoIzquierda!!.text == "0"){
                    derrotas++
                    txtDerrotas!!.text = derrotas.toString()
                    Toast.makeText(applicationContext,"Gano el jugador O", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnArribaIzquierda!!.text == "0" && btnArribaMedio!!.text == "0" && btnArribaDerecha!!.text == "0"){
                    derrotas++
                    txtDerrotas!!.text = derrotas.toString()
                    Toast.makeText(applicationContext,"Gano el jugador O", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnMedioIzquierda!!.text == "0" && btnMedioMedio!!.text == "0" && btnMedioDerecha!!.text == "0"){
                    derrotas++
                    txtDerrotas!!.text = derrotas.toString()
                    Toast.makeText(applicationContext,"Gano el jugador O", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btnAbajoIzquierda!!.text == "0" && btnAbajoMedio!!.text == "0" && btnAbajoDerecha!!.text == "0") {
                    derrotas++
                    txtDerrotas!!.text = derrotas.toString()
                    Toast.makeText(applicationContext, "Gano el jugador O", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else if(btn1Presionado == true && btn2Presionado == true && btn3Presionado == true && btn4Presionado == true && btn5Presionado == true && btn6Presionado == true && btn7Presionado == true && btn8Presionado == true && btn9Presionado == true){
                    empates++
                    txtEmpates!!.text = empates.toString()
                    Toast.makeText(applicationContext, "EMPATE!", Toast.LENGTH_LONG).show()
                    reiniciar()
                    mensaje = " antes del juego nuevo"
                    finTurno = true
                }else {
                    finTurno = false
                    mensaje =""
                }

                var x = Random.nextInt(1, 10)
                //Turno del bot
                while (finTurno == false) {
                    if (primerPresionado == true) {
                        if (x == 1) {
                            if (btn1Presionado == false) {
                                if(turnoX == true){
                                    btnArribaIzquierda!!.text = "X"
                                    btn1Presionado = true
                                    turnoX = false
                                    turnoO = true
                                    turnoXSaltado = false
                                    finTurno = true
                                }else{
                                    if(turnoO == true) {
                                        btnArribaIzquierda!!.text = "0"
                                        btn1Presionado = true
                                        turnoO = false
                                        turnoX = true
                                        finTurno = true
                                    }
                                }
                            } else {
                                x = Random.nextInt(1, 10)
                            }
                        } else {
                            if (x == 2) {
                                if (btn2Presionado == false) {
                                    if(turnoX == true){
                                        btnArribaMedio!!.text = "X"
                                        btn2Presionado = true
                                        turnoX = false
                                        turnoO = true
                                        turnoXSaltado = false
                                        finTurno = true
                                    }else{
                                        if(turnoO == true) {
                                            btnArribaMedio!!.text = "0"
                                            btn2Presionado = true
                                            turnoO = false
                                            turnoX = true
                                            finTurno = true
                                        }
                                    }
                                } else {
                                    x = Random.nextInt(1, 10)
                                }
                            } else {
                                if (x == 3) {
                                    if (btn3Presionado == false) {
                                        if(turnoX == true){
                                            btnArribaDerecha!!.text = "X"
                                            btn3Presionado = true
                                            turnoX = false
                                            turnoO = true
                                            turnoXSaltado = false
                                            finTurno = true
                                        }else{
                                            if(turnoO == true) {
                                                btnArribaDerecha!!.text = "0"
                                                btn3Presionado = true
                                                turnoO = false
                                                turnoX = true
                                                finTurno = true
                                            }
                                        }
                                    } else {
                                        x = Random.nextInt(1, 10)
                                    }
                                } else {
                                    if (x == 4) {
                                        if (btn4Presionado == false) {
                                            if(turnoX == true){
                                                btnMedioIzquierda!!.text = "X"
                                                btn4Presionado = true
                                                turnoX = false
                                                turnoO = true
                                                turnoXSaltado = false
                                                finTurno = true
                                            }else{
                                                if(turnoO == true) {
                                                    btnMedioIzquierda!!.text = "0"
                                                    btn4Presionado = true
                                                    turnoO = false
                                                    turnoX = true
                                                    finTurno = true
                                                }
                                            }
                                        } else {
                                            x = Random.nextInt(1, 10)
                                        }
                                    } else {
                                        if (x == 5) {
                                            if (btn5Presionado == false) {
                                                if(turnoX == true){
                                                    btnMedioMedio!!.text = "X"
                                                    btn5Presionado = true
                                                    turnoX = false
                                                    turnoO = true
                                                    turnoXSaltado = false
                                                    finTurno = true
                                                }else{
                                                    if(turnoO == true) {
                                                        btnMedioMedio!!.text = "0"
                                                        btn5Presionado = true
                                                        turnoO = false
                                                        turnoX = true
                                                        finTurno = true
                                                    }
                                                }
                                            } else {
                                                x = Random.nextInt(1, 10)
                                            }
                                        } else {
                                            if (x == 6) {
                                                if (btn6Presionado == false) {
                                                    if(turnoX == true){
                                                        btnMedioDerecha!!.text = "X"
                                                        btn6Presionado = true
                                                        turnoX = false
                                                        turnoO = true
                                                        turnoXSaltado = false
                                                        finTurno = true
                                                    }else{
                                                        if(turnoO == true) {
                                                            btnMedioDerecha!!.text = "0"
                                                            btn6Presionado = true
                                                            turnoO = false
                                                            turnoX = true
                                                            finTurno = true
                                                        }
                                                    }
                                                } else {
                                                    x = Random.nextInt(1, 10)
                                                }
                                            } else {
                                                if (x == 7) {
                                                    if (btn7Presionado == false) {
                                                        if(turnoX == true){
                                                            btnAbajoIzquierda!!.text = "X"
                                                            btn7Presionado = true
                                                            turnoX = false
                                                            turnoO = true
                                                            turnoXSaltado = false
                                                            finTurno = true
                                                        }else{
                                                            if(turnoO == true) {
                                                                btnAbajoIzquierda!!.text = "0"
                                                                btn7Presionado = true
                                                                turnoO = false
                                                                turnoX = true
                                                                finTurno = true
                                                            }
                                                        }
                                                    } else {
                                                        x = Random.nextInt(1, 10)
                                                    }
                                                } else {
                                                    if (x == 8) {
                                                        if (btn8Presionado == false) {
                                                            if(turnoX == true){
                                                                btnAbajoMedio!!.text = "X"
                                                                btn8Presionado = true
                                                                turnoX = false
                                                                turnoO = true
                                                                turnoXSaltado = false
                                                                finTurno = true
                                                            }else{
                                                                if(turnoO == true) {
                                                                    btnAbajoMedio!!.text = "0"
                                                                    btn8Presionado = true
                                                                    turnoO = false
                                                                    turnoX = true
                                                                    finTurno = true
                                                                }
                                                            }
                                                        } else {
                                                            x = Random.nextInt(1, 10)
                                                        }
                                                    } else {
                                                        if (x == 9) {
                                                            if (btn9Presionado == false) {
                                                                if(turnoX == true){
                                                                    btnAbajoDerecha!!.text = "X"
                                                                    btn9Presionado = true
                                                                    turnoX = false
                                                                    turnoO = true
                                                                    turnoXSaltado = false
                                                                    finTurno = true
                                                                }else{
                                                                    if(turnoO == true) {
                                                                        btnAbajoDerecha!!.text = "0"
                                                                        btn9Presionado = true
                                                                        turnoO = false
                                                                        turnoX = true
                                                                        finTurno = true
                                                                    }
                                                                }
                                                            } else {
                                                                x = Random.nextInt(1, 10)
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Primer presionada y turno del jugador
        btnArribaIzquierda!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnArribaIzquierda!!.text = "X"
                btn1Presionado = true
                primerPresionado = true
                turnoO = true
                mContador!!.start()
            }else{
                if (turnoX == true) {
                    if (btn1Presionado == false) {
                        btnArribaIzquierda!!.text = "X"
                        btn1Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
        }
        btnArribaMedio!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnArribaMedio!!.text = "X"
                primerPresionado = true
                btn2Presionado = true
                turnoO = true
                mContador!!.start()
            }else{
                if (turnoX == true) {
                    if (btn2Presionado == false) {
                        btnArribaMedio!!.text = "X"
                        btn2Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
        }
        btnArribaDerecha!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnArribaDerecha!!.text = "X"
                primerPresionado = true
                btn3Presionado = true
                turnoO = true
                mContador!!.start()
            }else{
                if (turnoX == true) {
                    if (btn3Presionado == false) {
                        btnArribaDerecha!!.text = "X"
                        btn3Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
        }
        btnMedioIzquierda!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnMedioIzquierda!!.text = "X"
                primerPresionado = true
                btn4Presionado = true
                turnoO = true
                mContador!!.start()
            }else{
                if (turnoX == true) {
                    if (btn4Presionado == false) {
                        btnMedioIzquierda!!.text = "X"
                        btn4Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
        }
        btnMedioMedio!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnMedioMedio!!.text = "X"
                primerPresionado = true
                btn5Presionado = true
                turnoO = true
                mContador!!.start()
            }else{
                if (turnoX == true) {
                    if (btn5Presionado == false) {
                        btnMedioMedio!!.text = "X"
                        btn5Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
        }
        btnMedioDerecha!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnMedioDerecha!!.text = "X"
                primerPresionado = true
                btn6Presionado = true
                turnoO = true
                mContador!!.start()
                }else{
                if (turnoX == true) {
                    if (btn6Presionado == false) {
                        btnMedioDerecha!!.text = "X"
                        btn6Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
            }
        btnAbajoIzquierda!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnAbajoIzquierda!!.text = "X"
                primerPresionado = true
                btn7Presionado = true
                turnoO = true
                mContador!!.start()
            }else{
                if (turnoX == true) {
                    if (btn7Presionado == false) {
                        btnAbajoIzquierda!!.text = "X"
                        btn7Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
        }
        btnAbajoMedio!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnAbajoMedio!!.text = "X"
                primerPresionado = true
                btn8Presionado = true
                turnoO = true
                mContador!!.start()
            }else{
                if (turnoX == true) {
                    if (btn8Presionado == false) {
                        btnAbajoMedio!!.text = "X"
                        btn8Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
        }
        btnAbajoDerecha!!.setOnClickListener() {
            if (primerPresionado == false) {
                btnAbajoDerecha!!.text = "X"
                primerPresionado = true
                btn9Presionado = true
                turnoO = true
                mContador!!.start()
            }else{
                if (turnoX == true) {
                    if (btn9Presionado == false) {
                        btnAbajoDerecha!!.text = "X"
                        btn9Presionado = true
                        turnoX = false
                        turnoO = true
                        turnoXSaltado = false
                    }
                }
            }
        }


    }

    fun reiniciar(){
        btn1Presionado = false
        btn2Presionado = false
        btn3Presionado = false
        btn4Presionado = false
        btn5Presionado = false
        btn6Presionado = false
        btn7Presionado = false
        btn8Presionado = false
        btn9Presionado = false
        turnoX = false
        turnoO = true
        btnArribaIzquierda!!.text = ""
        btnArribaMedio!!.text = ""
        btnArribaDerecha!!.text = ""
        btnMedioIzquierda!!.text = ""
        btnMedioMedio!!.text = ""
        btnMedioDerecha!!.text = ""
        btnAbajoIzquierda!!.text = ""
        btnAbajoMedio!!.text = ""
        btnAbajoDerecha!!.text = ""
    }
}