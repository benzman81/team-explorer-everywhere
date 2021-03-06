// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildinfo._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildinfo._03._BuildStoreWebServiceSoap_GetTestResultsForBuildResponse;
import ms.tfs.build.buildinfo._03._TestResultData;

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
public class _BuildStoreWebServiceSoap_GetTestResultsForBuildResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _TestResultData[] getTestResultsForBuildResult;

    public _BuildStoreWebServiceSoap_GetTestResultsForBuildResponse()
    {
        super();
    }

    public _BuildStoreWebServiceSoap_GetTestResultsForBuildResponse(
        final _TestResultData[] getTestResultsForBuildResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetTestResultsForBuildResult(getTestResultsForBuildResult);
    }

    public _TestResultData[] getGetTestResultsForBuildResult()
    {
        return this.getTestResultsForBuildResult;
    }

    public void setGetTestResultsForBuildResult(_TestResultData[] value)
    {
        this.getTestResultsForBuildResult = value;
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

                if (localName.equalsIgnoreCase("GetTestResultsForBuildResult"))
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
                            _TestResultData complexObject0 = new _TestResultData();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.getTestResultsForBuildResult = (_TestResultData[]) list0.toArray(
                                new _TestResultData[list0.size()]);
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
