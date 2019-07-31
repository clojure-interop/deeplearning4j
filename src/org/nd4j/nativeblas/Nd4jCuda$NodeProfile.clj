(ns org.nd4j.nativeblas.Nd4jCuda$NodeProfile
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
  (:import [org.nd4j.nativeblas Nd4jCuda$NodeProfile]))

(defn ->node-profile
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$NodeProfile [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$NodeProfile p))
  (^Nd4jCuda$NodeProfile []
    (new Nd4jCuda$NodeProfile )))

(defn set-total-time
  "time - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long time]
    (-> this (.setTotalTime time))))

(defn set-objects-size
  "bytes - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long bytes]
    (-> this (.setObjectsSize bytes))))

(defn assign
  "other - `org.nd4j.nativeblas.Nd4jCuda$NodeProfile`"
  ([^Nd4jCuda$NodeProfile this ^org.nd4j.nativeblas.Nd4jCuda$NodeProfile other]
    (-> this (.assign other))))

(defn get-temporary-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$NodeProfile this]
    (-> this (.getTemporarySize))))

(defn set-shape-function-time
  "time - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long time]
    (-> this (.setShapeFunctionTime time))))

(defn set-build-time
  "time - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long time]
    (-> this (.setBuildTime time))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$NodeProfile`"
  (^org.nd4j.nativeblas.Nd4jCuda$NodeProfile [^Nd4jCuda$NodeProfile this ^Long position]
    (-> this (.position position))))

(defn print-out
  ""
  ([^Nd4jCuda$NodeProfile this]
    (-> this (.printOut))))

(defn get-total-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$NodeProfile this]
    (-> this (.getTotalSize))))

(defn name
  "returns: `(value={"char*","std::string*"})  org.bytedeco.javacpp.BytePointer`"
  ([^Nd4jCuda$NodeProfile this]
    (-> this (.name))))

(defn set-total-size
  "bytes - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long bytes]
    (-> this (.setTotalSize bytes))))

(defn set-array-time
  "time - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long time]
    (-> this (.setArrayTime time))))

(defn get-objects-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$NodeProfile this]
    (-> this (.getObjectsSize))))

(defn set-activations-size
  "bytes - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long bytes]
    (-> this (.setActivationsSize bytes))))

(defn set-input-time
  "time - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long time]
    (-> this (.setInputTime time))))

(defn set-execution-time
  "time - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long time]
    (-> this (.setExecutionTime time))))

(defn get-activations-size
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$NodeProfile this]
    (-> this (.getActivationsSize))))

(defn set-temporary-size
  "bytes - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long bytes]
    (-> this (.setTemporarySize bytes))))

(defn set-preparation-time
  "time - `long`"
  ([^Nd4jCuda$NodeProfile this ^Long time]
    (-> this (.setPreparationTime time))))

(defn merge
  "other - `org.nd4j.nativeblas.Nd4jCuda$NodeProfile`"
  ([^Nd4jCuda$NodeProfile this ^org.nd4j.nativeblas.Nd4jCuda$NodeProfile other]
    (-> this (.merge other))))

