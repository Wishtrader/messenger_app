package messenger.com.craneglee.messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent; // ипорт класса Intent
import android.widget.TextView; // импорт класса Text.View

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";
    // EXTRA_MESSAGE - имя дополнительного значения, передаваемого в интенте.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        //получить интент и извлечь из него сообщение вызовом getStringExtra();
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(messageText);
        //Добавить текст в надпись с идентификатором message.
    }
}
