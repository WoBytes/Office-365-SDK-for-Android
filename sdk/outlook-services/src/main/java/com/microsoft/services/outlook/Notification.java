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
 * The type Notification.
*/
public class Notification extends Entity {

    public Notification(){
        setODataType("#Microsoft.OutlookServices.Notification");
    }
            
    private String SubscriptionId;
     
    /**
    * Gets the Subscription Id.
    *
    * @return the String
    */
    public String getSubscriptionId() {
        return this.SubscriptionId; 
    }

    /**
    * Sets the Subscription Id.
    *
    * @param value the String
    */
    public void setSubscriptionId(String value) { 
        this.SubscriptionId = value; 
        valueChanged("SubscriptionId", value);

    }
            
    private java.util.Calendar SubscriptionExpirationDateTime;
     
    /**
    * Gets the Subscription Expiration Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getSubscriptionExpirationDateTime() {
        return this.SubscriptionExpirationDateTime; 
    }

    /**
    * Sets the Subscription Expiration Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setSubscriptionExpirationDateTime(java.util.Calendar value) { 
        this.SubscriptionExpirationDateTime = value; 
        valueChanged("SubscriptionExpirationDateTime", value);

    }
            
    private Integer SequenceNumber;
     
    /**
    * Gets the Sequence Number.
    *
    * @return the Integer
    */
    public Integer getSequenceNumber() {
        return this.SequenceNumber; 
    }

    /**
    * Sets the Sequence Number.
    *
    * @param value the Integer
    */
    public void setSequenceNumber(Integer value) { 
        this.SequenceNumber = value; 
        valueChanged("SequenceNumber", value);

    }
            
    private ChangeType ChangeType;
     
    /**
    * Gets the Change Type.
    *
    * @return the ChangeType
    */
    public ChangeType getChangeType() {
        return this.ChangeType; 
    }

    /**
    * Sets the Change Type.
    *
    * @param value the ChangeType
    */
    public void setChangeType(ChangeType value) { 
        this.ChangeType = value; 
        valueChanged("ChangeType", value);

    }
            
    private String Resource;
     
    /**
    * Gets the Resource.
    *
    * @return the String
    */
    public String getResource() {
        return this.Resource; 
    }

    /**
    * Sets the Resource.
    *
    * @param value the String
    */
    public void setResource(String value) { 
        this.Resource = value; 
        valueChanged("Resource", value);

    }
            
    private Entity ResourceData;
     
    /**
    * Gets the Resource Data.
    *
    * @return the Entity
    */
    public Entity getResourceData() {
        return this.ResourceData; 
    }

    /**
    * Sets the Resource Data.
    *
    * @param value the Entity
    */
    public void setResourceData(Entity value) { 
        this.ResourceData = value; 
        valueChanged("ResourceData", value);

    }
}

