package org.example;

import org.example.controller.WiseSayingController;
import org.example.entity.WiseSaying;
import org.example.system.SystemController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static void run() {
        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();
        System.out.println("==명언 앱==");
        while (true) {
            System.out.print("명령) ");
            String command = Container.getScanner().nextLine();
            switch (command) {
                case "종료":
                    systemController.exit();
                    return;
                case "등록":
                    wiseSayingController.write();
                    break;
                case "목록":
                    wiseSayingController.list();
                    break;
                case "삭제":
                    wiseSayingController.remove();
                    break;
                case "수정":
                    wiseSayingController.modify();
                    break;
            }
        }
    }
}