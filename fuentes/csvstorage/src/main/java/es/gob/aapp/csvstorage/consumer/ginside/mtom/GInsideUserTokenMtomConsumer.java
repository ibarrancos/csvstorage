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

package es.gob.aapp.csvstorage.consumer.ginside.mtom;

import es.gob.aapp.csvstorage.client.ws.ginside.model.documentoe.conversion.mtom.TipoDocumentoConversionInsideMtom;
import es.gob.aapp.csvstorage.client.ws.ginside.model.documentoe.mtom.file.DocumentoEniFileInsideMtom;
import es.gob.aapp.csvstorage.client.ws.ginside.model.validacion.documentoe.mtom.TipoDocumentoValidacionInsideMtom;
import es.gob.aapp.csvstorage.client.ws.ginside.model.validacion.documentoe.resultados.TipoResultadoValidacionDocumentoInside;
import es.gob.aapp.csvstorage.consumer.exception.ConsumerWSException;

public interface GInsideUserTokenMtomConsumer {

  TipoResultadoValidacionDocumentoInside validarDocumentoEni(
      TipoDocumentoValidacionInsideMtom documento) throws ConsumerWSException;

  DocumentoEniFileInsideMtom convertirDocumentoAEni(TipoDocumentoConversionInsideMtom documento,
      byte[] contenido, boolean firmar) throws ConsumerWSException;

}
