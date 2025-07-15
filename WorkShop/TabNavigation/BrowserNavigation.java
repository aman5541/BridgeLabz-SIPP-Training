package WorkShop.TabNavigation;

import java.util.Stack;

class BrowserTab implements Navigation {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage;

    public BrowserTab(String homePage) {
        currentPage = homePage;
        System.out.println("Start at: " + currentPage);
    }

    public void visit(String url) {
        backStack.push(currentPage);
        forwardStack.clear(); 
        currentPage = url;
        System.out.println("Visited: " + currentPage);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No forward history.");
        }
    }
}





