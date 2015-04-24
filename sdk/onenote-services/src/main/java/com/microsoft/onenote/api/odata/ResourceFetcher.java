/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.onenote.api.odata;

import com.microsoft.onenote.api.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.*;
import com.microsoft.services.odata.Readable;
import com.microsoft.services.odata.interfaces.*;

/**
 * The type  ResourceFetcher.
 */
public class ResourceFetcher extends ODataMediaEntityFetcher<Resource,ResourceOperations> 
                                     implements Readable<Resource> {

     /**
     * Instantiates a new ResourceFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ResourceFetcher(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent, Resource.class, ResourceOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ResourceFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ResourceFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

        
}