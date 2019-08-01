(ns org.nd4j.nativeblas.Nd4jCuda$NDIndex
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
  (:import [org.nd4j.nativeblas Nd4jCuda$NDIndex]))

(defn ->nd-index
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$NDIndex [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$NDIndex p))
  (^Nd4jCuda$NDIndex []
    (new Nd4jCuda$NDIndex )))

(defn *all
  "returns: `org.nd4j.nativeblas.Nd4jCuda$NDIndex`"
  (^org.nd4j.nativeblas.Nd4jCuda$NDIndex []
    (Nd4jCuda$NDIndex/all )))

(defn *point
  "pt - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$NDIndex`"
  (^org.nd4j.nativeblas.Nd4jCuda$NDIndex [^Long pt]
    (Nd4jCuda$NDIndex/point pt)))

(defn *interval
  "stride - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$NDIndex interval((value="Nd4jLong") long start, (value="Nd4jLong") long end, @`"
  ([^Long stride]
    (Nd4jCuda$NDIndex/interval stride)))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$NDIndex`"
  (^org.nd4j.nativeblas.Nd4jCuda$NDIndex [^Nd4jCuda$NDIndex this ^Long position]
    (-> this (.position position))))

(defn is-all
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$NDIndex this]
    (-> this (.isAll))))

(defn is-point
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$NDIndex this]
    (-> this (.isPoint))))

(defn get-indices
  "returns: `(value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCuda$NDIndex this]
    (-> this (.getIndices))))

(defn stride
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$NDIndex this]
    (-> this (.stride))))

