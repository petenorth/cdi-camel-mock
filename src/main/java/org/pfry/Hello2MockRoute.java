/*
 * Copyright 2005-2015 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.pfry;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cdi.ContextName;

/**
 * Configures all our Camel routes, components, endpoints and beans
 */
@ContextName("hello2Camel")
public class Hello2MockRoute extends RouteBuilder {	

    @Override
    public void configure() throws Exception {

	     from("cxf://http://0.0.0.0:8080/hello2ws?wsdlURL=wsdl/helloworld2.wsdl&dataFormat=MESSAGE").id("hello2Route")
	    .to("language:constant:resource:classpath:/hello2.xml");
    }

}
