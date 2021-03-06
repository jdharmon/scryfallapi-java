/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.scryfall.api;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.scryfall.api.models.CardSymbolList;
import com.scryfall.api.models.ErrorException;
import com.scryfall.api.models.ManaCost;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Symbologys.
 */
public interface Symbologys {
    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CardSymbolList object if successful.
     */
    CardSymbolList getAll();

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<CardSymbolList> getAllAsync(final ServiceCallback<CardSymbolList> serviceCallback);

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CardSymbolList object
     */
    Observable<CardSymbolList> getAllAsync();

    /**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CardSymbolList object
     */
    Observable<ServiceResponse<CardSymbolList>> getAllWithServiceResponseAsync();

    /**
     *
     * @param cost the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ManaCost object if successful.
     */
    ManaCost parseMana(String cost);

    /**
     *
     * @param cost the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ManaCost> parseManaAsync(String cost, final ServiceCallback<ManaCost> serviceCallback);

    /**
     *
     * @param cost the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManaCost object
     */
    Observable<ManaCost> parseManaAsync(String cost);

    /**
     *
     * @param cost the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ManaCost object
     */
    Observable<ServiceResponse<ManaCost>> parseManaWithServiceResponseAsync(String cost);

}
