package tn.esprit.loldatastorage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import tn.esprit.loldatastorage.databinding.ActivityLoginBinding

const val PREF_NAME = "LOGIN_PREF_LOL"
const val LOGIN = "LOGIN"
const val PASSWORD = "PASSWORD"
const val IS_REMEMBRED = "IS_REMEMBRED"

class LoginActivity : AppCompatActivity() {

    lateinit var txtLogin: TextInputEditText
    lateinit var txtLayoutLogin: TextInputLayout

    lateinit var txtPassword: TextInputEditText
    lateinit var txtLayoutPassword: TextInputLayout

    lateinit var cbRememberMe: CheckBox
    lateinit var btnLogin: MaterialButton
    private lateinit var binding: ActivityLoginBinding

    //TODO 1 "Declare a var of SharedPreferences"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        txtLogin = findViewById(R.id.txtLogin)
        txtLayoutLogin = findViewById(R.id.txtLayoutLogin)

        txtPassword = findViewById(R.id.txtPassword)
        txtLayoutPassword = findViewById(R.id.txtLayoutPassword)

        cbRememberMe = findViewById(R.id.cbRememberMe)
        btnLogin = findViewById(R.id.btnLogin)

        //TODO 2 "Initialize the var of SharedPreferences"


        //TODO 3 "Test in the SharedPreferences if there's data"



        btnLogin.setOnClickListener{
            doLogin()
        }

    }

    private fun doLogin(){
        if (validate()){
            if (cbRememberMe.isChecked){
                //TODO 4 "Edit the SharedPreferences by putting all the data"



            }

            navigate()
        }
    }

    private fun validate(): Boolean {
        txtLayoutLogin.error = null
        txtLayoutPassword.error = null

        if (txtLogin.text!!.isEmpty()){
            txtLayoutLogin.error = getString(R.string.mustNotBeEmpty)
            return false
        }

        if (txtPassword.text!!.isEmpty()){
            txtLayoutPassword.error = getString(R.string.mustNotBeEmpty)
            return false
        }

        return true
    }

    private fun navigate(){
        val mainIntent = Intent(this, MainActivity::class.java)
        startActivity(mainIntent)
    }
}