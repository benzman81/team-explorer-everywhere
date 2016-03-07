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

import ms.tfs.build.buildservice._03._AdministrationWebServiceSoap_AddBuildControllersResponse;
import ms.tfs.build.buildservice._03._BuildController;
import ms.tfs.build.buildservice._03._ControllerStatus;

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
public class _AdministrationWebServiceSoap_AddBuildControllersResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildController[] addBuildControllersResult;

    public _AdministrationWebServiceSoap_AddBuildControllersResponse()
    {
        super();
    }

    public _AdministrationWebServiceSoap_AddBuildControllersResponse(
        final _BuildController[] addBuildControllersResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setAddBuildControllersResult(addBuildControllersResult);
    }

    public _BuildController[] getAddBuildControllersResult()
    {
        return this.addBuildControllersResult;
    }

    public void setAddBuildControllersResult(_BuildController[] value)
    {
        this.addBuildControllersResult = value;
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

                if (localName.equalsIgnoreCase("AddBuildControllersResult"))
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
                            _BuildController complexObject0 = new _BuildController();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.addBuildControllersResult = (_BuildController[]) list0.toArray(
                            new _BuildController[list0.size()]);
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