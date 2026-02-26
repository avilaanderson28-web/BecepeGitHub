package com.example.becepe.ui.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class LoginUiState(
    val pin: String = "",
    val isLoginEnabled: Boolean = false
)

class LoginViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun onPinChange(value: String) {
        val filteredPin = value.filter { it.isDigit() }.take(PIN_LENGTH)
        _uiState.update {
            it.copy(
                pin = filteredPin,
                isLoginEnabled = filteredPin.length == PIN_LENGTH
            )
        }
    }

    companion object {
        private const val PIN_LENGTH = 6
    }
}
