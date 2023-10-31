package org.example;

import org.example.db.DBConnection;
import org.example.member.controller.MemberController;
import org.example.wiseSaying.controller.WiseSayingController;
import org.example.system.SystemController;

public class App {
    App () {
        DBConnection.DB_NAME = "proj2";
        DBConnection.DB_USER = "root";
        DBConnection.DB_PASSWORD = "";
        DBConnection.DB_PORT = 3306;

        Container.getDBconnection().connect();
    }
    void run() {
        SystemController systemController = new SystemController();
        WiseSayingController wiseSayingController = new WiseSayingController();
        MemberController memberController = new MemberController();
        System.out.println("==명언 앱==");
        while (true) {
            System.out.print("명령) ");
            String command = Container.getScanner().nextLine();
            switch (command) {
                case "종료":
                    systemController.exit();
                    return;
                case "회원가입":
                    memberController.join();
                    break;
                case "로그인":
                    memberController.login();
                    break;
                case "로그아웃":
                    memberController.logout();
                    break;
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