// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._04;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._04._AdministrationServiceSoap_AddBuildAgents;
import ms.tfs.build.buildservice._04._AgentStatus;
import ms.tfs.build.buildservice._04._BuildAgent;
import ms.tfs.build.buildservice._04._PropertyValue;

import java.lang.Object;
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
public class _AdministrationServiceSoap_AddBuildAgents
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected _BuildAgent[] agents;

    public _AdministrationServiceSoap_AddBuildAgents()
    {
        super();
    }

    public _AdministrationServiceSoap_AddBuildAgents(final _BuildAgent[] agents)
    {
        // TODO : Call super() instead of setting all fields directly?
        setAgents(agents);
    }

    public _BuildAgent[] getAgents()
    {
        return this.agents;
    }

    public void setAgents(_BuildAgent[] value)
    {
        this.agents = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        if (this.agents != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("agents");

            for (int iterator0 = 0; iterator0 < this.agents.length; iterator0++)
            {
                this.agents[iterator0].writeAsElement(
                    writer,
                    "BuildAgent");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
