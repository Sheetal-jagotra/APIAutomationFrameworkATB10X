package com.SheetalJagotra.Assert;

import com.beust.jcommander.StringKey;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

public class AssertionActions {

    public void verifyStringKey(String KeyExpected , StringKey KeyActual){
     assertThat(KeyExpected).isNotNull();
     assertThat(KeyExpected).isNotEmpty();
    }

}
