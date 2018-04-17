/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.scryfall.api.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CardList model.
 */
public class CardList {
    /**
     * The totalCards property.
     */
    @JsonProperty(value = "total_cards")
    private Integer totalCards;

    /**
     * The hasMore property.
     */
    @JsonProperty(value = "has_more")
    private Boolean hasMore;

    /**
     * The nextPage property.
     */
    @JsonProperty(value = "next_page")
    private String nextPage;

    /**
     * The data property.
     */
    @JsonProperty(value = "data")
    private List<Card> data;

    /**
     * Get the totalCards value.
     *
     * @return the totalCards value
     */
    public Integer totalCards() {
        return this.totalCards;
    }

    /**
     * Set the totalCards value.
     *
     * @param totalCards the totalCards value to set
     * @return the CardList object itself.
     */
    public CardList withTotalCards(Integer totalCards) {
        this.totalCards = totalCards;
        return this;
    }

    /**
     * Get the hasMore value.
     *
     * @return the hasMore value
     */
    public Boolean hasMore() {
        return this.hasMore;
    }

    /**
     * Set the hasMore value.
     *
     * @param hasMore the hasMore value to set
     * @return the CardList object itself.
     */
    public CardList withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * Get the nextPage value.
     *
     * @return the nextPage value
     */
    public String nextPage() {
        return this.nextPage;
    }

    /**
     * Set the nextPage value.
     *
     * @param nextPage the nextPage value to set
     * @return the CardList object itself.
     */
    public CardList withNextPage(String nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    /**
     * Get the data value.
     *
     * @return the data value
     */
    public List<Card> data() {
        return this.data;
    }

    /**
     * Set the data value.
     *
     * @param data the data value to set
     * @return the CardList object itself.
     */
    public CardList withData(List<Card> data) {
        this.data = data;
        return this;
    }

}
