package com.homework.uploadingdata

/**
 * Приложение «Загрузка данных»
 *
 *
 * На основе пройденного материала необходимо написать приложение для вывода
 * загруженных данных на экран устройства. В качестве данных может быть рассказ любого автора,
 * список пользователей базы данных и прочее.
 * При нажатии кнопки «Загрузка данных» появляется всплывающее сообщение «Нет доступа».
 * Кнопка находится в неактивном состоянии.
 * В случае переключения Switch в отмеченное положение, кнопка становится
 * в активном состоянии и при нажатии на кнопку «Загрузка данных»
 * на экране устройства появляются загруженные данные и всплывающее
 * сообщение символизирует о начале загрузки данных.
 *
 */
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}