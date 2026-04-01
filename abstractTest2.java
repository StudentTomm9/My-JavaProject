package training4chapter;

public class abstractTest2 {
    static void main(String[] args) {
        tableTennisAthlete a1 = new tableTennisAthlete("邓超",45);
        tableTennisCoach c1 = new tableTennisCoach("刘国梁",60);
        basketballAthlete a2 = new basketballAthlete("乐邦詹士",42);
        basketballCoach c2 = new basketballCoach("乔丹",70);
        a1.sport();a1.English();c1.sport();c1.English();
        a2.sport();c2.sport();
    }
}
