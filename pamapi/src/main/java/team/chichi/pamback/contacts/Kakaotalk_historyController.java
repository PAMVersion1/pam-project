package team.chichi.pamback.contacts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.scheduling.annotation.Scheduled;

public class Kakaotalk_historyController {
    
    // 주기적인 데이터 처리
    @Scheduled(cron = "0 0 0 * * *") // 매일 0시 0분 0초에 실행
    public static void insertKakaotalkHistory() {

        try{
            // 카카오톡 내보내기로 저장된 txt 파일을 가져와서 
            File file = new File("C:/Users/kli08/Documents/카카오톡 받은 파일/KakaoTalk_20231012_1918_53_508_윤희승 강사님.txt");
            FileReader filereader = new FileReader(file);
            int singleCh = 0;
            while((singleCh = filereader.read()) != -1){
                System.out.print((char)singleCh);
                //if((char)singleCh == '--------------- '){

                //}
            }
            filereader.close();
        } catch (FileNotFoundException e) {

        } catch(IOException e){
            System.out.println(e);
        }
    }

}
