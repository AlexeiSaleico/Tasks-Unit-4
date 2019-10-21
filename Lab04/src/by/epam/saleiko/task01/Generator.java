package by.epam.saleiko.task01;

import by.epam.saleiko.task01.entity.*;

public class Generator {
	private static String[] names = {
			"Бобруйск","Барановичи","Борисов","Барань","Белоозерск","Береза","Березино","Березовка","Браслав","Брест","Буда-Кошелево","Быхов","Василевичи","Верхнедвинск","Ветка",
			"Вилейка","Витебск","Волковыск","Воложин","Высокое","Ганцевичи","Глубокое","Гомель","Горки","Городок","Гродно","Давид-Городок","Дзержинск","Дисна",
			"Добруш","Докшицы","Дрогичин","Дубровно","Дятлово","Ельск","Жодино","Жабинка","Житковичи","Жлобин","Заславль","Иваново","Ивацевичи","Ивье","Калинковичи","Каменец",
			"Кировск","Клецк","Климовичи","Кличев","Кобрин","Копыль","Коссово","Костюковичи","Кричев","Крупки","Лепель","Лида","Логойск","Лунинец","Любань","Ляховичи",
			"Мозырь","Малорита","Марьина Горка","Микашевичи","Минск","Миоры","Могилев","Молодечно","Мосты","Мстиславль","Мядель","Новополоцк","Наровля","Несвиж",
			"Новогрудок","Новолукомль","Орша","Осиповичи","Ошмяны","Пинск","Полоцк","Петриков","Поставы","Пружаны","Речица","Рогачев","Светлогорск","Свислочь",
			"Сенно","Скидель","Славгород","Слоним","Слуцк","Смолевичи","Сморгонь","Солигорск","Старые Дороги","Столбцы","Столин","Толочин","Туров","Узда","Фаниполь",
			"Хойники","Чаусы","Чашники","Червень","Чериков","Чечерск","Шклов","Щучин"};
	private static int maxDistrictArea = 1337;
	
	public static City generateCity()  {
		String name =names[(int)(Math.random()*names.length)];
		return new City(name);
		}
			
	public static District generateDistrict() {
		District d = new District();
		int area = (int)(Math.random() * maxDistrictArea);
		d.setArea(area);
		do {
			d.addCity(generateCity());
		}while(Math.random()<0.1);
		return d;
	}
	
	public static Region generateRegion() {
		Region r = new Region();
		do {
			r.addDistrict(generateDistrict());
		}while(Math.random()<0.8);
		return r;
	}
	
	public static Country generateCountry() {
		Country c = new Country();
		do {
			c.addRegion(generateRegion());
		}while( Math.random() < 0.5);
		return c;
	}
}

	
