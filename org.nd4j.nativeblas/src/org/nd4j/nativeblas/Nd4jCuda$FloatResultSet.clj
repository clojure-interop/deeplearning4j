(ns org.nd4j.nativeblas.Nd4jCuda$FloatResultSet
  "Copyright (c) 2015-2018 Skymind, Inc.
 This program and the accompanying materials are made available under the
 terms of the Apache License, Version 2.0 which is available at
 https://www.apache.org/licenses/LICENSE-2.0.
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT
 WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 License for the specific language governing permissions and limitations
 under the License.
 SPDX-License-Identifier: Apache-2.0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$FloatResultSet]))

(defn ->float-result-set
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$FloatResultSet [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$FloatResultSet p))
  (^Nd4jCuda$FloatResultSet []
    (new Nd4jCuda$FloatResultSet )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatResultSet`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatResultSet [^Nd4jCuda$FloatResultSet this ^Long position]
    (-> this (.position position))))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCuda$FloatResultSet this]
    (-> this (.size))))

(defn at
  "idx - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  (^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray [^Nd4jCuda$FloatResultSet this ^Long idx]
    (-> this (.at idx))))

(defn push-back
  "array - `org.nd4j.nativeblas.Nd4jCuda$FloatNDArray`"
  ([^Nd4jCuda$FloatResultSet this ^org.nd4j.nativeblas.Nd4jCuda$FloatNDArray array]
    (-> this (.push_back array))))

(defn status
  "returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$FloatResultSet this]
    (-> this (.status))))

(defn set-status
  "status - `int`"
  ([^Nd4jCuda$FloatResultSet this ^Integer status]
    (-> this (.setStatus status))))

(defn purge
  ""
  ([^Nd4jCuda$FloatResultSet this]
    (-> this (.purge))))

(defn set-non-removable
  ""
  ([^Nd4jCuda$FloatResultSet this]
    (-> this (.setNonRemovable))))

