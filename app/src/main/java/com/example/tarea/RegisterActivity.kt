package com.example.tarea

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class RegisterActivity : AppCompatActivity() {

    private lateinit var edtNombre: EditText
    private lateinit var edtCorreo: EditText
    private lateinit var edtPassword: EditText
    private lateinit var edtConfirmarPassword: EditText

    private lateinit var btnRegistrar: MaterialButton
    private lateinit var txtIrLogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Referencias
        edtNombre = findViewById(R.id.edtNombre)
        edtCorreo = findViewById(R.id.edtCorreoRegistro)
        edtPassword = findViewById(R.id.edtPasswordRegistro)
        edtConfirmarPassword = findViewById(R.id.edtConfirmarPassword)

        btnRegistrar = findViewById(R.id.btnRegistrar)
        txtIrLogin = findViewById(R.id.txtIrLogin)

        // Botón Registrar
        btnRegistrar.setOnClickListener {

            val nombre = edtNombre.text.toString().trim()
            val correo = edtCorreo.text.toString().trim()
            val password = edtPassword.text.toString()
            val confirmar = edtConfirmarPassword.text.toString()

            when {

                nombre.isEmpty() -> {
                    edtNombre.error = "Ingrese su nombre"
                    edtNombre.requestFocus()
                }

                correo.isEmpty() -> {
                    edtCorreo.error = "Ingrese un correo"
                    edtCorreo.requestFocus()
                }

                !Patterns.EMAIL_ADDRESS.matcher(correo).matches() -> {
                    edtCorreo.error = "Correo inválido"
                    edtCorreo.requestFocus()
                }

                password.isEmpty() -> {
                    edtPassword.error = "Ingrese una contraseña"
                    edtPassword.requestFocus()
                }

                password.length < 6 -> {
                    edtPassword.error = "La contraseña debe tener mínimo 6 caracteres"
                    edtPassword.requestFocus()
                }

                confirmar.isEmpty() -> {
                    edtConfirmarPassword.error = "Confirme la contraseña"
                    edtConfirmarPassword.requestFocus()
                }

                password != confirmar -> {
                    edtConfirmarPassword.error = "Las contraseñas no coinciden"
                    edtConfirmarPassword.requestFocus()
                }

                else -> {

                    Toast.makeText(
                        this,
                        "Usuario registrado correctamente",
                        Toast.LENGTH_LONG
                    ).show()

                    // Ir al Login
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }

        // Ir al Login
        txtIrLogin.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}