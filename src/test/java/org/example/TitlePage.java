package org.example;

import org.testng.annotations.Test;

public class TitlePage extends HelperClass{

    @Test
    public void titlefetch(){

        String title = getDriver().getTitle();
        System.out.println(title);
    }


}
