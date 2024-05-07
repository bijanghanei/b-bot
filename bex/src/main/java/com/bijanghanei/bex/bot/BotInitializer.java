package com.bijanghanei.bex.bot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
@Component
public class BotInitializer implements CommandLineRunner {
    private final BexBot bexBot;

    public BotInitializer(BexBot bexBot) {
        this.bexBot = bexBot;
    }

    @Override
    public void run(String... args) throws Exception {
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(this.bexBot);
    }
}
//@Slf4j
//@Component
//public class BotInitializer{
//    private final BexBot bexBot;
//
//    public BotInitializer(BexBot bexBot) {
//        this.bexBot = bexBot;
//    }
//    @EventListener({ContextRefreshedEvent.class})
//    public void init() throws TelegramApiException {
//        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
//        try {
//            botsApi.registerBot(bexBot);
//        }
//        catch (TelegramApiException e) {
//            log.error("Error occurred: " + e.getMessage());
//        }
//    }
//}

