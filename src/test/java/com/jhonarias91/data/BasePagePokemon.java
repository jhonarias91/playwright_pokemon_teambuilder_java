package com.jhonarias91.data;

import com.microsoft.playwright.Page;

public class BasePagePokemon {

    protected Page page;

    public BasePagePokemon(Page page){
        this.page = page;
    }
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

}
