package org.example.controller;

import org.example.Container;
import org.example.entity.WiseSaying;
import org.example.service.WiseSayingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    WiseSayingService wiseSayingService = new WiseSayingService();

    public void write() {
        System.out.print("내용: ");
        String content = Container.getScanner().nextLine();
        System.out.print("작가: ");
        String author = Container.getScanner().nextLine();

        long id = wiseSayingService.write(content, author);
        System.out.println(id + "번 명언이 등록 되었습니다.");


    }

    public void list() {
        List<WiseSaying> wiseSayingList = wiseSayingService.findByAll();

        if (wiseSayingList.size() == 0) {
            System.out.println("게시물이 없습니다.");
        } else {
            System.out.printf("번호 / 내용 / 작가 \n");
            for (int i = 0; i < wiseSayingList.size(); i++) {
                WiseSaying wiseSaying = wiseSayingList.get(i);
                System.out.printf("%d / %s / %s \n", wiseSaying.getId(), wiseSaying.getContent(), wiseSaying.getAuthor());
            }
        }
    }

    public void remove() {
        System.out.print("삭제할 번호를 입력: ");
        long id = Long.parseLong(Container.getScanner().nextLine());

        WiseSaying wiseSaying = wiseSayingService.findById(id);

        if (wiseSaying == null) {
            System.out.println(id + "번 명언은 존재하지 않습니다.");
            return;
        }

        wiseSayingService.remove(wiseSaying);

        System.out.println(id + "번 명언이 삭제되었습니다.");
    }

    public void modify() {
        System.out.println("수정할 번호를 입력: ");
        long id = Long.parseLong(Container.getScanner().nextLine());
        WiseSaying wiseSaying = wiseSayingService.findById(id);

        if (wiseSaying == null) {
            System.out.println(id + "번 명언은 존재하지 않습니다.");
            return;
        }

        System.out.printf("기존명언 : %s\n", wiseSaying.getContent());
        System.out.printf("명언 :");
        String content = Container.getScanner().nextLine().trim();

        System.out.printf("기존작가 : %s\n", wiseSaying.getAuthor());
        System.out.printf("작가 :");
        String author = Container.getScanner().nextLine().trim();

        // service
        wiseSayingService.modify(wiseSaying, author, content);

        System.out.println(id + "번 명언이 수정 되었습니다.");
    }
}
