package com.example.tdmpw_512_2p_pr04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    val ordenCompleta: MutableList<String> = mutableListOf()
    var totalDeOrden = 0.0
    val indicacionesExtra: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chipAlitas = findViewById<Chip>(R.id.chpAlitas)
        val btnMasAlitas = findViewById<Button>(R.id.btnMasAlitas)
        val btnMenosAlitas = findViewById<Button>(R.id.btnMenosAlitas)
        val cantidadAlitas = findViewById<TextView>(R.id.txtCantidadAlitas)
        val totalAlitas = findViewById<TextView>(R.id.txtTotalAlitas)
        val precioAlitas = 150.0
        var cantidaddeAlitas = 0
        var totalDeAlitas = 0.0

        val chipHamburguesa = findViewById<Chip>(R.id.chpHamburguesa)
        val btnMasHamburguesa = findViewById<Button>(R.id.btnMasHamburguesa)
        val btnMenosHamburguesa = findViewById<Button>(R.id.btnMenosHamburguesa)
        val cantidadHamburguesa = findViewById<TextView>(R.id.txtCantidadHamburguesa)
        val totalHamburguesa = findViewById<TextView>(R.id.txtTotalHamburguesa)
        val precioHamburguesa = 97.0
        var cantidadDeHamburguesas = 0
        var totalDeHamburguesas = 0.0

        val chipHotDog = findViewById<Chip>(R.id.chpHotDog)
        val btnMasHotDog = findViewById<Button>(R.id.btnMasHotDog)
        val btnMenosHotDog = findViewById<Button>(R.id.btnMenosHotDog)
        val cantidadHotDog = findViewById<TextView>(R.id.txtCantidadHotDog)
        val totalHotDog = findViewById<TextView>(R.id.txtTotalHotDog)
        val precioHotDog = 20.0
        var cantidadDeHotDog = 0
        var totalDeHotDog = 0.0

        val chipPizza = findViewById<Chip>(R.id.chpPizza)
        val btnMasPizza = findViewById<Button>(R.id.btnMasPizza)
        val btnMenosPizza = findViewById<Button>(R.id.btnMenosPizza)
        val cantidadPizza = findViewById<TextView>(R.id.txtCantidadPizza)
        val totalPizza = findViewById<TextView>(R.id.txtTotalPizza)
        val precioPizza = 129.0
        var cantidadDePizza= 0
        var totalDePizza = 0.0

        val chipTacos = findViewById<Chip>(R.id.chpTacos)
        val btnMasTacos = findViewById<Button>(R.id.btnMasTacos)
        val btnMenosTacos = findViewById<Button>(R.id.btnMenosTacos)
        val cantidadTacos = findViewById<TextView>(R.id.txtCantidadTacos)
        val totalTacos = findViewById<TextView>(R.id.txtTotalTacos)
        val precioTacos = 15.0
        var cantidadDeTacos = 0
        var totalDeTacos = 0.0


        chipAlitas.setOnClickListener {
            if(chipAlitas.isChecked){
                btnMasAlitas.isEnabled = true
                btnMenosAlitas.isEnabled = true

                btnMasAlitas.setOnClickListener {
                    cantidaddeAlitas++
                    cantidadAlitas.text = cantidaddeAlitas.toString()
                    totalDeAlitas = cantidaddeAlitas * precioAlitas;
                    totalAlitas.text = "$${totalDeAlitas}";
                }

                btnMenosAlitas.setOnClickListener {
                    if (cantidaddeAlitas > 1) {
                        cantidaddeAlitas--
                    }
                    cantidadAlitas.text = cantidaddeAlitas.toString()
                    totalDeAlitas = cantidaddeAlitas * precioAlitas;
                    totalAlitas.text = "$${totalDeAlitas}";
                }
            }else{
                btnMasAlitas.isEnabled = false
                btnMenosAlitas.isEnabled = false
                cantidadAlitas.text = "0"
                totalAlitas.text = "$0.0"
                cantidaddeAlitas = 0
            }

        }

        chipHamburguesa.setOnClickListener {
            if(chipHamburguesa.isChecked){
                btnMasHamburguesa.isEnabled = true
                btnMenosHamburguesa.isEnabled = true

                btnMasHamburguesa.setOnClickListener {
                    cantidadDeHamburguesas++
                    cantidadHamburguesa.text = cantidadDeHamburguesas.toString()
                    totalDeHamburguesas = cantidadDeHamburguesas * precioHamburguesa;
                    totalHamburguesa.text = "$${totalDeHamburguesas}";
                }

                btnMenosHamburguesa.setOnClickListener {
                    if (cantidadDeHamburguesas > 1) {
                        cantidadDeHamburguesas--
                    }
                    cantidadHamburguesa.text = cantidadDeHamburguesas.toString()
                    totalDeHamburguesas = cantidadDeHamburguesas * precioHamburguesa;
                    totalHamburguesa.text = "$${totalDeHamburguesas}";
                }
            }else{
                btnMasHamburguesa.isEnabled = false
                btnMenosHamburguesa.isEnabled = false
                cantidadHamburguesa.text = "0"
                totalHamburguesa.text = "$0.0"
                cantidadDeHamburguesas = 0
            }
        }

        chipHotDog.setOnClickListener {
            if(chipHotDog.isChecked){
                btnMasHotDog.isEnabled = true
                btnMenosHotDog.isEnabled = true

                btnMasHotDog.setOnClickListener {
                    cantidadDeHotDog++
                    cantidadHotDog.text = cantidadDeHotDog.toString()
                    totalDeHotDog = cantidadDeHotDog * precioHotDog;
                    totalHotDog.text = "$${totalDeHotDog}";
                }

                btnMenosHotDog.setOnClickListener {
                    if (cantidadDeHotDog > 1) {
                        cantidadDeHotDog--
                    }
                    cantidadHotDog.text = cantidadDeHotDog.toString()
                    totalDeHotDog = cantidadDeHotDog * precioHotDog;
                    totalHotDog.text = "$${totalDeHotDog}";
                }
            }else{
                btnMasHotDog.isEnabled = false
                btnMenosHotDog.isEnabled = false
                cantidadHotDog.text = "0"
                totalHotDog.text = "$0.0"
                cantidadDeHotDog = 0
            }
        }

        chipPizza.setOnClickListener {
            if(chipPizza.isChecked){
                btnMasPizza.isEnabled = true
                btnMenosPizza.isEnabled = true

                btnMasPizza.setOnClickListener {
                    cantidadDePizza++
                    cantidadPizza.text = cantidadDePizza.toString()
                    totalDePizza = cantidadDePizza * precioPizza;
                    totalPizza.text = "$${totalDePizza}";
                }

                btnMenosPizza.setOnClickListener {
                    if (cantidadDePizza > 1) {
                        cantidadDePizza--
                    }
                    cantidadPizza.text = cantidadDePizza.toString()
                    totalDePizza = cantidadDePizza * precioPizza;
                    totalPizza.text = "$${totalDePizza}";
                }
            }else{
                btnMasPizza.isEnabled = false
                btnMenosPizza.isEnabled = false
                cantidadPizza.text = "0"
                totalPizza.text = "$0.0"
                cantidadDePizza = 0
            }
        }

        chipTacos.setOnClickListener {
            if(chipTacos.isChecked){
                btnMasTacos.isEnabled = true
                btnMenosTacos.isEnabled = true

                btnMasTacos.setOnClickListener {
                    cantidadDeTacos++
                    cantidadTacos.text = cantidadDeTacos.toString()
                    totalDeTacos = cantidadDeTacos * precioTacos;
                    totalTacos.text = "$${totalDeTacos}";
                }

                btnMenosTacos.setOnClickListener {
                    if (cantidadDeTacos > 1) {
                        cantidadDeTacos--
                    }
                    cantidadTacos.text = cantidadDeTacos.toString()
                    totalDeTacos = cantidadDeTacos * precioTacos;
                    totalTacos.text = "$${totalDeTacos}";
                }



            }else{
                btnMasTacos.isEnabled = false
                btnMenosTacos.isEnabled = false
                cantidadTacos.text = "0"
                totalTacos.text = "$0.0"
                cantidadDeTacos = 0
            }
        }



        val txtExtras = findViewById<EditText>(R.id.txtExtra)
        txtExtras.setOnKeyListener{_, keyCode, event->
            if(event.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                agregarExtra(txtExtras.text.toString())
                txtExtras.text = null
            }
            false
        }


        val btnOrdenar = findViewById<Button>(R.id.btnOrdenar)
        btnOrdenar.setOnClickListener {
            if (chipAlitas.isChecked){
                totalDeOrden += totalDeAlitas
                ordenCompleta.add("${chipAlitas.text.toString()}: cantidad: $cantidaddeAlitas total: $$totalDeAlitas\n")
            }

            if (chipHamburguesa.isChecked){
                totalDeOrden += totalDeHamburguesas
                ordenCompleta.add("${chipHamburguesa.text.toString()}: cantidad: $cantidadDeHamburguesas total: $$totalDeHamburguesas\n")
            }

            if(chipHotDog.isChecked){
                totalDeOrden += totalDeHotDog
                ordenCompleta.add("${chipHotDog.text.toString()}: cantidad: $cantidadDeHotDog total: $$totalDeHotDog\n")
            }

            if (chipPizza.isChecked){
                totalDeOrden += totalDePizza
                ordenCompleta.add("${chipPizza.text.toString()}: cantidad: $cantidadDePizza total: $$totalDePizza\n")
            }

            if (chipTacos.isChecked){
                totalDeOrden += totalDeTacos
                ordenCompleta.add("${chipTacos.text.toString()}: cantidad: $cantidadDeTacos total: $$totalDeTacos\n")
            }

            val chgExtras = findViewById<ChipGroup>(R.id.chgExtras)
            for (i in 0 until chgExtras.childCount) {
                val chip = chgExtras.getChildAt(i) as Chip
                indicacionesExtra.add(chip.text.toString())
            }

            val intent = Intent(this, OrdenActivity::class.java)
            intent.putExtra("Orden", ArrayList(ordenCompleta))
            intent.putExtra("totalOrden", totalDeOrden)
            intent.putExtra("indicacionesExtra", ArrayList(indicacionesExtra))
            startActivity(intent)
            ordenCompleta.clear()
            indicacionesExtra.clear()
            totalDeOrden = 0.0
        }
    }

    private fun agregarExtra(extra:String){
        val chip = Chip(this@MainActivity)
        chip.text = extra
        chip.isClickable = true
        chip.isCheckable = false
        val chgExtras = findViewById<ChipGroup>(R.id.chgExtras)
        chgExtras.addView(chip as View)
        chip.setOnClickListener {
            chgExtras.removeView(chip as View)
        }
    }
}