import com.microsoft.playwright.*;

public class TestScenario {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            // Step 1: Navigate to Epam website
            page.navigate("https://www.epam.com/");

// Step 2: Select "Services" from header menu
page.click("text=Services");

            browser.close();
        }
    }
}