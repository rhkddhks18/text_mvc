package org.example.repository;

import org.example.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {

    private List<WiseSaying> wiseSayingList;
    long id = 0;

    public WiseSayingRepository() {
        wiseSayingList = new ArrayList<>();
    }

    public long write(String content, String author) {
        id++;
        WiseSaying wiseSaying = new WiseSaying(id, author, content);
        wiseSayingList.add(wiseSaying);


        return id;
    }

    public void remove(WiseSaying wiseSaying) {
        wiseSayingList.remove(wiseSaying);
    }

    public void modify(WiseSaying wiseSaying, String author, String content) {
        wiseSaying.setAuthor(author);
        wiseSaying.setContent(content);
    }

    public WiseSaying findById(long id) {
        for (WiseSaying wiseSaying : wiseSayingList) {
            if (wiseSaying.getId() == id) {
                return wiseSaying;
            }
        }
        return null;
    }

    public List<WiseSaying> findByAll() {
        return wiseSayingList;
    }
}
