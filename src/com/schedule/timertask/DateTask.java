package com.schedule.timertask;

import java.util.*;

public class DateTask extends TimerTask {
    public void run() {
        System.out.println("任務時間：" + new Date());
    }
}
