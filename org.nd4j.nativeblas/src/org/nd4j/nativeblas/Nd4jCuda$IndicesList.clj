(ns org.nd4j.nativeblas.Nd4jCuda$IndicesList
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
  (:import [org.nd4j.nativeblas Nd4jCuda$IndicesList]))

(defn ->indices-list
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$IndicesList [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$IndicesList p)))

(defn size
  "returns: `int`"
  (^Integer [^Nd4jCuda$IndicesList this]
    (-> this (.size))))

(defn at
  "idx - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$NDIndex`"
  (^org.nd4j.nativeblas.Nd4jCuda$NDIndex [^Nd4jCuda$IndicesList this ^Integer idx]
    (-> this (.at idx))))

(defn push-back
  "idx - `org.nd4j.nativeblas.Nd4jCuda$NDIndex`"
  ([^Nd4jCuda$IndicesList this ^org.nd4j.nativeblas.Nd4jCuda$NDIndex idx]
    (-> this (.push_back idx))))

(defn is-scalar
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$IndicesList this]
    (-> this (.isScalar))))

