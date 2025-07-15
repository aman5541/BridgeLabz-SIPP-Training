package WorkShop.TabNavigation;

public class MainNevigation {
    public static void main(String[] args) {
        BrowserTab tab = new BrowserTab("home.com");

        tab.visit("google.com");
        tab.visit("youtube.com");
        tab.back();         
        tab.forward();       
        tab.back();        
        tab.visit("github.com"); 
        tab.forward();       
    }
}