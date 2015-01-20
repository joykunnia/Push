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
    Sender sender = new Sender(""); // 서버 API Key 입력
    String regId = ""; // 단말기 RegID 입력


    void pushMessage() {

        //Message message = new Message.Builder().addData("title", "배고파 푸시").build();
        Message.Builder builder = new Message.Builder();

        try{
            builder.addData("title", URLEncoder.encode("타이틀 푸시","UTF-8"));
            builder.addData("content", URLEncoder.encode("배고파 푸시","UTF-8"));

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
