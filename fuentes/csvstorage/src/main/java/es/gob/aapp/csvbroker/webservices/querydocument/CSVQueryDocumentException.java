/*
 * Copyright (C) 2012-13 MINHAP, Gobierno de España This program is licensed and may be used,
 * modified and redistributed under the terms of the European Public License (EUPL), either version
 * 1.1 or (at your option) any later version as soon as they are approved by the European
 * Commission. Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * more details. You should have received a copy of the EUPL1.1 license along with this program; if
 * not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */


package es.gob.aapp.csvbroker.webservices.querydocument;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1 2017-05-17T16:41:44.624+02:00 Generated source
 * version: 3.0.1
 */

@WebFault(name = "errorInfo",
    targetNamespace = "urn:es:gob:aapp:csvbroker:webservices:querydocument:model:v1.0")
public class CSVQueryDocumentException extends Exception {

  private static final long serialVersionUID = 1L;
  private es.gob.aapp.csvbroker.webservices.querydocument.model.v1.CsvQueryDocumentException errorInfo;

  public CSVQueryDocumentException() {
    super();
  }

  public CSVQueryDocumentException(String message) {
    super(message);
  }

  public CSVQueryDocumentException(String message, Throwable cause) {
    super(message, cause);
  }

  public CSVQueryDocumentException(String message,
      es.gob.aapp.csvbroker.webservices.querydocument.model.v1.CsvQueryDocumentException errorInfo) {
    super(message);
    this.errorInfo = errorInfo;
  }

  public CSVQueryDocumentException(String message,
      es.gob.aapp.csvbroker.webservices.querydocument.model.v1.CsvQueryDocumentException errorInfo,
      Throwable cause) {
    super(message, cause);
    this.errorInfo = errorInfo;
  }

  public es.gob.aapp.csvbroker.webservices.querydocument.model.v1.CsvQueryDocumentException getFaultInfo() {
    return this.errorInfo;
  }
}
