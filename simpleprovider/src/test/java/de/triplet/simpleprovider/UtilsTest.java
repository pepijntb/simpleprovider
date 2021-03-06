package de.triplet.simpleprovider;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class UtilsTest {

    @Test
    public void pluralize() {
        String expected = "whiskies";
        String actual = Utils.pluralize("Whisky");
        assertThat(actual).isEqualTo(expected);

        expected = "ytitties";
        actual = Utils.pluralize("YTitty");
        assertThat(actual).isEqualTo(expected);

        expected = "ways";
        actual = Utils.pluralize("Way");
        assertThat(actual).isEqualTo(expected);

        expected = "boys";
        actual = Utils.pluralize("Boy");
        assertThat(actual).isEqualTo(expected);

        expected = "journeys";
        actual = Utils.pluralize("Journey");
        assertThat(actual).isEqualTo(expected);

        expected = "beers";
        actual = Utils.pluralize("Beer");
        assertThat(actual).isEqualTo(expected);

        expected = "ballantines";
        actual = Utils.pluralize("Ballantines");
        assertThat(actual).isEqualTo(expected);
    }

}
