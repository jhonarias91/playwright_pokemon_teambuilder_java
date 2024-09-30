package com.jhonarias91.data;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class MainPagePokemon extends BasePagePokemon {

    private static final String TEAM_BUILDER_CSS_LOCATOR = "button[value='teambuilder']";

    private Locator teamBuilderBtn;

    public MainPagePokemon(Page page) {
        super(page);
        this.teamBuilderBtn = page.locator(TEAM_BUILDER_CSS_LOCATOR);
    }

    public void navigateTo(String url){
        this.page.navigate(url);
    }

    public void goToTeamBuilder(){
        this.teamBuilderBtn.click();
    }




}
