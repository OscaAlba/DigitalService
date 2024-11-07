package alba.oscar.digitalservice

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    private var username by mutableStateOf("")
    var password by mutableStateOf("")
    var email by mutableStateOf("")}
    private var _loginSuccess by mutableStateOf(false)
    val loginSuccess: Boolean get() = _loginSuccess
    private var _errorMessage by mutableStateOf("")
    val errorMessage: String get() = _errorMessage

    fun onLoginClicked() {
        if (username.isBlank() || password.isBlank() || email.isBlank()) {
            _errorMessage = "Por favor, complete todos los campos."
            _loginSuccess = false
        } else if (username == "admin" && password == "12345" && email == "oscar202.oa@gmail.com") {
            _loginSuccess = true
            _errorMessage = ""
        } else {
            _errorMessage = "Usuario o contraseña incorrectos."
            _loginSuccess = false
        }
    }
}