import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NewEggObjects {
    public final SelenideElement modalBtnClose = $("button.close");
    public final SelenideElement searchBtn = $("button.ico");
    public final SelenideElement searchField = $(".header2021-search-box [type=search]");
    public final SelenideElement cookiesBtnClose = $("button.onetrust-close-btn-handler");
    public final SelenideElement itemBtn = $(".item-button-area > button");
    public final SelenideElement goToCartBtn = $(".item-actions .btn");
    public final SelenideElement itemTitle = $(".items-grid-view .item-title");
    public final SelenideElement cartItemTitle = $(".item-title");

}
