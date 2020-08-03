package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class GoogleTest {
    @Test
    public void githubSearchGoogleTest(){

        open("https://google.com");

        $(byName("q")).setValue("github").pressEnter();

        $("html").shouldHave(text("github"));
    }

    @Test
    public void stackoverflowSearchGoogleTest(){

        open("https://google.com");

        $(byName("q")).setValue("stack overflow").pressEnter();

        $("html").shouldHave(text("stack overflow"));
    }

    @Test
    public void intellijideaSearchGoogleTest(){

        open("https://google.com");

        $(byName("q")).setValue("intellij idea").pressEnter();

        $("html").shouldHave(text("intellij idea"));
    }

    @Test
    public void javaSearchGoogleTest(){

        open("https://google.com");

        $(byName("q")).setValue("Java").pressEnter();

        $("html").shouldHave(text("Java"));
    }

    @Test
    public void helpmeSearchGoogleTest(){

        open("https://google.com");

        $(byName("q")).setValue("Help Me").pressEnter();

        $("html").shouldHave(text("Help Me"));
    }

}
