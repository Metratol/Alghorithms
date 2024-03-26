import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Navigator navigator = new NavigatorImpl();

        Route road1 = new Route( "road1", 12 , Arrays.asList("A", "B", "C"), false);
        Route road2 = new Route( "road2", 64 ,Arrays.asList("D", "C", "K"), false);
        Route road3 = new Route("road3", 12 ,Arrays.asList("Ч", "С", "П"), false);
        Route road4 = new Route("road4", 2 ,Arrays.asList("Ф", "Я", "П"), true);
        Route road125 = new Route("road125", 64 ,Arrays.asList("Ф", "У", "А"), true);
        Route road215 = new Route("road215", 100 ,Arrays.asList("A", "Z", "X", "C"), true);
        Route road2001 = new Route("road2001", 1215 ,Arrays.asList("M", "N"), true);
        Route road5215 = new Route("road5215", 12 ,Arrays.asList("K", "L", "P", "S"), true);
        Route road12 = new Route("road12", 121 ,Arrays.asList("K", "E", "M"), false);

        Route road12521 = new Route("road12521", 11.5 ,Arrays.asList("C", "D", "K", "F"), false);

        Route road000 = new Route("road000", 4 ,Arrays.asList("A", "C", "E"), false);

        navigator.addRoute(road1);
        navigator.addRoute(road2);
        navigator.addRoute(road3);
        navigator.addRoute(road12521);
        navigator.addRoute(road4);
        navigator.addRoute(road125);
        navigator.addRoute(road215);
        navigator.addRoute(road2001);
        navigator.addRoute(road5215);
        navigator.addRoute(road12);
        navigator.addRoute(road000);

        System.out.println("Присутствует ли маршрут road1: " + navigator.contains(road1));
        System.out.println("Присутствует ли маршрут road12521: " + navigator.contains(road12521));

        System.out.println("Размер: " + navigator.size());

        Route retrievedRoute = navigator.getRoute("road2");
        System.out.println("Маршрут с названием road2: " + retrievedRoute);


        navigator.chooseRoute("road3");
        navigator.chooseRoute("road3");
        navigator.chooseRoute("road3");
        navigator.chooseRoute("road3");
        navigator.chooseRoute("road1");
        navigator.chooseRoute("road1");
        navigator.chooseRoute("road1");
        navigator.chooseRoute("road12521");
        navigator.chooseRoute("road12521");
        navigator.chooseRoute("road12521");
        navigator.chooseRoute("road12");



        Iterable<Route> matchingRoutes1 = navigator.searchRoutes("A", "C");
        System.out.println("Маршруты с началом A и концом C:");
        for (Route route : matchingRoutes1) {
            System.out.println(route);
        }

        Iterable<Route> favoriteRoutes = navigator.getFavoriteRoutes("Ф");
        System.out.println("Избранные маршруты для точки Ф:");
        for (Route route : favoriteRoutes) {
            System.out.println(route);
        }

        Iterable<Route> top3Routes = navigator.getTop3Routes();
        System.out.println("Топ-3 пути:");
        for (Route route : top3Routes) {
            System.out.println(route);
        }

        navigator.removeRoute("road12521");
        System.out.println("Размер после удаления проезда: " + navigator.size());

        System.out.println(navigator.getRoute("road1"));
    }
}


