import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class NewEggTest {

    NewEggObjects page = new NewEggObjects();
    String TEST_URL = "https://www.newegg.com/";

    @BeforeTest
    public void setUp() {
        open(TEST_URL);
        page.modalBtnClose.click();
        page.cookiesBtnClose.click();
    }

    @Test
    public void addItemToCartThroughSearch() {
        page.searchField.shouldBe(Condition.visible);
        page.searchField.click();
        page.searchField.sendKeys("raid enclosure rack mount");
        page.searchBtn.click();
        String itemTitle = page.itemTitle.getText();
        page.itemBtn.click();
        page.goToCartBtn.click();
        String cartItemTitle =  page.cartItemTitle.getText();
        assertThat(itemTitle).as("Added item is the same at the cart.").contains(cartItemTitle);
    }
}