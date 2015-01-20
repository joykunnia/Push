package com.okpos.push;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyowon on 2015-01-16.
 */
@Component
public class PushService {
    Sender sender = new Sender(""); // ���� API Key �Է�
    String regId = ""; // �ܸ��� RegID �Է�


    void pushMessage() {

        //Message message = new Message.Builder().addData("title", "����� Ǫ��").build();
        Message.Builder builder = new Message.Builder();

        try{
            builder.addData("title", URLEncoder.encode("Ÿ��Ʋ Ǫ��","UTF-8"));
            builder.addData("content", URLEncoder.encode("����� Ǫ��","UTF-8"));

        } catch (Exception e) {

        }

        Message message = builder.build();



        ArrayList<String> list = new ArrayList<String>();

        list.add(regId);

        MulticastResult multiResult;
        try {
            multiResult = sender.send(message, list, 5);
            if (multiResult != null) {
                List<Result> resultList = multiResult.getResults();
                for (Result result : resultList) {
                    System.out.println(result.getMessageId());
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
