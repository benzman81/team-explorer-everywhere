// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.wss;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.types.AnyContentType;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.wss._ListsSoap_UpdateListItemsWithKnowledge;

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
public class _ListsSoap_UpdateListItemsWithKnowledge
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String listName;
    protected AnyContentType updates;
    protected String syncScope;
    protected AnyContentType knowledge;

    public _ListsSoap_UpdateListItemsWithKnowledge()
    {
        super();
    }

    public _ListsSoap_UpdateListItemsWithKnowledge(
        final String listName,
        final AnyContentType updates,
        final String syncScope,
        final AnyContentType knowledge)
    {
        // TODO : Call super() instead of setting all fields directly?
        setListName(listName);
        setUpdates(updates);
        setSyncScope(syncScope);
        setKnowledge(knowledge);
    }

    public String getListName()
    {
        return this.listName;
    }

    public void setListName(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'listName' is a required element, its value cannot be null");
        }

        this.listName = value;
    }

    public AnyContentType getUpdates()
    {
        return this.updates;
    }

    public void setUpdates(AnyContentType value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'updates' is a required element, its value cannot be null");
        }

        this.updates = value;
    }

    public String getSyncScope()
    {
        return this.syncScope;
    }

    public void setSyncScope(String value)
    {
        this.syncScope = value;
    }

    public AnyContentType getKnowledge()
    {
        return this.knowledge;
    }

    public void setKnowledge(AnyContentType value)
    {
        this.knowledge = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "listName",
            this.listName);
        this.updates.writeAsElement(
            writer,
            "updates");
        XMLStreamWriterHelper.writeElement(
            writer,
            "syncScope",
            this.syncScope);
        this.knowledge.writeAsElement(
            writer,
            "knowledge");

        writer.writeEndElement();
    }
}