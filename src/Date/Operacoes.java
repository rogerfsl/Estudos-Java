package Date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Operacoes {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2023-10-24");
		LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
		Instant d06 = Instant.parse("2023-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("PWLocal = " + pastWeekLocalDate);
		System.out.println("NWLocal = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("PwLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("NxLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekIstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekIstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("PwLocalDateTime = " + pastWeekIstant);
		System.out.println("NxLocalDateTime = " + nextWeekIstant);
		
		Duration t1 = Duration.between(d05, nextWeekLocalDateTime);

		System.out.println("t1 dias = " + t1.toDays());
		


	}

}
