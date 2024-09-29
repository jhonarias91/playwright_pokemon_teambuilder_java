package com.jhonarias91;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.jhonarias91.models.PokemonTeam;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    private static final boolean IS_HEADLESS = true;

    protected Playwright playwright;
    protected Browser browser;
    protected Page page;
    protected PokemonTeam data;

    @BeforeAll
    public void beforeAll() throws IOException {
        this.playwright = Playwright.create();
        this.browser = playwright
                .chromium()
                .launch(new BrowserType
                        .LaunchOptions()
                        .setHeadless(IS_HEADLESS)
                        .setSlowMo(1));
        this.page = browser.newPage();
    }

    protected void readData(String dataPath) throws IOException {

        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader(dataPath));
            this.data = gson.fromJson(reader, PokemonTeam.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
