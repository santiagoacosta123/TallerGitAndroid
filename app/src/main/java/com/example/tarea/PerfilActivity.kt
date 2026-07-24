package com.example.tarea

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity() {

    private lateinit var imgPerfil: ImageView
    private lateinit var txtNombre: TextView
    private lateinit var txtCorreo: TextView

    private lateinit var lblNombre: TextView
    private lateinit var lblCorreo: TextView
    private lateinit var lblRol: TextView

    private lateinit var btnEditar: Button
    private lateinit var btnCerrarSesion: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        // Referencias de la interfaz
        imgPerfil = findViewById(R.id.imgPerfil)
        txtNombre = findViewById(R.id.txtNombre)
        txtCorreo = findViewById(R.id.txtCorreo)

        lblNombre = findViewById(R.id.lblNombre)
        lblCorreo = findViewById(R.id.lblCorreo)
        lblRol = findViewById(R.id.lblRol)

        btnEditar = findViewById(R.id.btnEditar)
        btnCerrarSesion = findViewById(R.id.btnCerrarSesion)

        // Datos de ejemplo
        cargarDatos()

        // Botón Editar Perfil
        btnEditar.setOnClickListener {
            Toast.makeText(
                this,
                "Función Editar Perfil en desarrollo",
                Toast.LENGTH_SHORT
            ).show()
        }

        // Botón Cerrar Sesión
        btnCerrarSesion.setOnClickListener {

            Toast.makeText(
                this,
                "Sesión cerrada correctamente",
                Toast.LENGTH_SHORT
            ).show()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun cargarDatos() {

        val nombre = "Mai Ruiz"
        val correo = "maidyruiz58@gmail.com"
        val rol = "Administrador"

        txtNombre.text = nombre
        txtCorreo.text = correo

        lblNombre.text = nombre
        lblCorreo.text = correo
        lblRol.text = rol
    }
}
