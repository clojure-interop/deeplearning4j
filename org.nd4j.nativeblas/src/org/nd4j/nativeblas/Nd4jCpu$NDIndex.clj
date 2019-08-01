(ns org.nd4j.nativeblas.Nd4jCpu$NDIndex
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
  (:import [org.nd4j.nativeblas Nd4jCpu$NDIndex]))

(defn ->nd-index
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$NDIndex [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$NDIndex p))
  (^Nd4jCpu$NDIndex []
    (new Nd4jCpu$NDIndex )))

(defn *all
  "returns: `org.nd4j.nativeblas.Nd4jCpu$NDIndex`"
  (^org.nd4j.nativeblas.Nd4jCpu$NDIndex []
    (Nd4jCpu$NDIndex/all )))

(defn *point
  "pt - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$NDIndex`"
  (^org.nd4j.nativeblas.Nd4jCpu$NDIndex [^Long pt]
    (Nd4jCpu$NDIndex/point pt)))

(defn *interval
  "stride - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$NDIndex interval((value="Nd4jLong") long start, (value="Nd4jLong") long end, @`"
  ([^Long stride]
    (Nd4jCpu$NDIndex/interval stride)))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$NDIndex`"
  (^org.nd4j.nativeblas.Nd4jCpu$NDIndex [^Nd4jCpu$NDIndex this ^Long position]
    (-> this (.position position))))

(defn is-all
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$NDIndex this]
    (-> this (.isAll))))

(defn is-point
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCpu$NDIndex this]
    (-> this (.isPoint))))

(defn get-indices
  "returns: `(value="Nd4jLong*")   org.bytedeco.javacpp.LongPointer`"
  ([^Nd4jCpu$NDIndex this]
    (-> this (.getIndices))))

(defn stride
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCpu$NDIndex this]
    (-> this (.stride))))

