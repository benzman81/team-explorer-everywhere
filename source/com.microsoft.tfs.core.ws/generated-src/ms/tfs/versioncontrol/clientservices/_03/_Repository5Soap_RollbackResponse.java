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

import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._Conflict;
import ms.tfs.versioncontrol.clientservices._03._ConflictType;
import ms.tfs.versioncontrol.clientservices._03._Failure;
import ms.tfs.versioncontrol.clientservices._03._GetOperation;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._Repository5Soap_RollbackResponse;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._Resolution;
import ms.tfs.versioncontrol.clientservices._03._SeverityType;
import ms.tfs.versioncontrol.clientservices._03._Warning;
import ms.tfs.versioncontrol.clientservices._03._WarningType;

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
public class _Repository5Soap_RollbackResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _GetOperation[] rollbackResult;
    protected _Conflict[] conflicts;
    protected _Failure[] failures;
    protected int changePendedFlags;

    public _Repository5Soap_RollbackResponse()
    {
        super();
    }

    public _Repository5Soap_RollbackResponse(
        final _GetOperation[] rollbackResult,
        final _Conflict[] conflicts,
        final _Failure[] failures,
        final int changePendedFlags)
    {
        // TODO : Call super() instead of setting all fields directly?
        setRollbackResult(rollbackResult);
        setConflicts(conflicts);
        setFailures(failures);
        setChangePendedFlags(changePendedFlags);
    }

    public _GetOperation[] getRollbackResult()
    {
        return this.rollbackResult;
    }

    public void setRollbackResult(_GetOperation[] value)
    {
        this.rollbackResult = value;
    }

    public _Conflict[] getConflicts()
    {
        return this.conflicts;
    }

    public void setConflicts(_Conflict[] value)
    {
        this.conflicts = value;
    }

    public _Failure[] getFailures()
    {
        return this.failures;
    }

    public void setFailures(_Failure[] value)
    {
        this.failures = value;
    }

    public int getChangePendedFlags()
    {
        return this.changePendedFlags;
    }

    public void setChangePendedFlags(int value)
    {
        this.changePendedFlags = value;
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

                if (localName.equalsIgnoreCase("RollbackResult"))
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
                            _GetOperation complexObject0 = new _GetOperation();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.rollbackResult = (_GetOperation[]) list0.toArray(new _GetOperation[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("conflicts"))
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
                            _Conflict complexObject0 = new _Conflict();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.conflicts = (_Conflict[]) list0.toArray(new _Conflict[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("failures"))
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
                            _Failure complexObject0 = new _Failure();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.failures = (_Failure[]) list0.toArray(new _Failure[list0.size()]);
                }
                else if (localName.equalsIgnoreCase("changePendedFlags"))
                {
                    this.changePendedFlags = XMLConvert.toInt(reader.getElementText());
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