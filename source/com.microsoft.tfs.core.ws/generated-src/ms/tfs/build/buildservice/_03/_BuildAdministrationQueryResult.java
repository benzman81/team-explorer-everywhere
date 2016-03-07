// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._AgentStatus;
import ms.tfs.build.buildservice._03._BuildAdministrationQueryResult;
import ms.tfs.build.buildservice._03._BuildAgent;
import ms.tfs.build.buildservice._03._BuildController;
import ms.tfs.build.buildservice._03._BuildServiceHost;
import ms.tfs.build.buildservice._03._ControllerStatus;
import ms.tfs.build.buildservice._03._Failure;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public abstract class _BuildAdministrationQueryResult
    extends _QueryResult
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildAgent[] agents;
    protected _BuildController[] controllers;
    protected _BuildServiceHost[] serviceHosts;

    protected _BuildAdministrationQueryResult()
    {
        super();
    }

    public _BuildAgent[] getAgents()
    {
        return this.agents;
    }

    public void setAgents(_BuildAgent[] value)
    {
        this.agents = value;
    }

    public _BuildController[] getControllers()
    {
        return this.controllers;
    }

    public void setControllers(_BuildController[] value)
    {
        this.controllers = value;
    }

    public _BuildServiceHost[] getServiceHosts()
    {
        return this.serviceHosts;
    }

    public void setServiceHosts(_BuildServiceHost[] value)
    {
        this.serviceHosts = value;
    }

    /*
     * Abstract do not contain serialization methods.  Derived classes serialize the base
     * type's attributes and elements directly.
     */
}