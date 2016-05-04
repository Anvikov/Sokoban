package com.javarush.test.level28.lesson15.big01.view;

import com.javarush.test.level28.lesson15.big01.Controller;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by User on 023 2016.03.23..
 */
public class HtmlView implements View {
    Controller controller;
    private final String filePath = "./src/" + this.getClass().getPackage().getName().replace('.', '/') + "/vacancies.html";

    @Override
    public void update(List<Vacancy> vacancies) {
        try {
            updateFile(getUpdatedFileContent(vacancies));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Some exception occurred");
        }
    }

    protected Document getDocument() throws IOException {
        Document document= Jsoup.parse(new File(filePath),"UTF-8");
        return document;
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void userCitySelectEmulationMethod() {
        controller.onCitySelect("Odessa");
    }

    private String getUpdatedFileContent(List<Vacancy> vacancies) throws IOException{
        Document document = getDocument();
        Element elementWithClassTemplate = document.getElementsByClass("template").first();
        Element copyOfElementTemplates = elementWithClassTemplate.clone();
        copyOfElementTemplates.removeClass("template").removeAttr("style");
        document.getElementsByAttributeValue("class", "vacancy").remove();
        for (Vacancy vacancy: vacancies){
            Element clone = copyOfElementTemplates.clone();
            clone.getElementsByAttributeValue("class","city").get(0).text(vacancy.getCity());
            clone.getElementsByAttributeValue("class", "companyName").get(0).text(vacancy.getCompanyName());
            clone.getElementsByAttributeValue("class", "salary").get(0).text(vacancy.getSalary());
            Element link = clone.getElementsByTag("a").get(0);
            link.text(vacancy.getTitle());
            link.attr("href", vacancy.getUrl());
            elementWithClassTemplate.before(clone.outerHtml());
        }
        return document.html();
    }

    private void updateFile(String string) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(string);
        fileWriter.close();
    }

}
