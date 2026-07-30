package com.example.tarea

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    lateinit var edtCorreo: EditText
    lateinit var edtPassword: EditText
    lateinit var btnLogin: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        setContentView(R.layout.activity_login)

        edtCorreo = findViewById(R.id.edtCorreo)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val correo = edtCorreo.text.toString()
            val password = edtPassword.text.toString()

            if (correo == "") {
                Toast.makeText(this, "Ingrese el correo", Toast.LENGTH_SHORT).show()
            } else if (password == "") {
                Toast.makeText(this, "Ingrese la contraseña", Toast.LENGTH_SHORT).show()
            } else if (correo == "admin@gmail.com" && password == "123456") {

                Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            } else {

                Toast.makeText(this, "Correo o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
=======
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
>>>>>>> origin/master
        }
    }
}