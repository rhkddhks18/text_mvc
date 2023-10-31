package org.example.wiseSaying.repository;

import org.example.Container;
import org.example.db.DBConnection;
import org.example.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WiseSayingRepository {
    long id = 0;
    private List<WiseSaying> wiseSayingList;

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
