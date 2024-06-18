package quiz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D11_ReporterList_m {

	// 1. 어떤 이메일 도메인(yna, co.kr,hankyung.com 등)이
	// 몇 개씩 있는지 세어서 출력해보기
	//
	// 2. 어떤 신문사의 기자가 몇 명씩 있는지 세어서 출력해보기
	//
	// 3. 어떤 분야의 기자가 몇 명씩 있는지 세어서 출력해보기
	//
	// 4. 모든 기자의 이름/이메일/분야를 신문사별로 분류하여 출력해주기
	//
	// 5. 모든 기자의 이름/이메일/신문사를 분야별로 분류하여 출력해보기
	//
	public static void main(String[] args) {
		
		String reporters = "\r\n"
				+ "지디넷코리아 휴대폰/디지털기기 김우용 yong2@zdnet.co.kr \r\n"
				+ "국민일보 휴대폰/디지털기기 김원철 wonchul@kmib.co.kr \r\n"
				+ "경향신문 휴대폰/디지털기기 윤민용 vista@kyunghyang.com \r\n"
				+ "전자신문 휴대폰/디지털기기 이정환 victolee@etnews.co.kr \r\n"
				+ "노컷뉴스 휴대폰/디지털기기 권민철 twinpine@cbs.co.kr \r\n"
				+ "아이뉴스 24 휴대폰/디지털기기 서소정 ssj6@inews24.com \r\n"
				+ "프레시안 휴대폰/디지털기기 김봉규 srv@pressian.com \r\n"
				+ "머니투데이 휴대폰/디지털기기 송정렬 songjr@moneytoday.co.kr \r\n"
				+ "디지털데일리 휴대폰/디지털기기 심재석 sjs@ddaily.co.kr \r\n"
				+ "아이뉴스 24 휴대폰/디지털기기 김익현 sini@inews24.com \r\n"
				+ "SBSTV 휴대폰/디지털기기 김수형 sean@sbs.co.kr \r\n"
				+ "지디넷코리아 휴대폰/디지털기기 이설영 ronia@zdnet.co.kr \r\n"
				+ "국민일보 휴대폰/디지털기기 천지우 mogul@kmib.co.kr \r\n"
				+ "디지털데일리 휴대폰/디지털기기 이민형 kiku@ddaily.co.kr \r\n"
				+ "뉴시스 휴대폰/디지털기기 강세훈 kangse@newsis.com \r\n"
				+ "한겨례 휴대폰/디지털기기 김재섭 jskim@hani.co.kr \r\n"
				+ "부산일보 휴대폰/디지털기기 이주환 jhwan@busanilbo.com \r\n"
				+ "MBC 뉴스 휴대폰/디지털기기 현원섭 hyunny@imbc.com \r\n"
				+ "지디넷코리아 휴대폰/디지털기기 남혜연 hyun@zdnet.co.kr \r\n"
				+ "지디넷코리아 휴대폰/디지털기기 이장혁 hymagic@zdnet.co.kr \r\n"
				+ "아이뉴스 24 휴대폰/디지털기기 정병묵 honnezo@inews24.com \r\n"
				+ "파이낸셜 휴대폰/디지털기기 홍석희 hong@fnnews.com \r\n"
				+ "아이뉴스 24 휴대폰/디지털기기 임혜정 heather@inews24.com \r\n"
				+ "동아일보 휴대폰/디지털기기 김원겸 gyummy@donga.com \r\n"
				+ "동아일보 휴대폰/디지털기기 김동현 game@gamedonga.co.kr \r\n"
				+ "파이낸셜 휴대폰/디지털기기 백인성 fxman@fnnews.com&nbsp; \r\n"
				+ "조선일보 휴대폰/디지털기기 이동훈 ﬂatron2@chosun.com \r\n"
				+ "블로터닷넷 휴대폰/디지털기기 도안구 eyeball@bloter.net \r\n"
				+ "아이뉴스 24 휴대폰/디지털기기 강은성 esther@inews24.com \r\n"
				+ "전자신문 휴대폰/디지털기기 조중혁 doimoi00@gmail.com \r\n"
				+ "지디넷코리아 휴대폰/디지털기기 황치규 delight@zdnet.co.kr \r\n"
				+ "조선일보 휴대폰/디지털기기 정진영 cya@chosun.com \r\n"
				+ "한겨례 휴대폰/디지털기기 최성진 csj@hani.co.kr \r\n"
				+ "아이뉴스 24 휴대폰/디지털기기 강호성 chaosing@inews24.com \r\n"
				+ "지디넷코리아 휴대폰/디지털기기 최병준 ccbbjj@zdnet.co.kr \r\n"
				+ "디지털타임스 휴대폰/디지털기기 이형근 bruprin@gmail.com \r\n"
				+ "전자신문 휴대폰/디지털기기 이성현 argos@etnews.co.kr \r\n"
				+ "디지털타임스 IT 정유진 yjin@dt.co.kr \r\n"
				+ "디지털타임스 IT 허우영 yenny@dt.co.kr \r\n"
				+ "지디넷코리아 IT 김태정 tjkim@zdnet.co.kr \r\n"
				+ "뉴시스경제 IT 김정남 surrender@newsis.com \r\n"
				+ "전자신문 IT 김원석 stone201@etnews.co.kr \r\n"
				+ "한국경제 IT 문혜정 selenmoon@hankyung.com \r\n"
				+ "한국경제 IT 박영태 pyt@hankyung.com \r\n"
				+ "디지털데일리 IT 한주엽 powerusr@ddaily.co.kr \r\n"
				+ "프라임경제 IT 나원재 nwj@newsprime.co.kr \r\n"
				+ "경제투데이 IT 김남규 ngkim@eto.co.kr \r\n"
				+ "아시아투데이 IT 정석만 naﬂnaﬂ@asiatoday.co.kr \r\n"
				+ "디지털타임스 IT 강희종 mindle@dt.co.kr \r\n"
				+ "헤럴드생생뉴스 IT 이권형 kwonhl@heraldm.com \r\n"
				+ "경제투데이 IT 김태균 ksgit@eto.co.kr \r\n"
				+ "경제투데이 IT 한지운 juhan@eto.co.kr \r\n"
				+ "디지털타임스 IT 박지성 jspark@dt.co.kr \r\n"
				+ "전자신문 IT 김준배 joon@etnews.co.kr \r\n"
				+ "아시아경제 IT 조강욱 jomarok@asiae.co.kr \r\n"
				+ "아시아투데이 IT 김효정 jhkim@asiatoday.co.kr \r\n"
				+ "이데일리 IT 신혜리 hyeree@ \r\n"
				+ "아주경제 IT 윤혜미 hm@ajnews.co.kr \r\n"
				+ "헤럴드경제 IT 황혜진 hhj6386@heraldm.com \r\n"
				+ "아시아경제 IT 이승종 hanarum@asiae.co.kr \r\n"
				+ "이투데이 It 최재혁 freshphase@etoday.co.kr \r\n"
				+ "디지털타임스 IT 심화영 dorothy@dt.co.kr \r\n"
				+ "한국경제 IT 김동훈 DHK@hankyung.com \r\n"
				+ "아이티투데이 IT 최고야 cky@ittoday.co.kr \r\n"
				+ "아이뉴스 24 IT 박웅서 ckoudpark@inews24.com \r\n"
				+ "뉴시스 IT 정옥주 channa224@newsis.com \r\n"
				+ "지디넷코리아 IT 봉성창 bong@zdnet.co.kr \r\n"
				+ "보안뉴스 IT 김정완 boan3@boannews.com \r\n"
				+ "아주경제 It 조영빈 agamee81@ajnews.co.kr \r\n"
				+ "산업뉴스 IT 박영국 24pyk@ebn.co.kr \r\n"
				+ "디지털데일리 IT 이상일 2401@ddaily.co.kr \r\n"
				+ "아이뉴스 24 IT/통신방송 박정일 comja@inews24.com \r\n"
				+ "이데일리 IT 산업 동향/정책 지영한 yhji@edaily.co.kr \r\n"
				+ "한국경제 IT 산업 동향/정책 서기열 philos@hankyung.com \r\n"
				+ "동아일보 IT 산업 동향/정책 이헌진 mungchii@donga.com \r\n"
				+ "연합뉴스 IT 산업 동향/정책 인교준 kjihn@yna.co.kr \r\n"
				+ "연합뉴스 IT 산업 동향/정책 홍제성 jsa@yna.co.kr \r\n"
				+ "연합뉴스 IT 산업 동향/정책 김재홍 jaehong@yna.co.kr \r\n"
				+ "연합뉴스 IT 산업 동향/정책 김지훈 hoonkim@yna.co.kr \r\n"
				+ "연합뉴스 IT 산업 동향/정책 함보현 hanarmdri@yna.co.kr \r\n"
				+ "머니투데이 IT 산업동향/정책 김성현 sean@moneytoday.co.kr \r\n"
				+ "머니투데이 IT 산업동향/정책 정현수 gustn99@moneytoday.co.kr \r\n"
				+ "SBSTV IT 산업동향/정책 표언구 eungoo@sbs.co.kr \r\n"
				+ "헤럴드 IT 산업동향/정책 김상수 dlcw@heraldm.com \r\n"
				+ "머니투데이 IT 산업동향/정책 김경미 camille@moneytoday.co.kr \r\n"
				+ "아이뉴스 24 IT 산업동향/정책 서정근 antilaw@inews24.com \r\n"
				+ "아시아투데이 김옥빈 obkim5153@hanmail.net \r\n"
				+ "매경헬스 없음 이상미 lsmclick@mkhealth.co.kr \r\n"
				+ "블로터닷넷 없음 주민영 ezoomin@bloter.net \r\n"
				+ "매일경제 없음 황시영 @shinyandloose";
		
		// 1. 어떤 이메일 도메인(yna.co.kr,hankyung.com 등)이
		// 몇 개씩 있는지 세어서 출력해보기
		
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		
		Pattern mailPattern = Pattern.compile(".co.kr");
		
		Matcher mailMatcher = mailPattern.matcher(reporters);
		
		while (mailMatcher.find()) {
			System.out.println(mailMatcher.group(0));
			
			if(mailMatcher.group(0).equals(".co.kr")) {
				count++;
			}
		}
		System.out.println(".co.kr의 개수는 " + count);
		
		System.out.println("------------------------------");
		
		// 2. 어떤 신문사의 기자가 몇 명씩 있는지 세어서 출력해보기
		
		Pattern namePattern = Pattern.compile("([가-힣]*)(일보)");
		
		Matcher nameMatcher = namePattern.matcher(reporters);
		
		while (nameMatcher.find()) {
			System.out.println(nameMatcher.group(1));
			
			if(nameMatcher.group(1).equals("국민")) {
				count2++;
			}
		}
		System.out.println("국민일보의 기자는 총" + count2 + "명");
		
		System.out.println("------------------------------");
		
		// 3. 어떤 분야의 기자가 몇 명씩 있는지 세어서 출력해보기
		
		Pattern fieldPattern = Pattern.compile("([가-힣]*)(/[가-힣]*)");
		
		Matcher fieldMatcher = fieldPattern.matcher(reporters);
		
		while (fieldMatcher.find()) {
			System.out.println(fieldMatcher.group(0));
			
			if(fieldMatcher.group(0).equals("휴대폰/디지털기기")) {
				count3++;
			}
		}
		System.out.println("휴대폰/디지털기기 분야의 기자는 총" + count3 + "명");
	
	}
	
	
	
	
	
	
	
	
}
