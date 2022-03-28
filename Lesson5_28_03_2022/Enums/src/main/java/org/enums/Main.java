package org.enums;

import org.enums.Month;
import org.enums.SeasonService;

public class Main {
    public static void main(String[] args) throws Exception{
        SeasonService seasonService = SeasonService.INSTANCE;

        seasonService.showSeason(Month.JANUARY);
        seasonService.showSeason(Month.NOVEMBER);
        seasonService.showSeason(Month.AUGUST);
        seasonService.showSeason(Month.SEPTEMBER);
    }
}
