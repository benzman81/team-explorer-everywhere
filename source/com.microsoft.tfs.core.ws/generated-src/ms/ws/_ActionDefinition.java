// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.ws;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.ws._ActionDefinition;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ActionDefinition
    implements ElementSerializable, ElementDeserializable
{
    // Attributes
    protected int bit;
    protected String name;
    protected String displayName;

    // No elements    
    public _ActionDefinition()
    {
        super();
    }

    public _ActionDefinition(
        final int bit,
        final String name,
        final String displayName)
    {
        // TODO : Call super() instead of setting all fields directly?
        setBit(bit);
        setName(name);
        setDisplayName(displayName);
    }

    public int getBit()
    {
        return this.bit;
    }

    public void setBit(final int value)
    {
        this.bit = value;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(final String value)
    {
        this.name = value;
    }

    public String getDisplayName()
    {
        return this.displayName;
    }

    public void setDisplayName(final String value)
    {
        this.displayName = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Attributes
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "bit",
            this.bit);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "name",
            this.name);
        XMLStreamWriterHelper.writeAttribute(
            writer,
            "displayName",
            this.displayName);

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // Attributes
        final int attributeCount = reader.getAttributeCount();
        String attributeValue;

        for (int i = 0; i < attributeCount; i++)
        {
            localName = reader.getAttributeLocalName(i);
            attributeValue = reader.getAttributeValue(i);

            if (localName.equalsIgnoreCase("bit"))
            {
                this.bit = XMLConvert.toInt(attributeValue);
            }
            else if (localName.equalsIgnoreCase("name"))
            {
                this.name = attributeValue;
            }
            else if (localName.equalsIgnoreCase("displayName"))
            {
                this.displayName = attributeValue;
            }

            // Ignore unknown attributes.
        }

        // This object uses no elements, so read until our element end
        XMLStreamReaderHelper.readUntilElementEnd(reader);
    }
}