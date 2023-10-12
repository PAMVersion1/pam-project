package team.chichi.pamback.contacts;

import org.springframework.scheduling.annotation.Scheduled;

public class Call_historyController {
    
    // 주기적인 데이터 처리

    @Scheduled(cron = "0 0 0 * * *") // 매일 0시 0분 0초에 실행
    public void deleteCallHistory() {
        

    }
}
