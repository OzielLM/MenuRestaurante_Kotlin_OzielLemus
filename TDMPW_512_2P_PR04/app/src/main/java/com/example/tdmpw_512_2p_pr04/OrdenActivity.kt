package com.example.tdmpw_512_2p_pr04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class OrdenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orden)

        val txtOrden = findViewById<TextView>(R.id.txtOrden)
        val txtIndicacionesExtra = findViewById<TextView>(R.id.txtOrdendeExtras)

        val orden = intent.extras?.getSerializable("Orden") as MutableList<*>
        txtOrden.text = orden.joinToString("\n")


        val indicacionesExtra = intent.extras?.getSerializable("indicacionesExtra") as MutableList<*>
        txtIndicacionesExtra.text = indicacionesExtra.joinToString("\n")

        val totalOrden = intent.extras?.getDouble("totalOrden")
        val txtTotalOrden = findViewById<TextView>(R.id.txtTotalOrden)
        txtTotalOrden.text = "Total: $totalOrden"

        val btnCompletarOrden = findViewById<Button>(R.id.btnCompletarOrden)
        btnCompletarOrden.setOnClickListener {
            finish()
        }
    }
}