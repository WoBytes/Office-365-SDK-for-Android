/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.outlook;





/**
 * The type Photo.
*/
public class Photo extends Entity {

    public Photo(){
        setODataType("#Microsoft.OutlookServices.Photo");
    }
            
    private Integer Height;
     
    /**
    * Gets the Height.
    *
    * @return the Integer
    */
    public Integer getHeight() {
        return this.Height; 
    }

    /**
    * Sets the Height.
    *
    * @param value the Integer
    */
    public void setHeight(Integer value) { 
        this.Height = value; 
        valueChanged("Height", value);

    }
            
    private Integer Width;
     
    /**
    * Gets the Width.
    *
    * @return the Integer
    */
    public Integer getWidth() {
        return this.Width; 
    }

    /**
    * Sets the Width.
    *
    * @param value the Integer
    */
    public void setWidth(Integer value) { 
        this.Width = value; 
        valueChanged("Width", value);

    }
}

