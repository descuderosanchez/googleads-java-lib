// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremiumRateError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PremiumRateError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_RATE_TYPE"/>
 *     &lt;enumeration value="INVALID_PRICING_METHOD"/>
 *     &lt;enumeration value="INVALID_PREMIUM_FEATURE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PremiumRateError.Reason")
@XmlEnum
public enum PremiumRateErrorReason {


    /**
     * 
     *                 The rate type of the {@link PremiumRateValue} is invalid.
     *               
     * 
     */
    INVALID_RATE_TYPE,

    /**
     * 
     *                 The pricing method of the {@link PremiumRate} is invalid.
     *               
     * 
     */
    INVALID_PRICING_METHOD,

    /**
     * 
     *                 The premium feature of the {@link PremiumRate} is invalid.
     *               
     * 
     */
    INVALID_PREMIUM_FEATURE,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static PremiumRateErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
