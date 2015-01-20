package com.okpos.push;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyowon on 2015-01-16.
 */
@Component
public class RegService {



    void getGson() {

        String request = "{\"shop_cd\":\"S33061\",\"registration_id\":\"APA91bGt7LaJMZ91HvxIX1ECyLcK8lYKcRd_s5xwA8HV0AEQ-IPzam0lhCbpP4uhlEoF7JRN39oNPm3sc-9PtwTJOp699LdbdSTMFhhWUplfaIHuAcn_UfyNdXuDC8wxs9l51yud9FwzUnD7Ordzz8k98epp3gPI6w\",\"type_fg\":\"1\",\"uuid\":\"d64777f8-6620-356c-83c9-1defad46fb9b\"}";

        Gson gson = new Gson();

        Device device = gson.fromJson(request, Device.class);

        System.out.println(device.getShop_cd());
        System.out.println(device.getRegistration_id());

    }


}
