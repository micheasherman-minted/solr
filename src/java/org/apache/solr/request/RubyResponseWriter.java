/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.solr.request;

import java.io.Writer;
import java.io.IOException;

import org.apache.solr.common.util.NamedList;

public class RubyResponseWriter implements QueryResponseWriter {
  static String CONTENT_TYPE_RUBY_UTF8="text/x-ruby;charset=UTF-8";

  public void init(NamedList n) {
    /* NOOP */
  }
  
 public void write(Writer writer, SolrQueryRequest req, SolrQueryResponse rsp) throws IOException {
    RubyWriter w = new RubyWriter(writer, req, rsp);
    w.writeResponse();
  }

  public String getContentType(SolrQueryRequest request, SolrQueryResponse response) {
    return CONTENT_TYPE_TEXT_UTF8;
  }
}
