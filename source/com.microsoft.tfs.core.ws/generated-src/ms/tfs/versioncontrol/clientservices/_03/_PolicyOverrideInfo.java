// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._PolicyFailureInfo;
import ms.tfs.versioncontrol.clientservices._03._PolicyOverrideInfo;

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
public class _PolicyOverrideInfo
    implements ElementSerializable, ElementDeserializable
{
    // No attributes    

    // Elements
    protected String comment;
    protected _PolicyFailureInfo[] policyFailures;

    public _PolicyOverrideInfo()
    {
        super();
    }

    public _PolicyOverrideInfo(
        final String comment,
        final _PolicyFailureInfo[] policyFailures)
    {
        // TODO : Call super() instead of setting all fields directly?
        setComment(comment);
        setPolicyFailures(policyFailures);
    }

    public String getComment()
    {
        return this.comment;
    }

    public void setComment(String value)
    {
        this.comment = value;
    }

    public _PolicyFailureInfo[] getPolicyFailures()
    {
        return this.policyFailures;
    }

    public void setPolicyFailures(_PolicyFailureInfo[] value)
    {
        this.policyFailures = value;
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
            "Comment",
            this.comment);

        if (this.policyFailures != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("PolicyFailures");

            for (int iterator0 = 0; iterator0 < this.policyFailures.length; iterator0++)
            {
                this.policyFailures[iterator0].writeAsElement(
                    writer,
                    "PolicyFailureInfo");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("Comment"))
                {
                    this.comment = reader.getElementText();
                }
                else if (localName.equalsIgnoreCase("PolicyFailures"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _PolicyFailureInfo complexObject0 = new _PolicyFailureInfo();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.policyFailures = (_PolicyFailureInfo[]) list0.toArray(new _PolicyFailureInfo[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}