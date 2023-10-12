package team.chichi.pamback.board;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDTO {
    private int boardIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
    private LocalDateTime createDateTime;
    private String updaterId;
    private LocalDateTime updatedDatetime;
}
