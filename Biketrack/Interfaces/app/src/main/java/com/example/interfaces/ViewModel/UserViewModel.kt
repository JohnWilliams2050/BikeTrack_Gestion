package com.example.interfaces.ViewModel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
//videmodel para utenticacion, mira toca mandar errores o si se puede actualizar el correo y contrasena
data class UserAuthState(
    val email : String = "",
    val password : String = "",
    val emailError:String = "",
    val passError : String = ""
)
class UserAuthViewModel : ViewModel() {
    val _user = MutableStateFlow<UserAuthState>(UserAuthState())
    val user = _user.asStateFlow()
    fun updateEmailClass(newEmail: String) {
        _user.value = _user.value.copy(email = newEmail)
    }

    fun updatePassClass(newPass: String) {
        _user.value = _user.value.copy(password = newPass)
    }

    fun updateEmailError(error: String) {
        _user.value = _user.value.copy(emailError = error)
    }

    fun updatePassError(error: String) {
        _user.value = _user.value.copy(passError = error)
    }

}
