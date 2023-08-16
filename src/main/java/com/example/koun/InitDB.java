package com.example.koun;


import com.example.koun.domain.Item;
import com.example.koun.domain.Section;
import com.example.koun.domain.User;
import com.example.koun.repository.ItemRepository;
import com.example.koun.repository.SectionRepository;
import com.example.koun.repository.UserRepository;
import com.example.koun.service.RaffleService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class InitDB {
    private final InitService initService;

    @PostConstruct
    public void init(){
        initService.dbInit1();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService{

        private final UserRepository userRepository;
        private final SectionRepository sectionRepository;
        private final ItemRepository itemRepository;
        public void dbInit1(){


            User user = User.builder()
                    .userName("TestUser")
                    .userEmail("Test1234@test.com.")
                    .build();
            userRepository.save(user);



            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse("2023-10-17 18:00", formatter);
            LocalDate uploadTime = LocalDate.parse("2023-08-15", formatter);
            LocalDateTime dateTime1 = LocalDateTime.parse("2023-08-26 18:00", formatter);
            LocalDate uploadTime1 = LocalDate.parse("2023-08-17", formatter);
            LocalDateTime dateTime2 = LocalDateTime.parse("2023-10-17 18:00", formatter);
            LocalDate uploadTime2 = LocalDate.parse("2023-08-16", formatter);
            LocalDateTime dateTime3 = LocalDateTime.parse("2023-08-25 18:00", formatter);
            LocalDate uploadTime3 = LocalDate.parse("2023-08-18", formatter);
            LocalDateTime dateTime4 = LocalDateTime.parse("2023-09-09 18:00", formatter);
            LocalDate uploadTime4 = LocalDate.parse("2023-08-15", formatter);
            LocalDateTime dateTime5 = LocalDateTime.parse("2023-09-02 18:00", formatter);
            LocalDate uploadTime5 = LocalDate.parse("2023-08-19", formatter);
            LocalDateTime dateTime6 = LocalDateTime.parse("2023-10-03 18:00", formatter);
            LocalDate uploadTime6 = LocalDate.parse("2023-08-15", formatter);
            LocalDateTime dateTime7 = LocalDateTime.parse("2023-09-12 18:00", formatter);
            LocalDate uploadTime7 = LocalDate.parse("2023-08-18", formatter);
            LocalDateTime dateTime8 = LocalDateTime.parse("2023-09-09 18:00", formatter);
            LocalDate uploadTime8 = LocalDate.parse("2023-08-17", formatter);
            LocalDateTime dateTime9 = LocalDateTime.parse("2023-08-25 18:00", formatter);
            LocalDate uploadTime9 = LocalDate.parse("2023-08-19", formatter);




            Item item = Item.builder()
                    .itemName("2023 샘스미스 내한공연")
                    .artist("샘스미스")
                    .venue("KSP DOME")
                    .dateTime(dateTime)
                    .ageRequirement("만 19세이상")
                    .runningTime("150분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23007654_p.gif")
                    .uploadTime(uploadTime)
                    .build();
            itemRepository.save(item);

            Item item1 = Item.builder()
                    .itemName("싸이 흠뻑쇼 -부산")
                    .artist("싸이")
                    .venue("부산 아시아드 보조경기장")
                    .dateTime(dateTime1)
                    .ageRequirement("전체관람가")
                    .runningTime("240분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23007291_p.gif")
                    .uploadTime(uploadTime1)
                    .build();
            itemRepository.save(item1);

            Item item2 = Item.builder()
                    .itemName("2023 김동률 콘서트")
                    .artist("김동률")
                    .venue("KSPO DOME")
                    .dateTime(dateTime2)
                    .ageRequirement("8세 이상 관람가능")
                    .runningTime("150분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23011026_p.gif")
                    .uploadTime(uploadTime2)
                    .build();
            itemRepository.save(item2);

            Item item3 = Item.builder()
                    .itemName("2023 검정치마 앵콜 공연")
                    .artist("검정치마")
                    .venue("블루스퀘어 마스터카드홀")
                    .dateTime(dateTime3)
                    .ageRequirement("15세이상")
                    .runningTime("100분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23011003_p.gif")
                    .uploadTime(uploadTime3)
                    .build();
            itemRepository.save(item3);

            Item item4 = Item.builder()
                    .itemName("2PM 15th Concert")
                    .artist("2PM")
                    .venue("잠실실내체육관")
                    .dateTime(dateTime4)
                    .ageRequirement("만 7세이상")
                    .runningTime("140분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23010652_p.gif")
                    .uploadTime(uploadTime4)
                    .build();
            itemRepository.save(item4);

            Item item5 = Item.builder()
                    .itemName("성시경 with friends")
                    .artist("성시경")
                    .venue("KSPO DOME")
                    .dateTime(dateTime5)
                    .ageRequirement("초등학생이상 관람가")
                    .runningTime("120분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23010177_p.gif")
                    .uploadTime(uploadTime5)
                    .build();
            itemRepository.save(item5);

            Item item6 = Item.builder()
                    .itemName("히사이시조 음악콘서트")
                    .artist("위필하모닉 오케스트라")
                    .venue("롯데콘서트홀")
                    .dateTime(dateTime6)
                    .ageRequirement("초등학생이상 관람가")
                    .runningTime("120분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23011060_p.gif")
                    .uploadTime(uploadTime6)
                    .build();
            itemRepository.save(item6);

            Item item7 = Item.builder()
                    .itemName("LE SSERAFIM TOUR")
                    .artist("르세라핌")
                    .venue("잠실실내체육관")
                    .dateTime(dateTime7)
                    .ageRequirement("만 9세이상")
                    .runningTime("120분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23009197_p.gif")
                    .uploadTime(uploadTime7)
                    .build();
            itemRepository.save(item7);

            Item item8 = Item.builder()
                    .itemName("이문세의 숲속음악회")
                    .artist("이문세")
                    .venue("봉평 허브나라")
                    .dateTime(dateTime8)
                    .ageRequirement("만 7세이상")
                    .runningTime("110분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23011005_p.gif")
                    .uploadTime(uploadTime8)
                    .build();
            itemRepository.save(item8);

            Item item9 = Item.builder()
                    .itemName("2023 영탁 단독 콘서트")
                    .artist("영탁")
                    .venue("KSPO DOME")
                    .dateTime(dateTime9)
                    .ageRequirement("초등학생 이상 관람가")
                    .runningTime("120분")
                    .post("https://ticketimage.interpark.com/Play/image/large/23/23009717_p.gif")
                    .uploadTime(uploadTime9)
                    .build();
            itemRepository.save(item9);




            Section section = Section.builder()
                    .sectionName("스탠딩-가")
                    .seatQuantity(100)
                    .item(item)
                    .build();
            sectionRepository.save(section);

            Section section1 = Section.builder()
                    .sectionName("지정석-나")
                    .seatQuantity(200)
                    .item(item)
                    .build();
            sectionRepository.save(section1);






        }
    }




}